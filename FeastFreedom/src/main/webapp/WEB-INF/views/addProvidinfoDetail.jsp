<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Service Provider Register</title>
		 <style><%@include file="/WEB-INF/css/styles.css"%></style>
	</head>
	<body>
	 <%@ include file="_header.html" %>
	 <%@ include file="_menu.html" %>
		<h2>Privider Menu</h2>
		<div class="login-container">
		<form:form method="POST" action="saveprovidinfodetail.html">
	   		<table>
			    <tr>
			        <td><form:label style="visibility:hidden" path="id"> ID:</form:label></td>
			        <td><form:input style="visibility:hidden" path="id" value="${providinfoDetail.id}" readonly="true"/></td>
			        <td><form:label style="visibility:hidden" path="providinfoId"> providinfoId:</form:label></td>
			        <td><form:input style="visibility:hidden" path="providinfoId" value="${param.infoId}" readonly="true"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="name">Menu Item:</form:label></td>
			        <td><form:input path="name" value="${providinfoDetail.name}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="type">Veg/Non-Veg:</form:label></td>
			        <td><form:input path="type" value="${providinfoDetail.type}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="price">Price:</form:label></td>
                    <td><form:input path="price" value="${providinfoDetail.price}"/></td>
			    </tr>
			     
			    <tr>
			      <td ><input type="submit" value="Add"/></td>
			      <td><input type="submit" value="Cancel"/></td>
		      </tr>
			</table> 
		</form:form>
		</div>
		
  <c:if test="${!empty providinfoDetails}">
  <div class="login-container">
	<table align="left" border="1">
		<tr>
			<th>Menu Name</th>
			<th>Price</th>
			<th>Veg/Non-Veg</th>
			<th>Actions on Row</th>
		</tr>
		<c:forEach items="${providinfoDetails}" var="providinfoDetail">
			<tr>
				<td><c:out value="${providinfoDetail.name}"/></td>
				<td><c:out value="${providinfoDetail.price}"/></td>
				<td><c:out value="${providinfoDetail.type}"/></td>
				<td align="center"> <a href="deleteprovidinfoDetail.html?id=${providinfoDetail.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	</div>
</c:if>

	</body>
	 <%@ include file="_footer.html" %>
</html>