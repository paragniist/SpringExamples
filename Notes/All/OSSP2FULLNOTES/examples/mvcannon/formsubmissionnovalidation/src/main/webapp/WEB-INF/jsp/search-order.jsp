<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Search Order</title>
	</head>
	<body style="font-family: Gill Sans, sans-serif; font-size: 18px;">
		<h2>Search Order</h2>
		<form action="${pageContext.request.contextPath}/do-search-order.htm" method="post">
			<table>
				<tr>
					<td>Order# :</td>
					<td><input type="text" name="orderNo"/></td>
					<td>Customer Name:</td>
					<td><input type="text" name="customerName"/></td>
				</tr>
				<tr>
					<td>From Date(dd-MM-yyyy):</td>
					<td><input type="text" name="fromDate"/></td>
					<td>To Date (dd-MM-yyyy):</td>
					<td><input type="text" name="toDate"/></td>
				</tr>
				<tr>
					<td>Mobile#:</td>
					<td><input type="text" name="mobileNo"/></td>
					<td>Email Address:</td>
					<td><input type="email" name="emailAddress"/></td>
				</tr>
				<tr>
					<td colspan="4">
						<input type="submit" value="Search"/>
					</td>
				</tr>
			</table>
		</form>
		
	</body>
</html>