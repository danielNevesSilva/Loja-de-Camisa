<!DOCTYPE html>
<html >
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./common/fonts.css">
    <link rel="stylesheet" href="./common/menu.css">
    <link rel="stylesheet" href="./common/promocao1.css">

    <title>CAMISAS</title>

   <link href="https://fonts.googleapis.com/icon?family=Material+Icons"
   rel="stylesheet">

</head>
<body>

<!--Inicio Menu-->
<header>
    <div class="container">

        <div class="logo">
            <a href="./index.html"><img src="./assets/images/urso_logo.png" alt=""></a>
        </div>

        <div class="menu">
            <nav>
                <a href="index.html">INICIO</a>
                <a href="/find-all-produtos">CAMISAS</a>
                <a href="https://web.whatsapp.com/send?phone=5599111112222" target="_blank">CONTATO</a>
                <a href="./time.html">QUEM SOMOS</a>

            </nav>
        </div>

        <button onclick="animarMenu()" id="btn-menu">
            <span class="linha"></span>
            <span class="linha"></span>
            <span class="linha"></span>
        </button>

        <!-- Menu Responsivo -->

        <div class="menu-mobile">
            <nav>
                <a href="index.html">INICIO</a>
                <a href="/find-all-produtos">CAMISAS</a>
                <a href="https://web.whatsapp.com/send?phone=5511996701549">CONTATO</a>
                <a href="./time.html">QUEM SOMOS</a>
            </nav>
        </div>

        <div class="login">
                   <a href="./login.jsp"> <img src="./assets/images/login.svg" alt=""></a>
               </div>

    </div>

</header>

<!--Final Menu-->

    <div class="principal">

        <div class="promocao">
         
        <h2>OFERTAS</h2>
        </div>
        <div class="primeiro">
  <c:forEach var="Produto" items="${Produtos}">
        <div class="card-body">

                              <a href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}/${Produto.image}">
                                <img style="width: 150px, height 50px" src="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}/${Produto.image}" alt="...">
                                </a>

                   <p>Camisa: <td>${Produto.nomeCamisa}</td></P>
                   <p>Tamanho: <td>${Produto.tamanho}</td></p>
                   <p> Valor: <td>${Produto.valorProduto}</td></p>
                    <p>Ano da camisa: <td>${Produto.anoCamisa}</td></p>
                     <button><p class="frete"> <a href="https://web.whatsapp.com/send?phone=5511996701549" target="_blank">Comprar</a> </p></button>
                </div>
            </c:forEach>

            
                </div>

                <div class="voltar-topo">

                  </div>
              </div>


    
    <div class="footer">
      <footer></footer>  
    </div>

    
</body>
</html>