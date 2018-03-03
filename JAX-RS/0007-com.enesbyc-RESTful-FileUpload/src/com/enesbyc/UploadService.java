package com.enesbyc;

import java.io.InputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

@Path("/file")
public class UploadService {

	@POST
	@Path("/upload")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	// MULTIPART_FORM_DATA Formdan gelecek verinin tipini belirtir.
	public Response uploadFile(
			@FormDataParam ("file") InputStream inputStream,
			//Dosya alinir
			@FormDataParam ("file") FormDataContentDisposition fileDetails)
			//Dosyanin icerigi aliniyor
	{
		
		//inputStream kullanarak dosya ile islemler yapabiliriz.
		//fileDetails kullanarak dosya ayrintilarina ulasabiliriz.
		
		String result="Dosya webservise ulasti.Yuklenen dosya adi:"+fileDetails.getFileName();
		
		return Response.status(200).entity(result).build();
	}

}
