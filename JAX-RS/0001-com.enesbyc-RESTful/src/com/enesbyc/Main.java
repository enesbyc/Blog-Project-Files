package com.enesbyc;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//URL k�sm�na /rest geldi�ini web.xml dosyam�z i�erisinde belirtiyoruz.
//URL k�sm�na /rest/webservice geldi�inde tetiklenmesini sa�l�yoruz.
@Path(value="/webservice")
public class Main {
	
	//GET i�lemi yapaca��m�z� belirtiyoruz.
	@GET
	//Produces ile tipini belirtiyoruz. 
	//Text-HTML-XML gibi tipleri se�ebiliriz.
	@Produces(MediaType.TEXT_PLAIN)
	public String methot1(){
		//Geriye String tipinde de�er d�nd�r�yor.
		return "Method1 calisti";
	}
	
}





