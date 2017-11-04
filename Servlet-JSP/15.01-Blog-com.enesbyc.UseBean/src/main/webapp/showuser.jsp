<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="user" class="model.User" scope="request"></jsp:useBean>
<jsp:getProperty property="userName" name="user"/>
<jsp:getProperty property="password" name="user"/>


<jsp:useBean id="user2" class="model.User" scope="request">
	<jsp:setProperty property="userName" name="user2" value="ekrem"/>
	<jsp:setProperty property="password" name="user2" value="123456"/>
</jsp:useBean>


<jsp:getProperty property="userName" name="user2"/>
<jsp:getProperty property="password" name="user2"/>

</body>
</html>




