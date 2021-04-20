<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3> insert </h3>
		<form action="insertStaffTrainning">
		<table>
			<tr>
				<td>full Name</td>
				<td><input type="text" name="fullName"></td>
			</tr>
			<tr>
				<td>trainning program</td>
				<td>
				<select id="cars" name="trainningPro" >
 				 <c:forEach items="${list}" var="c">
    				<option value="${c.name}">${c.name}</option>
   				 </c:forEach>
 				 </select>
 				 </td>
			</tr>
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
</body>
</html>