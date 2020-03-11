<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>All Providers</title>
</head>
<body>
<h1>List Providers</h1>
<h3><a href="addprovider.html">Add More Provider</a></h3>

<c:if test="${!empty providers}">
	<table align="left" border="1">
		<tr>
			<th> ID</th>
			<th> Name</th>
			<th>Email</th>
			<th>Password</th>
	
		</tr>

		<c:forEach items="${providers}" var="provider">
			<tr>
				<td><c:out value="${provider.id}"/></td>
				<td><c:out value="${provider.name}"/></td>
				<td><c:out value="${provider.email}"/></td>
				<td><c:out value="${provider.password}"/></td>
			
			</tr>
		</c:forEach>
	</table>
</c:if>
</body>
</html>