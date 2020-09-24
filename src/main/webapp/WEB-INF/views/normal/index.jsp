<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="it">
<head>
<meta charset="UTF-8">
<title>Spring Mobile</title>
<c:url var="resources" value="/resources" />
<link rel="stylesheet"
	href="${ resources }/bootstrap/4.4.1/css/bootstrap.css" type="text/css">
</head>
<body>
	<div class="container">
		<h1>Spring Mobile</h1>
		<p>Il tuo dispositivo è ottimizzato per la versione
		<c:if test="${ currentDevice.normal }">desktop</c:if>
		<c:if test="${ currentDevice.tablet }">tablet</c:if>
		<c:if test="${ currentDevice.mobile }">mobile</c:if>
		del sito.</p>
		<p>Questo è il sito desktop; <a href="${currentUrl}?site_preference=mobile">passa a sito mobile.</a></p>
	</div>
	<script type="text/javascript"
		src="${ resources }/jquery/3.4.1/jquery.js"></script>
	<script type="text/javascript"
		src="${ resources }/popper.js/1.14.7/popper.js"></script>
	<script type="text/javascript"
		src="${ resources }/bootstrap/4.4.1/js/bootstrap.js"></script>
</body>
</html>
