# Sistema de Aluguel de Carros

## Alunos integrantes da equipe

* Paulo Angelo
* Guilherme 
* Victor Boaventura Góes Campos

 ## Instruções de utilização
 
 ### Requisitos
 Ter java 1.9^ e Gradle 7.11^ e Mysql Server instalado, Utilizamos a IDE Intelij
 
 ##Configurações
 
Executar os seguintes comandos para gerar o banco: 

* mysql> create database aluguel; -- Creates the new database
* mysql> create user 'springuser'@'%' identified by 'springuser'; -- Creates the user
* mysql> grant all on db_example.* to 'springuser'@'%'; -- Gives all privileges to the new user on the newly created database

 
 CREATE TABLE aluguel.usuario (
	id int unsigned auto_increment NOT NULL,
	documento varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
	nome varchar(120) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
	endereco varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
	senha varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
	tipo varchar(100) NULL,
	CONSTRAINT `PRIMARY` PRIMARY KEY (id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE=utf8_general_ci
COMMENT='';

E então executar a main da classe AluguelApplication.
