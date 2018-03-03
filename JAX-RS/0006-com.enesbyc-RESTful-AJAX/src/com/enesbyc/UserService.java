package com.enesbyc;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

// /rest/user geldiginde bu kismin tetiklenecegini belirtiyoruz
@Path("/user")
public class UserService {

	// /rest/user/check geldiginde bu kismin tetiklenecegini belirtiyoruz
	@POST
	@Path("/check")
	//AJAX ile verileri aldigimiz icin QueryParam anotasyonunu kullaniyoruz.
	public Response checkLogin( 
			@QueryParam("username") String username,
			@QueryParam("password") String password)
	{
		//Alinan degerleri kontrol edip  response degeri donuyoruz.
		if(username.equals("enesbyc") && password.equals("123456"))
			return Response.status(200).entity("Service uzerinde kontrol edildi.Giris basarili").build();
		else
			return Response.status(201).entity("Service uzerinde kontrol edildi.Giris basarisiz").build();
		
	}
}
