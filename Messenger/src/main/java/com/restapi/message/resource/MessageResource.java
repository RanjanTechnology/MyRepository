package com.restapi.message.resource;

import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import com.restapi.message.resource.bean.MessageFilterBean;
import com.restapi.message.resource.model.Message;
import com.restapi.message.resource.service.MessageService;


@Path("/message")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {
	
	MessageService messageService = new MessageService();
	
	@GET
	public List<Message> getMessage(@BeanParam MessageFilterBean messageFilter){
		if(messageFilter.getYear() > 0){
			return messageService.getAllMessageForYear(messageFilter.getYear());
		}
		if(messageFilter.getStart() >= 0 && messageFilter.getSize() >= 0){
			return messageService.getAllMessagePeginated(messageFilter.getStart(), messageFilter.getSize());
		}
		return messageService.getMessage();
	}
	
	
	@POST
	@Path("/addMessage")
	public Message addMessage(Message message){
		return messageService.addMessage(message);
	}
	
	@PUT
	@Path("/{messageId}")
	public Message updateMessage(@PathParam("messageId") long messageId, Message message){
		message.setId(messageId);
		return messageService.updateMessage(message);
	}
	
	@DELETE
	@Path("/{messageId}")
	public Message deleteMessage(@PathParam("messageId") long messageId){
		return messageService.removeMessage(messageId);
	}
	
	@GET
	@Path("/{messageId}")
	public Message getMessage(@PathParam("messageId") long messageId, @Context UriInfo uriInfo){
		Message message = messageService.getMessage(messageId);
		message.addLink(getUriSelf(uriInfo, message), "self");
		message.addLink(getUriProfile(uriInfo, message), "Profile");
		message.addLink(getUriComments(uriInfo, message), "Comments");
		
		return message;
	}
	
	@Path("/{messageId}/comments")
	public CommentResource getCommentResource(){
		return new CommentResource();
	}
	
	private String getUriSelf(UriInfo uriInfo, Message message) {
		String uri = uriInfo.getBaseUriBuilder()
		.path(ProfileResource.class)
		.path(message.getAuthor())
		.build().toString();
		return uri;
	}
	
	private String getUriProfile(UriInfo uriInfo, Message message) {
		String uri = uriInfo.getBaseUriBuilder()
		.path(MessageResource.class)
		.path(Long.toString(message.getId()))
		.build().toString();
		return uri;
	}
	
	private String getUriComments(UriInfo uriInfo, Message message) {
		String uri = uriInfo.getBaseUriBuilder()
		.path(MessageResource.class)
		.path(MessageResource.class,"getCommentResource")
		.path(CommentResource.class)
		.resolveTemplate("messageId", message.getId())
		.build().toString();
		return uri;
	}
}
