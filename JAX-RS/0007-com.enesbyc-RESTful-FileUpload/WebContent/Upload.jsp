<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>File Upload</title>
</head>
<body>
	<!-- Action ile UploadService icerisindeki metoda yonlendiriyoruz -->
	<form action="rest/file/upload" method="post"
		enctype="multipart/form-data"><br>
		<h4>Yüklenecek dosyayi seciniz.</h4>
		<input type="file" name="file"> <input type="submit"
			value="Upload File">
	</form>

</body>
</html>