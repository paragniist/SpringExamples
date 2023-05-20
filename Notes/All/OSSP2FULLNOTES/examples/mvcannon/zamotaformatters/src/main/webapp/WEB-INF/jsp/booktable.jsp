<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>account details</title>
	</head>
	<body style="font-family: Gill Sans, sans-serif; font-size: 18px;">
		<h2>Book Table</h2>
		<form:form modelAttribute="bookTableForm">
			<p style="color: red">
				<form:errors path="*"/>
			</p>
			Customer Name: <form:input path="customerName"/><br/>
			Persons: <form:input path="persons"/><br/>
			Reservation Date (dd/MM/yyyy): <form:input path="reservationDate"/><br/>
			Timeslot: 
			<form:select path="timeslot">
				<form:option value="">select</form:option>
				<form:option value="11:30">11:30 am</form:option>
				<form:option value="12:00">12:00 pm</form:option>
				<form:option value="12:30">12:30 pm</form:option>
				<form:option value="13:00">01:00 pm</form:option>
				<form:option value="13:30">01:30 pm</form:option>
				<form:option value="14:00">02:00 pm</form:option>
				<form:option value="14:30">02:30 pm</form:option>
				<form:option value="15:00">03:00 pm</form:option>
			</form:select><br/>
			Restaurant Name:
			<form:select path="restaurantName">
				<form:option value="">select</form:option>
				<c:forEach items="${restaurants}" var="restaurant">
					<form:option value="${restaurant.key}">${restaurant.value}</form:option>
				</c:forEach>
			</form:select><br/>
			ContactNo: <form:input path="contactNo"/><br/>
			Email Address: <form:input path="emailAddress"/><br/>
			Additional Notes: <form:textarea path="additionalNotes" rows="4" cols="25"/><br/>
			Coupon Code: <form:input path="coupon"/><br/>
			<input type="submit" value="book"/>
		</form:form>
	</body>
</html>










