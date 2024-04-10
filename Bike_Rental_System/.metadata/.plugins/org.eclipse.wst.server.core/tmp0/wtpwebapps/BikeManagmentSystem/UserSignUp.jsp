<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<f:view>
	<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="views/stylee.css">
<title>User Signup</title>
</head>
<body>
	<div class="main">
		<div class="content">
			<h2>Sign Up</h2>
			<h:form id="signupForm">
				<label for="userId">Enter your user id</label><br>
				<h:inputText id="userId" value="#{user.userId}" required="true" /><br>
				<label for="username">Enter your username</label><br>
				<h:inputText id="username" value="#{user.userName}" required="true" /><br>
				<label for="name">Enter your name</label><br>
				<h:inputText id="name" value="#{user.fullName}" required="true" /><br>
				<label for="email">Enter your email</label><br>
				<h:inputText id="email" value="#{user.email}" required="true" /><br>
				<label for="phone">Enter your phone number</label><br>
				<h:inputText id="phone" value="#{user.phoneNumber}" required="true" /><br>
				<label for="password">Enter your password</label><br>
				<h:inputSecret id="password" value="#{user.passWord}" required="true" /><br>
				<label for="age">Enter your age</label><br>
				<h:inputText id="age" value="#{user.age}" required="true" /><br>
				<label for="gender">Select your Gender</label><br>
				<h:selectOneMenu id="gender" value="#{user.gender}" styleClass="on">
					<f:selectItem itemLabel="Male" itemValue="Male" />
					<f:selectItem itemLabel="Female" itemValue="Female" />
				</h:selectOneMenu>
				<h:commandButton  action="#{BmsImpl.UserSignUp(user)}" value="Sign Up" styleClass="button" />
			</h:form>
		</div>
	</div>	
</body>
	</html>
</f:view>
