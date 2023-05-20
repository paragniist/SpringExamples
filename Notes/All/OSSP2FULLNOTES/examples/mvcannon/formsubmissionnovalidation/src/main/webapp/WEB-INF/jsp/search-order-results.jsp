<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Search Order Results</title>
	</head>
	<body style="font-family: Gill Sans, sans-serif; font-size: 18px;">
		<h2>Search Order Results</h2>
		<table>
			<tr>
				<th>Order#</th>
				<th>Description</th>
				<th>Status</th>
			</tr>
			<c:forEach items="${orders}" var="order">
				<tr>
					<td>${order.orderNo}</td>
					<td>${order.description}</td>
					<td>${order.status}</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>