<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Details</title>
</head>
<body>
	<h2>Order Details</h2>
	<table>
		<tr>
			<td>Order No:</td>
			<td>${order.orderNo}</td>
		</tr>
		<tr>
			<td>Ordered Date:</td>
			<td>${order.orderedDate}</td>
		</tr>
		<tr>
			<td>Customer Name: </td>
			<td>${order.customerName}</td>
		</tr>
		<tr>
			<td>Amount:</td>
			<td>${order.amount}</td>
		</tr>
		<tr>
			<td>Status:</td>
			<td>${order.status}</td>
		</tr>
	</table>
</body>
</html>