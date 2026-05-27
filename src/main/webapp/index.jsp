<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Biblioteca Unicesumar</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="container">

<h1>Sistema Biblioteca Unicesumar</h1>
<p>Projeto Java Web funcionando com JSP.</p>


<%
    String erro = (String) request.getAttribute("erro");

    if (erro != null) {
%>
    <p class="erro"><%= erro %></p>
<%
    }
%>

<form action="livros" method="post">
    <label>Título:</label>
    <input type="text" name="titulo">
    <br></br>
    <label>Autor:</label>
    <input type="text" name="autor">
    <br></br>
    <label>Ano:</label>
    <input type="number" name="ano">
    <br></br>
    <label>ISBN:</label>
    <input type="text" name="isbn">
    <br></br>
    <button type="submit">Cadastrar Livro</button>
</form>
</div>
<br></br>


</body>
</html>