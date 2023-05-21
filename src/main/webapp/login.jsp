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

    <div class="top">
      <a href="index.html"><img style="width: 150px, height 50px" src="../../assets/images/urso_logo.png" alt=""></a>
      <div class="menu">
          

        <a href="index.html">INICIO</a>
          <a href="/find-all-produtos">CAMISAS</a></P>
          <a href="https://web.whatsapp.com/send?phone=5599111112222">CONTATO</a>
          <a href="/find-all-produtosADM">ADMIN</a>

      </div>
  
      <a href="login.jsp">  <span>LOGIN</span></a>
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
  
    
</body>

</html>