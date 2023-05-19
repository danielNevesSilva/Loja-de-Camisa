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

        <a href="promocao.html">Ofertas</a>

        <a href="/find-all-produtos">Promoções</a>

        <a href="">Camisas</a>
        <a href="index.jsp">Cadastre-se</a>
        <a href="">Contato</a>
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
        <div class="principal">
        <div class="primeiro">
            <div class="card" style="width: 18rem;">
                <img class="card-img-top" src="img/1683927405453-Mantosagrado.webp" alt="camisetaTime">
                <div class="card-body">
                    <p>Camisa São Paulo |</p>
                    <p>23/24 S/ Nº Jogador</p>
                    <p>Adidas Masculino</p>
                    <p class="frete">Frete Grátis</p>
                    <h4 class="valor">R$ 429,90</h4>
                </div>
              </div>

              <div class="card" style="width: 18rem;">
 <table>

         <c:forEach var="Produto" items="${Produtos}">
            <tr>
                <td></td>
                <td>${Produto.anoCamisa}</td>
                <td>${Produto.nomeCamisa}</td>
                <td>${Produto.tamanho}</td>
                <td>${Produto.valorProduto}</td>
               <td>
                <a href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}/${Produto.image}">

          <img style="width: 150px, height 50px" src="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}/${Produto.image}" alt="...">

                                   </a>
               </td>
            </tr>
         </c:forEach>
 </table>
                </div>
              </div>
              <div class="card" style="width: 18rem;">
                <img class="card-img-top" src="img/Camisa%20do%20São%20Paulo.webp" alt="camisetaTime">
                <div class="card-body">
                    <p>Camisa São Paulo |</p>
                    <p>23/24 S/ Nº Jogador</p>
                    <p>Adidas Masculino</p>
                    <p class="frete">Frete Grátis</p>
                    <h4 class="valor">R$ 429,90</h4>
                </div>
              </div>
            </div>
    

            <div class="segundo">
                <div class="card" style="width: 18rem;">
                    <img class="card-img-top" src="img/Camisa%20do%20São%20Paulo.webp" alt="camisetaTime">
                    <div class="card-body">
                        <p>Camisa São Paulo |</p>
                        <p>23/24 S/ Nº Jogador</p>
                        <p>Adidas Masculino</p>
                        <p class="frete">Frete Grátis</p>
                        <h4 class="valor">R$ 429,90</h4>
                    </div>
                  </div>
    
                  <div class="card" style="width: 18rem;">
                    <img class="card-img-top" src="img/Camisa%20do%20São%20Paulo.webp" alt="camisetaTime">
                    <div class="card-body">
                        <p>Camisa São Paulo |</p>
                        <p>23/24 S/ Nº Jogador</p>
                        <p>Adidas Masculino</p>
                        <p class="frete">Frete Grátis</p>
                        <h4 class="valor">R$ 429,90</h4>
                    </div>
                  </div>
    
                  <div class="card" style="width: 18rem;">
                    <img class="card-img-top" src="img/Camisa%20do%20São%20Paulo.webp" alt="camisetaTime">
                    <div class="card-body">
                        <p>Camisa São Paulo |</p>
                        <p>23/24 S/ Nº Jogador</p>
                        <p>Adidas Masculino</p>
                        <p class="frete">Frete Grátis</p>
                        <h4 class="valor">R$ 429,90</h4>
                    </div>
                  </div>
                </div>

                <div class="terceiro">
                    <div class="card" style="width: 18rem;">
                        <img class="card-img-top" src="img/Camisa%20do%20São%20Paulo.webp" alt="camisetaTime">
                        <div class="card-body">
                            <p>Camisa São Paulo |</p>
                            <p>23/24 S/ Nº Jogador</p>
                            <p>Adidas Masculino</p>
                            <p class="frete">Frete Grátis</p>
                            <h4 class="valor">R$ 429,90</h4>
                        </div>
                      </div>
        
                      <div class="card" style="width: 18rem;">
                        <img class="card-img-top" src="img/Camisa%20do%20São%20Paulo.webp" alt="camisetaTime">
                        <div class="card-body">
                            <p>Camisa São Paulo |</p>
                            <p>23/24 S/ Nº Jogador</p>
                            <p>Adidas Masculino</p>
                            <p class="frete">Frete Grátis</p>
                            <h4 class="valor">R$ 429,90</h4>
                        </div>
                      </div>
        
                      <div class="card" style="width: 18rem;">
                        <img class="card-img-top" src="img/Camisa%20do%20São%20Paulo.webp" alt="camisetaTime">
                        <div class="card-body">
                            <p>Camisa São Paulo |</p>
                            <p>23/24 S/ Nº Jogador</p>
                            <p>Adidas Masculino</p>
                            <p class="frete">Frete Grátis</p>
                            <h4 class="valor">R$ 429,90</h4>
                        </div>
                      </div>
                    </div>

        <div class="voltar-topo">
        <button>Voltar ao topo</button>
        </div>
    </div>
    

    <footer>
    <div class="footer">
      
    </div>
    </footer>
    
</body>
</html>