<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="produto.css">
    <title>Cadastrar Produto</title>

    <link href="https://fonts.googleapis.com/icon?family=Material+Icons"
          rel="stylesheet">
</head>

<body>
<div class="header">
    <div class="logo-inicio">
        <h6>LOGO</h6>
    </div>

    <div class="direto">

        <a href="find-all-produtos">Promoções</a>

        <a href="">Camisas</a>

        <a href="">Contato</a>

         <a href="/find-all-produtosADM">Tela ADM</a>
         <a href="/find-all-Cadastro">Tela Cad</a>

    </div>

    <div class="icons">
        <span class="material-icons"> shopping_cart</span>
        <span class="material-icons">account_circle</span>
    </div>
</div>

<div class = "topo">
    <h2>Adicionar Produto:</h2>
    <p>Todos os campos são obrigatórios para adicionar um produto a loja </p>

</div>

<div class= "cadastro">
    <div class="informacoes">

        <form action="/create-image" method="post" enctype="multipart/form-data">

        <p>Imagem:</p>
        <a href="./login.html"><img src="./Loja-de-Camisa/src/imagens/foto-login.webp" alt="foto-login"></a>
        <p>Ano da camisa:</p>
        <input  id="ano_camisa" name="ano_camisa" required="required" value="${param.ano_camisa}" type="month">
        <p>Nome da camisa:</p>
        <input id="nome_camisa" name="nome_camisa" required="required" value="${param.nome_camisa}" type="text">

        <p>Tamanho do produto:</p>

        <div class="rd">
            <p>P M G GG</p>
            <input id="P" name="tamanho" value="P" type="radio">
            <label for="P">P</label>

            <input id="M" name="tamanho" value="M" type="radio">
            <label for="M">M</label>

            <input id="G" name="tamanho" value="G" type="radio">
            <label for="G">G</label>

            <input id="GG" name="tamanho" value="GG" type="radio">
            <label for="GG">GG</label>


        </div>

        <p>Valor do produto:</p>
        <input id="valor_produto" name="valor_produto" required="required" value="${param.valor_camisa}" type="number">
        <p>Quantidade</p>
        <input id="quantidade" name="quantidade" required="required" type="number">

    </div>

    <div class="descricao">

        <p>Nome:</p>
        <p>Tamanho:</p>
        <p>Preço R$:</p>

<input type="hidden" id="id" name="id" value="${param.id}">
            Selecione uma imagem para enviar: <input type="file" name="file" id="file"><br>
            <input type="submit" value="Enviar">
        </form>

        <div>
        <button class="confirmar"> Confirmar sua cadastro</button>
        </div>

        <div>
        <button class="dcr">Voltar ao logo</button>
        </div>
    </div>

</div>
<div class="rodape">
<p>      </p>
</div>
</body>
</html>