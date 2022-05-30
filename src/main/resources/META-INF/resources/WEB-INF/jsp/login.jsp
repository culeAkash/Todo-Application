<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Todo App</title>
</head>
<body>
 	Welcome ${name}
 	<form action="/login" method="post"> <!--If we dont give method it will judge it as a get request-->
 		<label for="name">Username: </label>
 		<input name="name" type="text"/>
 		<label for="password">Password: </label>
 		<input name="password" type="password"/>
 		<br/>
 		<input type="submit"/>
 	</form>
</body>
</html>