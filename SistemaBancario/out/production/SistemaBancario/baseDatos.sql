CREATE DATABASE SistemaBancario;
GO

USE SistemaBancario;
GO

CREATE TABLE dbo.cuentas (
    id INT IDENTITY(1,1) PRIMARY KEY,
    nombre NVARCHAR(100) NOT NULL,
    saldo DECIMAL(10,2) NOT NULL
);
GO

INSERT INTO dbo.cuentas (nombre, saldo) VALUES
('Cuenta A', 1000.00),
('Cuenta B', 500.00);
GO

SELECT * FROM dbo.cuentas;
GO
