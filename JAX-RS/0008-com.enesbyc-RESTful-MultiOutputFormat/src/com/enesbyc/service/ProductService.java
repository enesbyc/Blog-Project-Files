package com.enesbyc.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.enesbyc.model.Product;

@Path("/product")
public class ProductService {

	
	@GET
	@Path("/info")
	@Produces({MediaType.APPLICATION_XML , MediaType.APPLICATION_JSON})
	public Response getInfo(){
		
		Product product=new Product();
		product.setProductName("Cup");
		product.setProductPrice("15");
		
		return Response.status(200).entity(product).build();
	}
}
