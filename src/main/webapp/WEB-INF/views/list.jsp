<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>list</title>
</head>
<body>
<table>
<thead>
	<tr>
		<th>seq</th>
		<th>contents</th>
	</tr>
</thead>
	<c:forEach var="one" items="${list}">
		<tr>
			<td>${one.seq}</td>
			<td>${one.contents}</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>