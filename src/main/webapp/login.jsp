<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./login.css">
    <title>Document</title>
</head>
<body>
    
<body>
    <div class="top">
      <a href="">logo</a>
      <div class="menu">
          

          <a href="/find-all-produtos">Promoções</a></P>

          <a href="">Camisas</a> </p>
    <a href="index.html">inicio</a>

          <a href="">Contato</a>
          <a href="/find-all-produtosADM">Tela ADM</a>
          <a href="/find-all-Cadastro">Tela Cad</a>

      </div>
  
      <a href="./login.html"><img src="/Loja-de-Camisa/src/imagens/foto-login.webp" alt="foto-login"></a>
      </div>
    </div>
  
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
  
      <div class="footer"></div>
  
    
</body>
</html>