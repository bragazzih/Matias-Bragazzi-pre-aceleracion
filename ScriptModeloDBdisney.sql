
CREATE TABLE Genero ( IDgenero BIGINT PRIMARY KEY, Nombre varchar(100), Imagen varchar(100), Peliculas_series_asociadas varchar(100));

CREATE TABLE Pelicula ( IDpelicula BIGINT PRIMARY KEY, IDgenero BIGINT, Imagen varchar(100), Titulo varchar(100),  Fecha_creacion DATE, Calificacion INT, Personajes_asociados varchar(100), CONSTRAINT fkGenero FOREIGN KEY(IDgenero) REFERENCES Genero(IDgenero));

CREATE TABLE Personaje ( IDpersonaje BIGINT PRIMARY KEY, IDPelicula BIGINT, BIGINTImagen varchar(100), Nombre varchar(100),  Edad INT, Peso INT, Historia varchar (100), Peliculas_asociadas varchar(100), CONSTRAINT fkPelicula FOREIGN KEY(IDpelicula) REFERENCES Pelicula(IDpelicula));

create table Usuario ( IDusuario BIGINT PRIMARY KEY, Username varchar(100), Password varchar(100));

-- Muchos generos tienen muchas peliculas.
-- Una pelicula tiene muchos personajes.

