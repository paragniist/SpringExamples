<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Error</title>
	</head>
	<body>
		<h2>Error</h2>
		<p style="color: red;">
			Unknown error encountered. 
			exception: ${status}
		</p>
	</body>
</html>