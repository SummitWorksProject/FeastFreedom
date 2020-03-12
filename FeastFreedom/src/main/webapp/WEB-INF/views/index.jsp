<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
   <head>
      <meta charset="UTF-8">
      <title>FeastFreedom Food Delivery</title>
  <style><%@include file="/WEB-INF/css/styles.css"%></style>
   </head>
   <body>
   		
      <th:block th:include="/_header.html"></th:block>
      <%@ include file="_header.html" %>
      <th:block th:include="/_menu"></th:block>
        <%@ include file="_menu.html" %>
      <div class="page-title"></div>
      <div class="demo-container">
         <h3>Demo content</h3>
         <ul>
            <li>Buy online1</li>
            <li>Admin pages</li>
            <li>User</li>
         </ul>
      </div>
       
      <th:block th:include="/_footer"><%@ include file="_footer.html" %></th:block>
       
   </body>
</html>