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
<link rel="styleSheet" type="text/css" href="views/style.css">
<title>BikeShareHub</title>
</head>
<body>
 <h:form>
	<div class="main">
		<div class="navbar">
			<div class="icon">
				<h2 class="logo">BSHub</h2>
			</div>
			<div class="menu">
				<ul>
					<li><a href="DashBoard.jsp">HOME</a></li>
					<li><a href="#">ABOUT</a></li>
					<li><a href="#">SERVICE</a></li>
					<li><a href="#">DESIGN</a></li>
					<li><a href="#">CONTACT</a></li>
				</ul>
			</div>
			<div class="search">
				<input class="srch" type="search" name="" placeholder="Search...">
				<a href="#"><button class="btn">Search</button></a>
			</div>
		</div>
		<div class="content">
				<h1>Explore The World<br><span>Pedal By Pedal</span><br> Rent A Bike And Unlock<br>New Adventures</h1>
				<p class="par">Discover the joy of cycling with our convenient bike rental service. <br>Choose from a variety of high-quality bikes suited to your adventure<br>Whether it's exploring city streets or venturing off-road.<br></p>	
				<button class="cn"><a href="#">JOIN US</a></button>		
			<div class="form">
				<h2>Login Here</h2>
				<label>Enter your email</label>
				<h:inputText id="email" value="#{user.email }" /><br>
				<h:message for="email" style="color: red;"></h:message><br>
				<label>Enter your Password</label>
				<h:inputSecret id="password" value="#{user.passWord}" maxlength="16"></h:inputSecret>
				<h:message for="password" style="color: red;"></h:message>
				<h:commandButton  action="#{BmsImpl.Login(user) }" value="Login" styleClass="button" style="background: #ff7200;"/>	
				<p class="link">Don't have an account<br>
				<a href="UserSignUp.jsf">Sign up</a> here</a></p>			
			</div>	
		</div>
	</div>
	</h:form>
	<script type="text/javascript" src="views/scripts.js"></script>
</body>
	</html>
</f:view>
