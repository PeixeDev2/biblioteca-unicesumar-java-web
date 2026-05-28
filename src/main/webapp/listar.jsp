
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="model.Livro" %>

<%-- Recupera a lista de livros enviada pelo Servlet. --%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Livros</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

<h1>Livros Cadastrados</h1>

<%
    List<Livro> livros = (List<Livro>) request.getAttribute("livros");

    if (livros == null || livros.isEmpty()) {
%>

<p>Nenhum livro cadastrado.</p>

<%
} else {
%>

<table border="1">
    <tr>
        <th>ID</th>
        <th>Título</th>
        <th>Autor</th>
        <th>Ano</th>
        <th>ISBN</th>
        <th>Ação</th>

    </tr>

    <%
        for (Livro livro : livros) {
    %>
    <!-- Tabela responsável por exibir os livros cadastrados -->
    <tr>
        <td><%= livro.getId() %></td>
        <td><%= livro.getTitulo() %></td>
        <td><%= livro.getAutor() %></td>
        <td><%= livro.getAnopublicacao()%></td>
        <td><%= livro.getIsbn() %></td>
        <td>
            <a href="livros?acao=excluir&id=<%= livro.getId() %>">Excluir</a>
        </td>
    </tr>

    <%
        }
    %>

</table>

<%
    }
%>

<br>
<a href="index.jsp">Cadastrar novo livro</a>

</body>
</html>