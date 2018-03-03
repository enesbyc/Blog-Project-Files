package com.enesbyc;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//Url k�sm�na /rest/product geldi�inde yap�lacaklar� belirtiyoruz.
@Path("product")
public class ProductService {
	
	//Url k�sm�na /rest/product/info geldi�inde yap�lacaklar� belirtiyoruz.
	//XML tipinde verilerle i�lemler yapaca��m�z� belirtiyoruz.
	@GET
	@Path("info")
	@Produces(MediaType.APPLICATION_XML)
	public Product getProductInfo(){
		
		Product product=new Product();
		product.setProductName("Bottle");
		product.setProductPrice("15");
		
		return product;
		
	}
	
}





