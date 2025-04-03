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



USE SistemaClientes;
-- Añadir más clientes para probar filtros
INSERT INTO dbo.clientes (nombre, email) VALUES
('Pedro López','pedro.lopez@example.com'),
('Ana Pérez','ana.perez@example.com'),
('María Santos','maria.santos@example.com'),
('Carlos Ruiz','carlos.ruiz@example.com');








USE SistemaClientes;
GO

-- Si ya existe, elimínala
IF OBJECT_ID('dbo.pedidos','U') IS NOT NULL
    DROP TABLE dbo.pedidos;
GO

CREATE TABLE dbo.pedidos (
    id INT IDENTITY(1,1) PRIMARY KEY,
    cliente_id INT NOT NULL,
    fecha DATE NOT NULL DEFAULT GETDATE(),
    total DECIMAL(10,2) NOT NULL,
    CONSTRAINT FK_Pedidos_Clientes FOREIGN KEY(cliente_id)
        REFERENCES dbo.clientes(id)
);
GO

-- Datos de prueba
INSERT INTO dbo.pedidos (cliente_id, total) VALUES
(2, 150.50),
(5,  99.99),
(2, 200.00);
GO

-- Verifica contenido
SELECT * FROM dbo.pedidos;
GO




