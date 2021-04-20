<%@page import="sad.humanresourcemanagementsystem.dao.TrainingProgramDAO"%>
<%@page import="sad.humanresourcemanagementsystem.model.staffInTrainning"%>
<%@page import="sad.humanresourcemanagementsystem.servlet.updateStaffTrainning"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update</title>
</head>
<body>
		<h3> update </h3>
		<form action="updateStaffTrainning">
		<table>
			<tr>
				<td>id</td>
				<td><input type="text" name="sit_id" value="<%=request.getParameter("sit_id")%>"></td>
			</tr>
			<tr>
				<td>full Name</td>
				<td><input type="text" name="fullName"></td>
			</tr>
			<tr>
				<td>trainning program</td>
				<td><input type="text" name="trainningPro"></td>
			</tr>
			<tr>
				<td>support money</td>
				<td><input type="text" name="supportMoney"></td>
			</tr>
			<tr>
				<td>description</td>
				<td><input type="text" name="description"></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit"></td>
			</tr>
		</table>
		</form>
</body>
</html>