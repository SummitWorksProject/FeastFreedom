
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
   <head>
      <meta charset="UTF-8">
      <title>Login Provider</title>
      <style><%@include file="/WEB-INF/css/styles.css"%></style>
   </head>
   <body>
    <%@ include file="_header.html" %>
	<%@ include file="_menu.html" %>
	 <h2>Privider Login</h2>
       <div class="login-container">
          <form method="POST"
            th:action="@{/checkprovider}">
            <table align="center">
               <tr>
                  <td>Provider Name *</td>
                  <td><input name="name" /></td>
               </tr>
               <tr>
                  <td>Password *</td>
                  <td><input type="password" name="password" /></td>
               </tr>
               <tr>
                  <td>&nbsp;</td>
                  <td>
                      <input type="submit" value="Login" />
                      <input type="reset"  value="Reset" />
                  </td>
               </tr>
            </table>
         </form>
          <table align="center">
                <tr>
                    <td style="font-style: italic; color: red;">${error}</td>
                </tr>
            </table> 
       
      </div>
     <%@ include file="_footer.html" %>
       
   </body>
</html>