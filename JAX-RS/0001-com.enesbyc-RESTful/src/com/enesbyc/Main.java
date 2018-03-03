package com.enesbyc;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//URL kýsmýna /rest geldiðini web.xml dosyamýz içerisinde belirtiyoruz.
//URL kýsmýna /rest/webservice geldiðinde tetiklenmesini saðlýyoruz.
@Path(value="/webservice")
public class Main {
	
	//GET iþlemi yapacaðýmýzý belirtiyoruz.
	@GET
	//Produces ile tipini belirtiyoruz. 
	//Text-HTML-XML gibi tipleri seçebiliriz.
	@Produces(MediaType.TEXT_PLAIN)
	public String methot1(){
		//Geriye String tipinde deðer döndürüyor.
		return "Method1 calisti";
	}
	
}





