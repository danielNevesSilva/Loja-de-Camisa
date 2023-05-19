<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="index.css">
    <title>Cadrastro</title>
</head>

<body>
  <div class="top">

    <a href="">logo</a>
    <div class="menu">

        <a href="/find-all-produtos">Promoções</a>
        <a href="">Camisas</a>


        <a href="">Contato</a>
            <a href="/find-all-produtosADM">Tela ADM</a>
          <a href="/find-all-Cadastro">Tela Cad</a>

        
    </div>

    <a href="./login.html"><img src="/Loja-de-Camisa/src/imagens/foto-login.webp" alt="foto-login"></a>
    </div>
  </div>

    <div class="principal">
        <div class="cadastro">

            <form action="/create-account" method="post">

                <!--FORMULÁRIO DE CADASTRO-->

                <form method="post" action="">
                    <h1>Cadastro</h1>

                    <p>
                        <label for="nome_cad">Nome</label>
                        <input id="nome_cad" name="nome_cad" required="required" type="text" placeholder="  nome"  value="${param.nome}"/>
                    </p>

                    <p>
                        <label for="nome_cad">Sobrenome</label>
                        <input id="sobrenome_cad" name="sobrenome_cad" required="required" type="text"
                            placeholder="  sobrenome"  value="${param.sobrenome}" />
                    </p>

                    <p>
                        <label for="email_cad">E-mail</label>
                        <input id="email_cad" name="email_cad" required="required" type="email"
                            placeholder="  contato@htmlecsspro.com"  value="${param.email}" />
                    </p>

                    <p>
                        <label for="senha_cad">Senha</label>
                        <input id="senha_cad" name="senha_cad" required="required" type="password" placeholder="  ********"  value="${param.senha}" />
                    </p>
                    <p>
                        <label for="senha_cad">Confirme senha</label>
                        <input id="confsenha_cad" name="confsenha_cad" required="required" type="password"
                            placeholder="  ********" />
                    </p>


                    <input type="hidden" id="id" name="id" value="${param.id}">
                        <button class="botao-cadastro" input type="submit" value="Cadastrar" > Cadastrar</button>

                </form>


        </div>
        </form>
        <p class="link">
             <label for="">Login</label>
            <a href="login.jsp"><button class="botao-login">Login</button>  </a>
        </p>
    </div>

    <div class="footer"></div>

</body>

</html>