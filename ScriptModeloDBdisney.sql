CREATE TABLE Pelicula ( Id_pelicula BIGINT PRIMARY KEY, Imagen varchar(100), Titulo varchar(100),  Fecha_creacion DATE, Calificacion INT, Personajes_asociados BIGINT);

CREATE TABLE Genero ( Id_genero BIGINT PRIMARY KEY, Id_pelicula BIGINT, Nombre varchar(100), Imagen varchar(100), Peliculas_series_asociadas BIGINT, CONSTRAINT Peliculas_series_asociadas FOREIGN KEY(Id_pelicula) REFERENCES Pelicula(Id_pelicula));

CREATE TABLE Personaje ( Id_personaje BIGINT PRIMARY KEY, Id_Pelicula BIGINT, Imagen varchar(100), Nombre varchar(100),  Edad INT, Peso INT, Historia varchar (100), Peliculas_asociadas BIGINT, CONSTRAINT Peliculas_Asociadas FOREIGN KEY(Id_pelicula) REFERENCES Pelicula(Id_pelicula));

create table Usuario ( Id_usuario BIGINT PRIMARY KEY, Username varchar(100), Password varchar(100));

ALTER TABLE Pelicula add constraint Personajes_asociados FOREIGN key (Personajes_asociados) REFERENCES Personaje (Id_personaje);

-- Correcion del query para la relacion correcta entre las tablas


