<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="produto1.css">
    <title>Cadastrar Produto</title>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>
<body>
<div class="header">
    <div class="logo-inicio">
        <h6>LOGO</h6>
    </div>
    <div class="direto">
        <a href="index.html">INICIO</a>
        <a href="/find-all-produtos">CAMISAS</a>
        <a href="https://web.whatsapp.com/send?phone=5599111112222" target="_blank">CONTATO</a>
        <a href="#">QUEM SOMOS</a>
        <a href="/find-all-produtosADM">ADMIN</a>
    </div>

    <div class="icons">
        <a href="login.jsp"><span class="material-icons">account_circle</span></a>
    </div>
</div>
<div class="topo">
    <h2>Adicionar Produto:</h2>

</div>
<div class="cadastro">
    <div class="informacoes">
        <form action="/create-image" method="post" enctype="multipart/form-data">
            <p>Ano da camisa:</p>
            <input id="ano_camisa" name="ano_camisa" required="required" value="${param.ano_camisa}" type="month">
            <p>Nome da camisa:</p>
            <input id="nome_camisa" name="nome_camisa" required="required" value="${param.nome_camisa}" type="text">
            <p>Tamanho do produto:</p>
            <div class="rd">

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
            <p hide>Quantidade</p>
            <input id="quantidade" name="quantidade" required="required" type="number">
    </div>
    <div class="descricao">
        <input type="hidden" id="id" name="id" value="${param.id}">
        Selecione uma imagem para enviar: <input type="file" name="file" id="file"><br>
        <input type="submit" value="Enviar">
        </form>
    </div>
</div>

</body>

</html>
