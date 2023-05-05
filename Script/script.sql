create database CamisaFutebol;

use CamisaFutebol;

create table administrador(
id_adm int primary key not null auto_increment,
nome varchar(40),
sobrenome varchar(100),
email varchar(100),
senha varchar(10)
);

create table produto(
id_produto int primary key not null auto_increment,
imagemCamisa Varbinary (max)
nomeCamisa varchar(100),
nomeAno varchar(100),
tamanho char(2),
preco decimal(5,2),
quantidade varchar(4),
descricao text

);