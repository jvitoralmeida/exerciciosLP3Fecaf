<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%if(request.getAttribute("action") != null){%>
		<h2><%out.println("Voce executou um(a): " + request.getAttribute("action")); %></h2>
		<h2><%out.println("Nome digitado: " + request.getAttribute("nome"));  %></h2>
		<h2><%out.println("Dificuldade digitada: " + request.getAttribute("dificuldade"));  %></h2>
	<%}%>
</body>
</html>