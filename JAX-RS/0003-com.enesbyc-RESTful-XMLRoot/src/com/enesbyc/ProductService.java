package com.enesbyc;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//Url kýsmýna /rest/product geldiðinde yapýlacaklarý belirtiyoruz.
@Path("product")
public class ProductService {
	
	//Url kýsmýna /rest/product/info geldiðinde yapýlacaklarý belirtiyoruz.
	//XML tipinde verilerle iþlemler yapacaðýmýzý belirtiyoruz.
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





