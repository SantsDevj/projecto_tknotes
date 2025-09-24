create database tknotes
default character set utf8mb3
collate utf8mb3_general_ci;

use tknotes;
create table tarefas(
id_tarefa int auto_increment,
titulo varchar(30),
descricao text,
data_venc date,
categoria varchar(30),
prioridade varchar (50),
concluida boolean,
primary key(id_tarefa)
)default charset = utf8mb3;

alter table tarefas 
modify column titulo varchar(255);

alter table tarefas 
modify column categoria varchar(100);

alter table tarefas
modify column prioridade varchar(20);


create table usuario(
id_usuario integer primary key auto_increment,
nome_usuario varchar(30) unique,
senha varchar(8)
);

show tables;


alter table user
rename to usuario;

desc usuario;
desc tarefas;

