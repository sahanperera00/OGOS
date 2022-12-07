<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="com.oop.model.*" %>
<%@page import="java.io.PrintWriter" %>
<%@page import="com.oop.crud.*" %>
<%@page import="java.util.*" %>

<%
	Customer cusDetails = (Customer)request.getSession().getAttribute("cusDetails");

	if(cusDetails != null) {
		response.sendRedirect("home.jsp");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

<%@include file="includes/exstyles.jsp"%>

<style>
body {
    background:url("images/login.jpg");
    background-size: cover;
}

.User_option li {
	padding: 20px;
}

.maincontainer {
	width: 100%;
	height: 80vh;
    /*background-color: rgb(15,15,15);*/
}

.outercontainer {
	width: 30%;
	height: 70%;
    display: block;
    margin-left: auto;
    margin-right: auto;
    margin-top: 150px;
    display: flex;
    justify-content: center;
    background-color: rgba(0,0,0,0.5);
}

.cartinnercontainer {
	width: 70%;
	height: 100%;
	text-align: center;
	color: white;
    margin-top: 60px;
}

.titlebar {
	width: 100%;
	height: 20%;
}

.formsec {
	width: 100%;
	height: 80%;
}

.table {
    color: white;
}
</style>

</head>
<body>
	<div class="maincontainer">
			<div class="outercontainer">
				<div class="cartinnercontainer">
					<div class="titlebar">
						<h1>Login</h1>
					</div>
					<div class="formsec">
						<form action="login" method="post">
						  <div class="form-group">
						    <label for="exampleInputEmail1">Email address:</label>
						    <input type="email" name="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Email">
						  </div>
						  <div class="form-group">
						    <label for="exampleInputPassword1">Password:</label>
						    <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
						  </div>
						  <button type="submit" class="btn btn-outline-light mb-3" name="submit">Login</button>
						</form>
					</div>
				</div>
			</div>
		</div>
</body>
</html>