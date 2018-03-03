package com.enesbyc;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//Url k�sm�na /rest/send geldi�inde yap�lacaklar� belirtiyoruz.
@Path("send")
public class Service {
	
	//Url k�sm�na /rest/send geldi�inde post i�leminde yap�lacaklar� belirtiyoruz.
	//ProductName ve ProductPrice de�erlerini FormParam etiketi ile al�yoruz.
	//Burada formdan g�nderdi�imiz name de�erleri ile al�yoruz.
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public Response sendService(@FormParam("productName") String productName,
								@FormParam("productPrice") int productPrice){
		
		String result="Product Name:"+productName+" Product Price:"+productPrice;
		
		return Response.status(200).entity(result).build();
		
	}
	
}
