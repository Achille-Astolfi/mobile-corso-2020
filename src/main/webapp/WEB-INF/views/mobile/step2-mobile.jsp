<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="it">
<head>
<meta charset="UTF-8">
<title>Step 2</title>
<c:url var="resources" value="/resources" />
<link rel="stylesheet" href="${ resources }/bootstrap/4.4.1/css/bootstrap.css" type="text/css">
</head>
<body>
	<div class="container">
		<p>Questa view contiene l'altra parte delle informazioni che, nel sito desktop,
		   posso trovare nello step 1.
		<p><a href="step3">Va' a step 3.</a>
	</div>
	<script type="text/javascript" src="${ resources }/jquery/3.4.1/jquery.js"></script>
	<script type="text/javascript" src="${ resources }/popper.js/1.14.7/popper.js"></script>
	<script type="text/javascript" src="${ resources }/bootstrap/4.4.1/js/bootstrap.js"></script>
</body>
</html>