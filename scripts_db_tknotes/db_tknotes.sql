create database tknotes
default character set utf8mb3
collate utf8mb3_general_ci;

use tknotes;
create table tarefas(
id_tarefa int auto_increment,
titulo varchar(255),
descricao text,
data_venc date,
categoria varchar(100),
prioridade varchar (20),
concluida boolean,
primary key(id_tarefa)
)default charset = utf8mb3;


create table usuario(
id_usuario integer primary key auto_increment,
nome_usuario varchar(30) unique,
senha varchar(8)
);


