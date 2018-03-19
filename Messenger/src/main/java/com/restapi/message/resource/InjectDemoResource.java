package com.restapi.message.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/injectdemo")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class InjectDemoResource {
	
	@GET
	@Path("/annotation")
	public String getParamUsingAnnotation(@MatrixParam("param") String param,
			                              @HeaderParam("authSessionId") String header,
			                              @CookieParam("name") String cookie){
		
		return "MatrixParam : "+param+" Header : "+header+" Cookie : "+cookie; 
	}
	
	@GET
	@Path("/context")
	public String getParamUsingAnnotation(@Context UriInfo uriInfo, @Context HttpHeaders httpHeaders){
		
		String path = uriInfo.getAbsolutePath().toString();
		String cookie = httpHeaders.getCookies().toString();
		
		return "Path : "+path + "  Cookies : "+cookie;
	}
}
