<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Web.xml icerisindeki javascript url ile iletisim halinde olacagini belirtiyoruz-->
<script lang="javascript" src="./rest-js"></script>

<script>
	function checkLogin() {

		//Form icerisindeki username ve password id'lerine sahip degerleri aliyoruz.
		var username = document.getElementById("username").value;
		var password = document.getElementById("password").value;
		//Alinan degerler WebService sinifina gonderiliyor.
		var response = UserService.checkLogin({username : username,password : password});
		//Servis uzerinden gelen cevap alert olarak karsimiza cikiyor
		alert(response);
		
	}
</script>

<title>enesbyc.com AJAX</title>
</head>
<body>
	<h1>enesbyc.com AJAX</h1>
	<form action="rest/user/check" method="post">
		<table>
			<tr>
				<td>Username</td>
				<td><input type="text" name="username" id="username" value=""></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" id="password" value=""></td>
			</tr>

			<tr>
				<td></td>
				<td>
					<input type="button" value="button onclick" onclick="checkLogin()">
				</td>
			</tr>
		</table>

	</form>


</body>
</html>