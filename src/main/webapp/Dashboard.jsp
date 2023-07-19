<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<link rel="stylesheet" href="Dashbord.css">
    <meta charset="UTF-8">
    <title>Dashboard</title>
</head>
<body>
  <div>
  <div class = "navbar">
   <span>${sessionScope.nome}</span>
 <p>  <a href="index.html">INICIO</a></p>
 <p>  <a href="produto.jsp">Adicione Produto</a></p>
 <p> <a href="cadastro.jsp"> Adicione usuario</a></p>
    <p><a href="/Cadastros">Lista de Usuarios</a></p>
    <p><a href="/Lista-de-camisas">Lista de produtos</a></p>
        <p><a href="/logout">Logout</a></p>

</div>
    <h1>ADMINISTRADOR</h1>
    <table>
        <tr>
        <th> </th>
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
      <button style="background-color: orange;" "text-decoration: none;" ><a href="cadastro.jsp?=id${Cadastro.id}&nome=${Cadastro.nome}&sobrenome=${Cadastro.sobrenome}&email=${Cadastro.email}&senha=${Cadastro.senha}">Alterar</a> </button>
                                    </form>
                                  </td>
            </tr>
        </c:forEach>

    </table>
  </div>
</body>
</html>