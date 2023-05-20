<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@page isELIgnored="false" %> 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>My orders</title>
	</head>
	<body>
		<h2>My Orders</h2>
		<table>
			<tr>
				<th>order no</th>
				<th>description</th>
				<th>status</th>
			</tr>
			<c:forEach items="${orders}" var="order">
				<tr>
					<td><a href="${pageContext.request.contextPath}/${order.orderNo}/order-details.htm">${order.orderNo}</a></td>
					<td>${order.description}</td>
					<td>${order.status}</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>














