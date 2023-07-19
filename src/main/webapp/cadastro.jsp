<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./common/cadastro1.css">
    <link rel="stylesheet" href="./common/fonts.css">
    <link rel="stylesheet" href="./common/menu.css">
    <title>Cadrastro</title>
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
                <a href="/Oferta-de-camisas">CAMISAS</a>
                <a href="/Lista-de-camisas">ADMIN</a>

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
            <a href="./login.jsp"> <img src="./assets/images/login.svg" alt=""></a>
        </div>

    </div>

</header>

<!--Final Menu-->

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