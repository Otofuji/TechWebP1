CREATE DATABASE WebKeep;
USE WebKeep;

CREATE  TABLE usuario (
id_usuario INT NOT NULL AUTO_INCREMENT,
email VARCHAR(50) NOT NULL,
nome VARCHAR(50) NOT NULL,
sobrenome VARCHAR(50) NOT NULL,
senha VARCHAR(50) NOT NULL,
PRIMARY KEY (id_usuario)
);

CREATE TABLE notas (
id_nota INT NOT NULL AUTO_INCREMENT,
id_usuario INT NOT NULL REFERENCES usuario(id_usuario),
tipo_nota INT NOT NULL,
conteudo_nota TEXT,
categoria INT REFERENCES categoria(id_categoria),
PRIMARY KEY (id_nota)
);

CREATE TABLE categoria (
id_categoria INT NOT NULL AUTO_INCREMENT,
id_usuario INT NOT NULL REFERENCES usuario(id_usuario),
categoria VARCHAR(50),
PRIMARY KEY (id_categoria)
);