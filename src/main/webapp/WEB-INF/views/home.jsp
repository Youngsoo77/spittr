<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Spring In Action</title>
</head>
<body>
<P>  The time on the server is ${serverTime}. </P>
<h1>
	Welcome to Spittr
</h1>

<a href="<c:url value="/spittles" />">Spittles</a> | 
<a href="<c:url value="/spitter/register" />">Register</a>

</body>
</html>
