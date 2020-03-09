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
		<h2> Provider Information</h2>
		<form:form method="POST" action="saveinfo.html">
	   		<table>
			    <tr>
			        <td><form:label style="visibility:hidden" path="id"> ID:</form:label></td>
			        <td><form:input style="visibility:hidden" path="id" value="${providinfo.id}" readonly="true"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="starttime">Start Time:</form:label></td>
			        <td><form:input path="starttime" value="${providinfo.starttime}"/></td>
			    </tr>
			        <tr>
			        <td><form:label path="endtime">End Time:</form:label></td>
			        <td><form:input path="endtime" value="${providinfo.endtime}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="email">email:</form:label></td>
			        <td><form:input path="email" value="${providinfo.email}"/></td>
			    </tr>
			
			    <tr>
			        <td><form:label path="password">Password:</form:label></td>
                    <td><form:input path="password"  type="password" value="${providinfo.password}"/></td>
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
		
  <c:if test="${!empty providinfos}">
		<h2>List Providers</h2>
	<table align="left" border="1">
		<tr>
			<th> ID</th>
			<th> Name</th>
			<th>email</th>
		
			<th>password</th>
			<th>Actions on Row</th>
		</tr>

		<c:forEach items="${providinfos}" var="providinfo">
			<tr>
				<td><c:out value="${providinfo.id}"/></td>
				<td><c:out value="${providinfo.name}"/></td>
				<td><c:out value="${providinfo.email}"/></td>
			
				<td><c:out value="${providinfo.password}"/></td>
				<td align="center"><a href="edit.html?id=${providinfo.id}">Edit</a> | <a href="delete.html?id=${providinfo.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
	</body>
</html>