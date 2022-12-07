<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.oop.model.*"%>
<%@page import="com.oop.crud.*"%>
<%@page import="com.oop.servlet.*"%>
<%@page import="com.oop.utility.*"%>
<%@page import="java.util.*"%>

<%
Customer cusDetails = (Customer) request.getSession().getAttribute("cusDetails");
List<Item> itemDetails = (List<Item>) request.getSession().getAttribute("itemDetails");
ArrayList<Cart> cartDetails = (ArrayList<Cart>) session.getAttribute("cartDetails");
%>

<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta name="author" content="" />
