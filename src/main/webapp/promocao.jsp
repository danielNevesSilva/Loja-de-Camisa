<!DOCTYPE html>
<html >
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ofertas</title>

   <link rel="stylesheet" href="promocao.css">

   <link href="https://fonts.googleapis.com/icon?family=Material+Icons"
   rel="stylesheet">

</head>
<body>
    <div class="header">
        <div class="logo-inicio">
        <h6>LOGO</h6> 
        </div>

       <div class="direto">

        <a href="index.html">INICIO</a>
        <a href="/find-all-produtos">CAMISAS</a>
        <a href="https://web.whatsapp.com/send?phone=5599111112222">CONTATO</a>
        <a href="#">QUEM-SOMOS</a>
        <a href="login.jsp">LOGIN</a>
     </div>

     <div class="icons">
        <span class="material-icons"> shopping_cart</span>
        <a href="./login.html">
        <span class="material-icons">account_circle</span>
     </div>
       
    </div>

    <div class="principal">

        <div class="promocao">
         
        <h2>Ofertas</h2>
        </div>
        <div class="primeiro">
              <c:forEach var="Produto" items="${Produtos}">
              <a href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}/${Produto.image}">
                <img style="width: 150px, height 50px" src="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}/${Produto.image}" alt="...">
                </a>
                <div class="card-body">
                    <p>Ano da camisa <td>${Produto.anoCamisa}</td></p>
                    <p>Tamanho <td>${Produto.tamanho}</td>
                    <p class="frete">Frete Grátis</p>
                    <p>Valor <td>${Produto.valorProduto}</td></p>
                </div>
              </c:forEach>
              
            
                </div>
                <div class="voltar-topo">
                  <button>Voltar ao topo</button>
                  </div>
              </div>
        
    
   
    

    
    <div class="footer">
      <footer></footer>  
    </div>
    
    
</body>
</html>