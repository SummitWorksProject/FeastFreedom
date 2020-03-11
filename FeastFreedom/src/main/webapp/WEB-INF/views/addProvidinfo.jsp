<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Provider Information</title>
		 <style><%@include file="/WEB-INF/css/styles.css"%></style>
	</head>
	<body>
	 <%@ include file="_header.html" %>
	 <%@ include file="_menu.html" %>
		<h2> Provider Information</h2>
		<form:form method="POST" action="saveprovidinfo.html">
	   		<table>
			    <tr>
			        <td><form:label style="visibility:hidden" path="id"> ID:</form:label></td>
			        <td><form:input style="visibility:hidden" path="id" value="${providinfo.id}" readonly="true"/></td>
			    </tr>
			    <tr>
			        <td><form:label style="visibility:hidden" path="providerId"> providerId:</form:label></td>
			        <td><form:input style="visibility:hidden" path="providerId" value="${providinfo.providerId}" readonly="true"/></td>
			    </tr>
			    <tr>
			        <td><B>Kitchen Working Days:</B></td>
			         <td colspan="3">
			         	<input type="checkbox"  path="monday" name="topping" value="${providinfo.monday}">Monday
  						<input type="checkbox" path="tuesday" name="topping" value="${providinfo.tuesday}">Tuesday
  						<input type="checkbox" path="wendesday name="topping" value="wendesday">Wendesday
  						<input type="checkbox"  path="wendesday name="topping" value="tuesday">Tuesday
  						<input type="checkbox" path="friday name="topping" value="friday">Friday
  						<input type="checkbox" path="saturday name="topping" value="saturday">Saturday
  						<input type="checkbox" path="sunday name="topping" value="sunday">Sunday
  					</td>
			    </tr>
			    <tr>
			        <td><form:label path="starttime"><B>Kitchen working Time:</B></form:label></td>
			        <td colspan="3"><form:input path="starttime" value="${providinfo.starttime}"/>
			       <form:label path="endtime">End Time:</form:label>
			       <form:input path="endtime" value="${providinfo.endtime}"/><SELECT></SELECT></td>
			    
			    </tr>
			   <TR>
					<TD><B>Kitchen Image:</B></TD>
					<TD><input align=left type=button name=upload id=upload value="Upload"></TD>
					<td></td>
					<td></td>
				</TR>
				<TR></TR>
				<TR>
					<TD><B>Kitchen Menu:</B></TD>
					<TD><input align=left  type=button name=add id=add value="Add"></TD>
					<td></td>
					<td></td>
				</TR>
			   
			    <tr>
			      <td ><input type="submit" value="Save"/></td>
			       <td ><input type="submit" value="Cancel"/></td>
		      </tr>
			</table> 
		</form:form>
	
 <%@ include file="_footer.html" %>
	</body>
</html>