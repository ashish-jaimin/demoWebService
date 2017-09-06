package com.web.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

@Path("/ftoc")
public class Ftoc {

	@GET
	@Produces("application/json")
	public Response convertFtoC() throws JSONException{
		
		JSONObject json = new JSONObject();
		double f = 98.4;
		double c;
		c=(f-32)*5/9;
		json.put("F",f);
		json.put("C",c);
		
		String result = "@Produce(\"application/json\") Output :\n\n F to C conversion : \n\n" +json;
		return Response.status(200).entity(result).build();
		
	}
}
