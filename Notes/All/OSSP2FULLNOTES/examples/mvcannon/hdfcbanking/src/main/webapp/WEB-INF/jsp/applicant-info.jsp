<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Applicant Info</title>
	</head>
	<body style="font-family: Gill Sans, sans-serif; font-size: 18px;">
		<h2>Applicant Info</h2>
		<form:form modelAttribute="loanApplicationForm">
			<p style="color: red;">
				<form:errors path="*"/>
			</p>
			Applicant Fullname: <form:input path="applicantName"/><br/>
			Mobile Number: <form:input path="mobileNo"/><br/>
			Email Address: <form:input path="emailAddress"/><br/>
			Dob (dd/MM/yyyy): <form:input path="dob"/><br/>
			Gender: Male: <form:radiobutton path="gender" value="Male"/> or Female: <form:radiobutton path="gender" value="Female"/><br/>
			Identification Type:
			<form:select path="identificationType">
				<form:option value="">select</form:option>
				<form:option value="aadhar">Aadhar</form:option>
				<form:option value="pan">Pan Card</form:option>
				<form:option value="voter">Voter Identification</form:option>
			</form:select><br/>
			Identification: <form:input path="identificationValue"/><br/>
			<input type="submit" value="next"/>
		</form:form>
	</body>
</html>