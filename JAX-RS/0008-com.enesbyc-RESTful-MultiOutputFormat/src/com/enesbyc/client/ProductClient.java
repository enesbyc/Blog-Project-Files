package com.enesbyc.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ProductClient {

	public static void main(String[] args) {

		// XML formatinda istek yapiliyor.
		try {
			// istemci olustur
			Client client = Client.create();
			// kaynak olusturulur
			WebResource resource = client.resource("http://localhost:8080/0008-com.enesbyc-RESTful-MultiOutputFormat/rest/product/info");
			//XML tipinde istek yapiliyor.
			ClientResponse response = resource.accept("application/xml" + ";charset=utf-8").get(ClientResponse.class);
			if (response.getStatus() != 200) {
				throw new RuntimeException("Hata meydana geldi");
			}
			// Gelen cevap string haline getirilir
			String sonuc = response.getEntity(String.class);
			System.out.println("XML tipinde veri istenildiginde gelen deger" + sonuc);

		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("---------------------------------------------------------------------------------------");
		
		// JSON formatinda istek yapiliyor.
		try {
			// istemci olustur
			Client client = Client.create();
			// kaynak olusturulur
			WebResource resource = client.resource("http://localhost:8080/0008-com.enesbyc-RESTful-MultiOutputFormat/rest/product/info");
			//JSON tipinde istek yapiliyor.
			ClientResponse response = resource.accept("application/json" + ";charset=utf-8").get(ClientResponse.class);
			if (response.getStatus() != 200) {
				throw new RuntimeException("Hata meydana geldi");
			}
			// Gelen cevap string haline getirilir
			String sonuc = response.getEntity(String.class);
			System.out.println("JSON tipinde veri istenildiginde gelen deger" + sonuc);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
