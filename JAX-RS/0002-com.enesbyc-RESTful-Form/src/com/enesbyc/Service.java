package com.enesbyc;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//Url kýsmýna /rest/send geldiðinde yapýlacaklarý belirtiyoruz.
@Path("send")
public class Service {
	
	//Url kýsmýna /rest/send geldiðinde post iþleminde yapýlacaklarý belirtiyoruz.
	//ProductName ve ProductPrice deðerlerini FormParam etiketi ile alýyoruz.
	//Burada formdan gönderdiðimiz name deðerleri ile alýyoruz.
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public Response sendService(@FormParam("productName") String productName,
								@FormParam("productPrice") int productPrice){
		
		String result="Product Name:"+productName+" Product Price:"+productPrice;
		
		return Response.status(200).entity(result).build();
		
	}
	
}
