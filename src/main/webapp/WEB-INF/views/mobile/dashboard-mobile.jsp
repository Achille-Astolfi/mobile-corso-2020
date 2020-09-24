<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="it">
<head>
<meta charset="UTF-8">
<title>Dashboard Mobile</title>
<c:url var="resources" value="/resources" />
<link rel="stylesheet"
	href="${ resources }/bootstrap/4.4.1/css/bootstrap.css" type="text/css">
</head>
<body>
	<div class="container">
		<%-- Link a sito desktop --%>
		<p><a href="${currentUrl}?site_preference=normal">Passa a sito desktop.</a></p>
		<%-- Tre box in verticale --%>
		<div class="row">
			<div class="col">
				<h1>Box 1</h1>
				<p>Lorem ipsum dolor sit amet, consectetur adipisci elit, sed do
					eiusmod tempor incidunt ut labore et dolore magna aliqua. Ut enim
					ad minim veniam, quis nostrum exercitationem ullamco laboriosam,
					nisi ut aliquid ex ea commodi consequatur. Duis aute irure
					reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
					pariatur. Excepteur sint obcaecat cupiditat non proident, sunt in
					culpa qui officia deserunt mollit anim id est laborum.</p>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<h1>Box 2</h1>
				<p>Lorem ipsum dolor sit amet, consectetur adipisci elit, sed do
					eiusmod tempor incidunt ut labore et dolore magna aliqua. Ut enim
					ad minim veniam, quis nostrum exercitationem ullamco laboriosam,
					nisi ut aliquid ex ea commodi consequatur. Duis aute irure
					reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
					pariatur. Excepteur sint obcaecat cupiditat non proident, sunt in
					culpa qui officia deserunt mollit anim id est laborum.</p>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<h1>Box 3</h1>
				<p>Lorem ipsum dolor sit amet, consectetur adipisci elit, sed do
					eiusmod tempor incidunt ut labore et dolore magna aliqua. Ut enim
					ad minim veniam, quis nostrum exercitationem ullamco laboriosam,
					nisi ut aliquid ex ea commodi consequatur. Duis aute irure
					reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
					pariatur. Excepteur sint obcaecat cupiditat non proident, sunt in
					culpa qui officia deserunt mollit anim id est laborum.</p>
			</div>
		</div>
	</div>
	
	<script type="text/javascript"
		src="${ resources }/jquery/3.4.1/jquery.js"></script>
	<script type="text/javascript"
		src="${ resources }/popper.js/1.14.7/popper.js"></script>
	<script type="text/javascript"
		src="${ resources }/bootstrap/4.4.1/js/bootstrap.js"></script>
</body>
</html>
