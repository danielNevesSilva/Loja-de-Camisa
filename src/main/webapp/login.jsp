<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./common/fonts.css">
    <link rel="stylesheet" href="./common/login1.css">
    <link rel="stylesheet" href="./common/menu.css">

    <title>Login</title>
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
                <a href="https://web.whatsapp.com/send?phone=5599111112222" target="_blank">CONTATO</a>
                <a href="/find-all-produtos">CAMISAS</a>
                <a href="/find-all-produtosADM">ADMIN</a>
                <a href="cadastro.jsp">TESTE</a>
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
                <a href="https://web.whatsapp.com/send?phone=5599111112222">CONTATO</a>
                <a href="/find-all-produtos">CAMISAS</a>
                <a href="/find-all-produtosADM">ADMIN</a>
            </nav>
        </div>

        <div class="login">
            <a href="../webapp/login.jsp"> <img src="./assets/images/login.svg" alt=""></a>
        </div>

    </div>

</header>

<!--Final Menu-->
  
      <div class="principal">
          <div class="cadastro">
  

                  <!--FORMULÁRIO DE CADASTRO-->

                      <span>${requestScope.message}</span>

                  <form action="/login" method="post">
                      <h1>Acesse sua conta</h1>
  
                      <p>
                          <label for="nome_cad">Nome</label>
                          <input id="nome_cad" name="nome_cad" required="required" type="text" placeholder="  nome" />
                      </p>
  
                      
                      <p>
                          <label for="senha_cad">Senha</label>
                          <input id="senha_cad" name="senha_cad" required="required" type="password" placeholder="  ********" />
                      </p>
                      
                            <button class="botao-login" input type="submit" value="Login">Login</button>
  
                  </form>
  
          </div>
          </form>

      </div>
  
    
</body>

</html>