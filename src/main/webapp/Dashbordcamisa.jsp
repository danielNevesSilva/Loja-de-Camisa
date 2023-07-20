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
            <th>Nome da camisa</th>
            <th>Tamanho</th>
            <th>Ano da camisa</th>
            <th>Valor</th>

        </tr>
      <c:forEach var="Produto" items="${Produtos}">
                      <tr>
                          <td></td>
                            <td>${Produto.id}</td>
                          <td>${Produto.nomeCamisa}</td>
                          <td>${Produto.tamanho}</td>
                          <td>${Produto.anoCamisa}</td>
                          <td>${Produto.valorProduto}</td>
                         <td>
                          <a href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}/${Produto.image}">

                    <img style="width: 100px" src="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}/${Produto.image}" alt="...">
                                             </a>
                                             <form action="/delete-produto" method="post">
                                                        <input type="hidden" id="id" name="id" value="${Produto.id}">
                   <button type="submit">Delete</button>
                    <span> | </span>
              <button style="background-color: orange;"><a href="produto.jsp?id=${Produto.id}&ano_camisa=${Produto.anoCamisa}&nome_camisa=${Produto.nomeCamisa}&tamanho=${Produto.tamanho}&valor_produto=${Produto.valorProduto}&quantidade=${Produto.quantidade}&image=${Produto.image}">Alterar</a>   </button>                                                                                                        </form>
                         </td>
                      </tr>
                   </c:forEach>
    </table>
  </div>
</body>
</html>