-- 1) Crear la base de datos
IF DB_ID('biblioteca') IS NOT NULL
    DROP DATABASE biblioteca;
GO
CREATE DATABASE biblioteca;
GO

-- 2) Usar la base de datos recién creada
USE biblioteca;
GO

-- 3) Crear la tabla Biblioteca
CREATE TABLE dbo.Biblioteca (
    Id INT IDENTITY(1,1) PRIMARY KEY,
    Titulo VARCHAR(200) NOT NULL,
    Autor VARCHAR(150) NOT NULL,
    AñoPublicado INT NOT NULL
);
GO

-- 4) Insertar datos de prueba
INSERT INTO dbo.Biblioteca (Titulo, Autor, AñoPublicado) VALUES
('Cien años de soledad','Gabriel García Márquez',1967),
('Don Quijote de la Mancha','Miguel de Cervantes',1605),
('El amor en los tiempos del cólera','Gabriel García Márquez',1985);
GO

-- 5) Verificar contenido
SELECT * FROM dbo.Biblioteca;
GO
