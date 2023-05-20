<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Apply Loan</title>
	</head>
	<body style="font-family: Gill Sans, sans-serif; font-size: 18px;">
		<h2>Apply Loan</h2>
		<form:form modelAttribute="loanApplicationForm" action="apply-loan.htm">
			<p style="color: red;">
				<form:errors path="*"/>
			</p>
			Occupation: <form:input path="occupation"/><br/>
			Company/Business Name: <form:input path="company"/><br/>
			Experience: <form:input path="experience"/><br/>
			Gross Salary: <form:input path="grossSalary"/><br/>
			LoanType: <form:select path="loanType">
				<form:option value="">select</form:option>
				<form:option value="personal">Personal Loan</form:option>
				<form:option value="gold">Gold Loan</form:option>
				<form:option value="house">Home Loan</form:option>
			</form:select>
			Loan Amount: <form:input path="loanAmount"/><br/>
			Tenure: <form:input path="tenure"/><br/>
			<input type="submit" value="apply"/>
		</form:form>
	</body>
</html>