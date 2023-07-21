
create table administrador(
id_adm int primary key not null auto_increment,
nome varchar(40),
sobrenome varchar(100),
email varchar(100),
senha varchar(10)
);

create table produto(
id_produto int primary key not null auto_increment,
anocamisa varchar(100),
nomecamisa varchar(100),
tamanho char(2),
preco decimal(5,2),
quantidade varchar(4),
image varchar(255)
);

create table POST(
id_produto int primary key not null auto_increment,
USERNAME varchar(40),
TITLE varchar(100),
BODY varchar(100),
IMAGE varchar(255)
);

