
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
       
      <div class="page-title">Login Provider</div>
       
      <div class="login-container">
         <h3>Enter Provider Name and password</h3>
         <br>
        
          
         <form method="POST"
            th:action="@{/checkprovider}">
            <table>
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
          
         <span class="error-message" th:utext="${error}"></span>
      </div>
     <%@ include file="_footer.html" %>
       
   </body>
</html>