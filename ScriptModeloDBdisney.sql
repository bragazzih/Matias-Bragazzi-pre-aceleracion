-- disney.genero definition

CREATE TABLE `genero` (
  `idgenero` bigint NOT NULL AUTO_INCREMENT,
  `imagen` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idgenero`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- disney.personaje definition

CREATE TABLE `personaje` (
  `idpersonaje` bigint NOT NULL AUTO_INCREMENT,
  `edad` bigint DEFAULT NULL,
  `historia` varchar(255) DEFAULT NULL,
  `imagen` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `peso` bigint DEFAULT NULL,
  PRIMARY KEY (`idpersonaje`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- disney.usuario definition

CREATE TABLE `usuario` (
  `idusuario` bigint NOT NULL AUTO_INCREMENT,
  `password` varchar(255) DEFAULT NULL,
  `usuario` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idusuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- disney.peliculas definition

CREATE TABLE `peliculas` (
  `idpelicula` bigint NOT NULL AUTO_INCREMENT,
  `calificacion` bigint DEFAULT NULL,
  `fecha_creacion` varchar(255) DEFAULT NULL,
  `imagen` varchar(100) DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `id_genero` bigint NOT NULL,
  PRIMARY KEY (`idpelicula`),
  KEY `FKlwtn5tnk3djdkltac8f37enr` (`id_genero`),
  CONSTRAINT `FKlwtn5tnk3djdkltac8f37enr` FOREIGN KEY (`id_genero`) REFERENCES `genero` (`idgenero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- disney.peliculas_personajes definition

CREATE TABLE `peliculas_personajes` (
  `id_pelicula` bigint NOT NULL,
  `id_personaje` bigint NOT NULL,
  KEY `FKhc14waexeynwksii18qv8yfas` (`id_personaje`),
  KEY `FKfrq4w3we1gb7yrvs8okagystt` (`id_pelicula`),
  CONSTRAINT `FKfrq4w3we1gb7yrvs8okagystt` FOREIGN KEY (`id_pelicula`) REFERENCES `peliculas` (`idpelicula`),
  CONSTRAINT `FKhc14waexeynwksii18qv8yfas` FOREIGN KEY (`id_personaje`) REFERENCES `peliculas` (`idpelicula`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
-- Correcion del query para la relacion correcta entre las tablas

