create database meed;

use meed;

create table produtos (cod_prod int not null auto_increment,
 qnt_prod int not null,
 nome_prod varchar(40),
 preco_venda numeric(10,2),
 primary key(cod_prod));

create table cliente(nome_cli varchar(40) not null,
 cpf char not null unique,
 data_cli date not null, primary key(cpf));  

create table compra (cod_venda int not null auto_increment,
 nome varchar(40) references cliente(nome_cli),
 data_venda date,
 vend_prod varchar(40) not null references produtos(nome_prod),
 preco_prod numeric(10,2) references produtos(preco_venda), primary key(cod_venda));
 
 
