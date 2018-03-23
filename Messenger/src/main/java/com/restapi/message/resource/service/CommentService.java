package com.restapi.message.resource.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.restapi.message.resource.database.DatabaseClass;
import com.restapi.message.resource.model.Comment;
import com.restapi.message.resource.model.ErrorMessage;
import com.restapi.message.resource.model.Message;

public class CommentService {
	
	private Map<Long, Message> messages = DatabaseClass.getMessage();
	
	public CommentService() {
		Comment comment1 = new Comment(1, "Good book", "Ranjan");
		Comment comment2 = new Comment(1, "Nice one", "Ranjan");
		Map<Long, Comment> comments = new HashMap<>();
		comments.put(1L, comment1);
		comments.put(2L, comment2);
		Message message = new Message();
		message.setComments(comments);
		messages.put(1L, message);
		
	}

	public List<Comment> getAllComments(long messageId) {
		Map<Long, Comment> comments = messages.get(messageId).getComments();
		return new ArrayList<Comment>(comments.values());
	}
	
	public Comment getComment(long messageId, long commentId) {
		
		ErrorMessage errorMessage = new ErrorMessage("Not Found", "500", "http://myrest.example.com");
		Response response = Response.status(Status.INTERNAL_SERVER_ERROR)
				.entity(errorMessage)
				.build();
		Message message = messages.get(messageId);
		if(message == null){
			throw new WebApplicationException(response);
		}
		
		Map<Long, Comment> comments = messages.get(messageId).getComments();
		Comment comment = comments.get(commentId);
		if(comment == null){
			throw new WebApplicationException(response);
		}
		
		return comment;
	}
	
	public Comment addComment(long messageId, Comment comment) {
		Map<Long, Comment> comments = messages.get(messageId).getComments();
		comment.setId(comments.size() + 1);
		comments.put(comment.getId(), comment);
		return comment;
	}
	
	public Comment updateComment(long messageId, Comment comment) {
		Map<Long, Comment> comments = messages.get(messageId).getComments();
		if (comment.getId() <= 0) {
			return null;
		}
		comments.put(comment.getId(), comment);
		return comment;
	}
	
	public Comment removeComment(long messageId, long commentId) {
		Map<Long, Comment> comments = messages.get(messageId).getComments();
		return comments.remove(commentId);
	}
		
}

