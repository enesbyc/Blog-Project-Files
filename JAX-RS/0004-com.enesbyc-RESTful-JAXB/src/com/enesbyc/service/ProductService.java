package com.enesbyc.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.enesbyc.model.Product;

//Url kismina /rest/product geldiginde yapilacaklari belirtiyoruz.
@Path("product")
public class ProductService {
	
	//Url kismina /rest/product/info geldiginde yapilacaklari belirtiyoruz.
	//XML tipinde veri dönecegini belirtiyoruz.
	@GET
	@Path("info")
	@Produces(MediaType.APPLICATION_XML)
	public Product getProductInfo(){
		
		Product product=new Product();
		product.setProductName("Cup");
		product.setProductPrice("25");
		
		return product;
		
	}
	
}





