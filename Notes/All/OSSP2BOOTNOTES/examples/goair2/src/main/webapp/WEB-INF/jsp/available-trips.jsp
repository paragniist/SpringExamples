<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Available Trips</title>
	</head>
	<body>
		<h2>Available Trips</h2>
		<table>
			<tr>
				<th>Trip#</th>
				<th>Trip Name</th>
				<th>Source</th>
				<th>Destination</th>
				<th>Planned Date</th>
				<th>Estimated Cost</th>
			</tr>
			<c:forEach items="${trips}" var="trip">
				<tr>
					<td>${trip.tripNo}</td>
					<td>${trip.tripName}</td>
					<td>${trip.source}</td>
					<td>${trip.destination}</td>
					<td><fmt:formatDate value="${trip.plannedDate}" pattern="dd/MM/yyyy"/> </td>
					<td>${trip.estimatedCost}</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>