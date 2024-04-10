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
				
				<h:commandButton  action="#{BmsImpl.UserSignUp(user)}" value="Sign Up" styleClass="button" />
			</h:form>
		</div>
	</div>	
</body>
	</html>
</f:view>
