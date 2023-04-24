<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
</head>
<body>
  <div>
    <h1>ADMINISTRADOR</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>Nome</th>
            <th>Sobrenome</th>
            <th>Email</th>
            <th>Senha</th>
        </tr>
        <c:forEach var="Cadastro" items="${Cadastros}">
            <tr>
                <td></td>
                <td>${Cadastro.nome}</td>
                <td>${Cadastro.sobrenome}</td>
                <td>${Cadastro.email}</td>
                <td>${Cadastro.senha}</td>
            </tr>
        </c:forEach>
    </table>
  </div>
</body>
</html>