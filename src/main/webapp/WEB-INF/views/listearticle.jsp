<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Liste des articles</title>
	</head>
	
	<body>
		<h3>La liste des articles enregistrés </h3>
		
		<c:forEach items="${listeArticles}" var="l">
			<h5> Nom article : ${l.nomArticle} </h5>
			<h5> Description article : ${l.descArticle} </h5>
			<h5> Prix : ${l.prix}</h5>
			<h5><a href="/app/find/${l.idArticle}">Plus d'information sur le produit</a></h5>
		</c:forEach>
	</body>
</html>
