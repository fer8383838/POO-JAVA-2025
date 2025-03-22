-- 1?? Crear (o recrear) la base de datos
IF DB_ID('SistemaClientes') IS NOT NULL
    DROP DATABASE SistemaClientes;
GO

CREATE DATABASE SistemaClientes;
GO

-- 2?? Crear la tabla clientes
USE SistemaClientes;
GO

CREATE TABLE dbo.clientes (
    id INT IDENTITY(1,1) PRIMARY KEY,
    nombre NVARCHAR(100) NOT NULL,
    email NVARCHAR(100) NOT NULL
);
GO

-- 3?? Insertar datos de ejemplo
INSERT INTO dbo.clientes (nombre, email) VALUES
('Juan Pérez','juan.perez@example.com'),
('María García','maria.garcia@example.com'),
('Luis Rodríguez','luis.rodriguez@example.com');
GO

-- 4?? Verificar que todo funcione
SELECT * FROM dbo.clientes;
GO