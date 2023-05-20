<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>account details</title>
	</head>
	<body style="font-family: Gill Sans, sans-serif; font-size: 18px;">
		Booking Reference#: ${booking.referenceNo} <br/>
		Contact Person: ${booking.contactPerson} <br/>
		Contact No: ${booking.contactNo}<br/>
		Restaurant Name: ${booking.restaurantName} <br/>
		Reservation Date/Time: ${booking.bookingDate} <br/>
		Timeslot: ${booking.timeslot}
		Coupon Applied: ${booking.coupon}<br/>
	</body>
</html>