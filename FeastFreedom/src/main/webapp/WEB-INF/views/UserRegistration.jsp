<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration Form</title>
<style><%@include file="/WEB-INF/css/styles.css"%></style>

<script>

function validateData(){ 
 if(validate()){
	 document.userRegistrationForm.action = "saveUser.html"
     document.userRegistrationForm.submit();
 }
	  
}

function validate(){
	 if(document.userRegistrationForm.first_Name.value == ""){
		  alert("First Name Can Not be Blank");
		  document.userRegistrationForm.first_Name.focus();
		  return false;
		  
	  }
	  if(!isNaN(document.userRegistrationForm.first_Name.value)){
		  alert("Invalid First Name");
		  document.userRegistrationForm.first_Name.focus();
		  return false;
	  }
	  if(document.userRegistrationForm.last_Name.value == ""){
		  alert("Last Name Can Not be Blank");
		  document.userRegistrationForm.last_Name.focus();
		  return false;
		  
	  }
	  if(!isNaN(document.userRegistrationForm.last_Name.value)){
		  alert("Invalid Last Name");
		  document.userRegistrationForm.last_Name.focus();
		  return false;
	  }
	  if(document.userRegistrationForm.email.value == ""){
		  alert("Email Can Not be Blank");
		  document.userRegistrationForm.email.focus();
		  return false;
		  
	  }
	  if(document.userRegistrationForm.password.value == ""){
		  alert("Password Can Not be Blank");
		  document.userRegistrationForm.password.focus();
		  return false;
		  
	  }
	  
	  if(document.userRegistrationForm.security_Question_1.options[security_Question_1.selectedIndex].text == ""){
		  alert("Please select Security Question 1");
		  document.userRegistrationForm.security_Question_1.focus();
		  return false;
		  
	  }
	
	  if(document.userRegistrationForm.answer1.value == ""){
		  alert("Answer1 Can Not be Blank");
		  document.userRegistrationForm.answer1.focus();
		  return false;
		  
	  }
	  if(document.userRegistrationForm.security_Question_2.options[security_Question_2.selectedIndex].text == ""){
		  alert("Please select Security Question 2");
		  document.userRegistrationForm.security_Question_2.focus();
		  return false;
		  
	  }
	  if(document.userRegistrationForm.answer2.value == ""){
		  alert("Answer2 Can Not be Blank");
		  document.userRegistrationForm.answer2.focus();
		  return false;
		  
	  }
	  return true;
}
function reset() {
  document.userRegistrationForm.reset();
}
</script>

</head>
<body>
	 <%@ include file="_header.html" %>
	 <%@ include file="_menu.html" %>
	 <h2>User Register</h2>
<form name="userRegistrationForm"  method="post">
<div class="login-container">
<Table width="100%">
<TR>
	<TD>
		User Id:
	</TD>
	<TD>
		<input type=text  name="id" />
	</TD>
</TR>
<TR>
	<TD>
		First Name:
	</TD>
	<TD>
		<input type=text  name="first_Name" />
	</TD>
</TR>
<TR><TD></TD><TD></TD></TR>
<TR>
	<TD>
		Last Name:
	</TD>
	<TD>
		<input type=text  name="last_Name" />
	</TD>
</TR>
<TR><TD></TD><TD></TD></TR>
<TR>
	<TD>
		Email:
	</TD>
	<TD>
		<input  type=text  name="email" />
	</TD>
</TR>
<TR><TD></TD><TD></TD></TR>
<TR>
	<TD>
		Password:
	</TD>
	<TD>
		<input  type=text  name="password" />
	</TD>
</TR>
<TR><TD></TD><TD></TD></TR>
<TR>
	<TD>
		Security Question 1:
	</TD>
	<TD>
		<select name="security_Question_1" id="security_Question_1">
			<option value="" selected></option>
			<option>In what city or town was your first job?</option>
			<option>What was your childhood nickname?</option> 
			<option>What was the color of your first car?</option>
			<option>What was the name of your first pet?</option>
			<option>In what city were you born?</option>
		</select>
	</TD>
	<TD>
		Answer:
	</TD>
	<TD>
		<input type=text  name="answer1"/>
	</TD>
</TR>
<TR><TD></TD><TD></TD></TR>
<TR>
	<TD>
		Security Question 2:
	</TD>
	<TD>
		<select name="security_Question_2" id="security_Question_2">
			<option value="" selected></option>
			<option>In what city or town was your first job?</option>
			<option>What was your childhood nickname?</option> 
			<option>What was the color of your first car?</option>
			<option>What was the name of your first pet?</option>
			<option>In what city were you born?</option>
		</select>
	</TD>
	<TD>
		Answer:
	</TD>
	<TD>
		<input type=text  name="answer2" />
	</TD>
</TR>
</TABLE>
</div>

<TABLE align="center">
<TR>
	<TD>
		<input type= button name=save value=Save onclick="validateData()">
	</TD>
	<TD>
		<input type= button name="resetId" id="resetId" value="Reset" onclick="reset()">
	</TD>
</TR>
</Table>

</form>
 <%@ include file="_footer.html" %>
</body>
</html>