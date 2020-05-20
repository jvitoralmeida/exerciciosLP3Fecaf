<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="jogos" method="post">
	<label>Nome do jogo:</label>
	<input type="text" name="nome">
	<select name="dificuldade">
		<option value="facil" selected="selected">Facil</option>
		<option value="medio">Medio</option>
		<option value="dificil">Dificil</option>
	</select>
	<input type="submit" value="adicionar" name="cmd">
	<input type="submit" value="Deletar" name="cmd">
	<input type="submit" value="Editar" name="cmd">
	<input type="submit" value="Pesquisar" name="cmd">
	</form>	
</body>
</html>