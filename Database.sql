CREATE DATABASE WebKeep;
USE WebKeep;

CREATE  TABLE Usuarios (
id_usuario INT NOT NULL AUTO_INCREMENT,
email VARCHAR(50) NOT NULL,
nome VARCHAR(50) NOT NULL,
sobrenome VARCHAR(50) NOT NULL,
senha VARCHAR(50) NOT NULL,
PRIMARY KEY (id_usuario)
);

CREATE TABLE Notas (
id_nota INT NOT NULL AUTO_INCREMENT,
id_usuario INT NOT NULL REFERENCES Usuarios(id_usuario),
tipo_nota INT NOT NULL,
conteudo_nota TEXT,
categoria INT REFERENCES Categoria(id_categoria),
PRIMARY KEY (id_nota)
);

CREATE TABLE Categorias (
id_categoria INT NOT NULL AUTO_INCREMENT,
id_usuario INT NOT NULL REFERENCES Usuarios(id_usuario),
categoria VARCHAR(50),
PRIMARY KEY (id_categoria)
);