<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Service Provider Register</title>
	</head>
	<body>
		<h2>Service Provider Register</h2>
		<form:form method="POST" action="save.html">
	   		<table>
			    <tr>
			        <td><form:label style="visibility:hidden" path="id"> ID:</form:label></td>
			        <td><form:input style="visibility:hidden" path="id" value="${provider.id}" readonly="true"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="name">Provider Name:</form:label></td>
			        <td><form:input path="name" value="${provider.name}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="email">email:</form:label></td>
			        <td><form:input path="email" value="${provider.email}"/></td>
			    </tr>
			
			    <tr>
			        <td><form:label path="password">Password:</form:label></td>
                    <td><form:input path="password"  type="password" value="${provider.password}"/></td>
			    </tr>
			      <tr>
			        <td>Password Confirm:</td>
                    <td><input  type="password" value=""/></td>
			    </tr>
			    <tr>
			      <td colspan="2"><input type="submit" value="Submit"/></td>
		      </tr>
			</table> 
		</form:form>
		
  <c:if test="${!empty providers}">
		<h2>List Providers</h2>
	<table align="left" border="1">
		<tr>
			<th> ID</th>
			<th> Name</th>
			<th>email</th>
		
			<th>password</th>
			<th>Actions on Row</th>
		</tr>

		<c:forEach items="${providers}" var="provider">
			<tr>
				<td><c:out value="${provider.id}"/></td>
				<td><c:out value="${provider.name}"/></td>
				<td><c:out value="${provider.email}"/></td>
			
				<td><c:out value="${provider.password}"/></td>
				<td align="center"><a href="edit.html?id=${provider.id}">Edit</a> | <a href="delete.html?id=${provider.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
	</body>
</html>