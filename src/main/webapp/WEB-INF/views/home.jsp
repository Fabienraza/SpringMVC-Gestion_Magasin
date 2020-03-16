<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
	<head>
		<meta charset="utf-8">
		<title>Home page</title>
	</head>
	<body>
		<h1>bienvenue sur la page d'accueil</h1>
		<P> La date du jour : ${serverTime}.</P>
		
		<a href="/app/liste"> Liste des articles </a>
	</body>
</html>
