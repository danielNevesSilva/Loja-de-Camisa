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
                    <a href="/Oferta-de-camisas">CAMISAS</a>
                    <a href="https://web.whatsapp.com/send?phone=5511996701549" target="_blank">CONTATO</a>
                    <a href="/Avaliacoes">AVALIACOES</a>
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

        <h2>AVALIACOES</h2>
        </div>
        <div class="primeiro">
  <c:forEach var="Post" items="${Posts}">
        <div class="card-body">
         <a href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}/${Post.image}">
         <img style="width: 150px, height 50px" src="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}/${Post.image}" alt="...">
         </a>
                <p>Comprador: <td>${Post.username}</td></p>
                   <p>Produto: <td>${Post.title}</td></p>
                   <p>Avaliacao: <td>${Post.body}</td></p>

                </div>
            </c:forEach>

                    <title>Avaliacao de camisa</title>
                    <style>

                     form {
                                display: flex;
                                flex-direction: column;
                            }

                        label {
                            font-weight: bold;
                            margin-bottom: 5px;
                        }

                        input[type="text"],
                        textarea {
                            padding: 10px;
                            margin-bottom: 15px;
                            border: 1px solid #ccc;
                            border-radius: 4px;
                        }

                        textarea {
                            resize: vertical;
                            min-height: 100px;
                        }

                        input[type="file"] {
                            margin-bottom: 15px;
                        }

                        .Adicionar {
                            background-color: #007bff;
                            color: #fff;
                            border: none;
                            padding: 10px 20px;
                            cursor: pointer;
                            border-radius: 4px;
                        }

                        .Adicionar:hover {
                            background-color: #0056b3;
                        }
                    </style>
                </head>

                <body>
                    <div class="principal">
                        <form action="/Create-posts" method="post" enctype="multipart/form-data">

                            <h1>Faca uma avaliacao</h1>

                                <label for="username_post">Seu nome:</label>
                            <p>
                                <input id="username_post" name="username_post" required="required" type="text" placeholder="Seu nome" value="${param.username}" />
                            </p>
                                <label for="title_post"> Produto: </label>
                            <p>
                                <input id="title_post" name="title_post" required="required" type="text" placeholder="Nome da camisa" value="${param.title}" />
                            </p>

                                <label type="hidden" for="comentario_post">comentario</label>
                            <p>
                                <textarea id="comentario_post" name="comentario_post" required="required" placeholder="Digite sua avaliacao">${param.body}</textarea>
                            </p>

                            <input type="hidden" id="id" name="id" value="${param.id}">
                            <p>Selecione uma imagem para enviar: <input type="file" name="file" id="file"></p>
                            <button class="Adicionar" input type="submit" value="Adicionar comentario">Adicionar comentario</button>

                        </form>

                </div>

                <div class="voltar-topo">

                  </div>
              </div>




    <div class="footer">
      <footer></footer>
    </div>


</body>
</html>


