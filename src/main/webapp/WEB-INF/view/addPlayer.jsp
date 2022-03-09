<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align: center;">
<form action="./added" method="post">
UserName : <input type="text" name="userName"> <br> <br>
EmailId  : <input type="text" name="emailId"><br> <br>
SetPassword : <input type="password" name="passWord"><br> <br>
ComingFrom : <input type="text" name="nativePlace"><br> <br>
<input style="text-align: center;" type="submit" value="Register">
<a href="./equal">Login</a>
</form>
</body>
</html>