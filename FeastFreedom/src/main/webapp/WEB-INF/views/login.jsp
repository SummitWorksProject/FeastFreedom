<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Login</title>
             <style><%@include file="/WEB-INF/css/styles.css"%></style>
        </head>
        <body>
        <%@ include file="_header.html" %>
	 	<%@ include file="_menu.html" %>
	 	 <h2>User Login</h2>
	 	<div class="login-container">
            <form:form id="loginForm" modelAttribute="login" action="loginProcess.html" method="post">
                <table align="center">
                    <tr>
                        <td>
                            <form:label path="username">User Name: </form:label>
                        </td>
                        <td>
                            <form:input path="username" name="username" id="username" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="password">Password:</form:label>
                        </td>
                        <td>
                            <form:password path="password" name="password" id="password" />
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td align="left">
                             <input type="submit" value="Login" id="Login"/>
                     		 <input type="reset"  value="Reset" />
                        </td>
                    </tr>
                
                </table>
            </form:form>
            </div>
            <table align="center">
                <tr>
                    <td style="font-style: italic; color: red;">${message}</td>
                </tr>
            </table>
        </body>
         <%@ include file="_footer.html" %>
        </html>