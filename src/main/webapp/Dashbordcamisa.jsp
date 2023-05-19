<!DOCTYPE html>
<html lang="en">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

 <span>${sessionScope.nome}</span>
      <a href="/logout">Logout</a>

    <a href="produto.jsp">Adicione Produto</a>


            <th>ID</th>
            <th>Ano da camisa</th>
            <th>Nome da camisa</th>
            <th>Tamanho</th>

    <c:forEach var="Produto" items="${Produtos}">
                <tr>
                    <td></td>
                    <td>${Produto.id}</td>
                    <td>${Produto.anoCamisa}</td>
                    <td>${Produto.nomeCamisa}</td>
                    <td>${Produto.tamanho}</td>
                    <td>${Produto.valorProduto}</td>
                   <td>
                    <a href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}/${Produto.image}">

              <img style="width: 100px" src="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}/${Produto.image}" alt="...">
                                       </a>
                                       <form action="/delete-produto" method="post">
                                                  <input type="hidden" id="id" name="id" value="${Produto.id}">
             <button type="submit">Delete</button>
            span> | </span>
                     <a href="produto.jsp?=id${Produto.id}&nome=${Produto.anoCamisa}&sobrenome=${Produto.nomeCamisa}&email=${Produto.tamanho}&senha=${Produto.valorProduto}&imagem=${Produto.image}">Update</a>                                                                                                             </form>
                   </td>
                </tr>
             </c:forEach>
     </table>

</body>
</html>