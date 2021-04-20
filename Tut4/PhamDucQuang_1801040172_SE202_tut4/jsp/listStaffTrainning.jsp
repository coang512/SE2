<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1px">
		<tr>
			<th>full name </th>
			<th>trainning program </th>
			<th>support money </th>
			<th>description </th>
			<th>sit_id </th>
			<th> function </th>
		</tr>	
		<c:forEach items="${list}" var="c">
		<tr>
			<td>${c.fullName}</td>
			<td>${c.trainningPro}</td>
			<td>${c.supportMoney}</td>
			<td>${c.description}</td>
			<td>${c.sit_id}</td>
			<td>
				<a href="deleteStaffTrainning?sit_id=${c.sit_id}">delete</a>
				<a href="updateStaffTrainning.jsp?sit_id=${c.sit_id}">update</a>
			</td>
		</tr>
		</c:forEach>
	</table>
	<a href="insertGetProgramTrain">add</a>
	<form action="filterTrainningPro">
  <label for="tp">Choose a trainning program:</label>
  <select id="tp" name="trainningPro" >
  <c:forEach items="${list}" var="c">
    <option value="${c.trainningPro}">${c.trainningPro}</option>
    </c:forEach>
  </select>
  <input type="submit" value="filter">
</form>

</body>
</html>