package com.enesbyc.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.enesbyc.model.Product;

//Url kismina /product geldiginde yapilacaklari belirtiyoruz.
@Path("/product")
public class ProductService {
	
	//Url kismina /product/info geldiginde yapilacaklari belirtiyoruz.
	//JSON tipinde veri dönecegini belirtiyoruz.
	@GET
	@Path("/info")
	@Produces(MediaType.APPLICATION_JSON)
	public Product getProductInfo(){
		
		Product product=new Product();
		product.setProductName("Cup");
		product.setProductPrice("25");
		
		return product;
		
	}
	
}





