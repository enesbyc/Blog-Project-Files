<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- Formun post islemi yapacagini belirtiyoruz. -->
	<!-- url kismina /rest/send yazilmasini sagliyoruz 
		 bu sayede /rest/send url'ine input alanlari gonderilecek.-->

	<form action="rest/send" method="post">
		<table>
			<!-- Web servise productName ve productPrice isminde gönderilmesini sagliyor. -->
			<tr>
				<td>Product Name</td>
				<td><input type="text" name="productName" /></td>
			</tr>
			<tr>
				<td>Product Price</td>
				<td><input type="text" name="productPrice" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Send" /></td>
			</tr>
		</table>
	</form>
</body>
</html>





