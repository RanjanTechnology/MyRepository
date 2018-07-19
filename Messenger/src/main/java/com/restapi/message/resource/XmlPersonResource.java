package com.restapi.message.resource;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.restapi.message.resource.model.Person;
import com.restapi.message.resource.model.Response;

@Path("/xmlmessage")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class XmlPersonResource {
	
	private static Map<Integer,Person> persons = new HashMap<Integer,Person>();
	
	@POST
    @Path("/add")
	public Response addPerson(Person p) {
		Response response = new Response();
		if(persons.get(p.getId()) != null){
			response.setStatus(false);
			response.setMessage("Person Already Exists");
			return response;
		}
		persons.put(p.getId(), p);
		response.setStatus(true);
		response.setMessage("Person created successfully");
		return response;
	}
}
