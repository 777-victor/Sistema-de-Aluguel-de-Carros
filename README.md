# Sistema de Aluguel de Carros

## Alunos integrantes da equipe

* Paulo Angelo
* Guilherme 
* Victor Boaventura Góes Campos

 ## Instruções de utilização
 
 ### Requisitos
 Ter java 1.9^ e Gradle 7.11^ e Mysql Server instalado, Utilizamos a IDE Intelij (Opcional)
 
 ##Configurações
 
Executar os seguintes comandos para gerar o banco: 

* mysql> create database aluguel; -- Creates the new database
* mysql> create user 'springuser'@'%' identified by 'springuser'; -- Creates the user
* mysql> grant all on db_example.* to 'springuser'@'%'; -- Gives all privileges to the new user on the newly created database
  
 
CREATE TABLE `usuario` (
  `id` bigint NOT NULL,
  `documento` varchar(255) DEFAULT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `senha` varchar(255) DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

CREATE TABLE `automovel` (
  `id` int NOT NULL,
  `marca` varchar(30) DEFAULT NULL,
  `modelo` varchar(30) NOT NULL,
  `ano` int DEFAULT NULL,
  `placa` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

CREATE TABLE `pedido` (
  `id` int NOT NULL,
  `usuario_id` bigint NOT NULL,
  `automovel_id` int NOT NULL,
  `valor` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `usuario_id` (`usuario_id`),
  KEY `automovel_id` (`automovel_id`),
  CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`usuario_id`) REFERENCES `usuario` (`id`),
  CONSTRAINT `pedido_ibfk_2` FOREIGN KEY (`automovel_id`) REFERENCES `automovel` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci



E então executar a main da classe AluguelApplication.
