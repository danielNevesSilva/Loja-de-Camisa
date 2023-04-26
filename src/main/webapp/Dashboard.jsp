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

        </tr>
        <c:forEach var="Cadastro" items="${Cadastros}">
            <tr>
                <td></td>
                <td>${Cadastro.id}</td>
                <td>${Cadastro.nome}</td>
                <td>${Cadastro.sobrenome}</td>
                <td>${Cadastro.email}</td>
                <td>
                 <form action="/delete-cadastro" method="post">
           <input type="hidden" id="id" name="id" value="${Cadastro.id}">
                                    <button type="submit">Delete</button>
                                    <span> | </span>
<a href="index.jsp?=id${Cadastro.id}&nome=${Cadastro.nome}&sobrenome=${Cadastro.sobrenome}&email=${Cadastro.email}&senha=${Cadastro.senha}">Update</a>
                                    </form>
                                  </td>
            </tr>
        </c:forEach>
    </table>
  </div>
</body>
</html>