-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Cliente` (
  `idCliente` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(45) NOT NULL,
  `Apelldio_Pat` VARCHAR(45) NOT NULL,
  `Apellido_Mat` VARCHAR(45) NOT NULL,
  `Direccion` VARCHAR(45) NOT NULL,
  `Direccio_Fiscal` VARCHAR(45) NOT NULL,
  `RFC` VARCHAR(45) NOT NULL,
  `Telefono` INT NOT NULL,
  `Email` VARCHAR(45) NOT NULL,
  `Membresia` TINYINT(1) NOT NULL,
  PRIMARY KEY (`idCliente`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Recursos_Humanos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Recursos_Humanos` (
  `idCliente` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(45) NOT NULL,
  `Apelldio_Pat` VARCHAR(45) NOT NULL,
  `Apellido_Mat` VARCHAR(45) NOT NULL,
  `Direccion` VARCHAR(45) NOT NULL,
  `Telefono` INT NOT NULL,
  `Email` VARCHAR(45) NOT NULL,
  `Puesto` VARCHAR(45) NOT NULL,
  `Salario` INT NOT NULL,
  PRIMARY KEY (`idCliente`),
  UNIQUE INDEX `idCliente_UNIQUE` (`idCliente` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Activo_Fijo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Activo_Fijo` (
  `idActivo_Fijo` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(45) NOT NULL,
  `Descrippcion` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`idActivo_Fijo`),
  UNIQUE INDEX `idActivo_Fijo_UNIQUE` (`idActivo_Fijo` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Citas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Citas` (
  `idCitas` INT NOT NULL AUTO_INCREMENT,
  `Hora` TIMESTAMP NOT NULL,
  `Descripccion` VARCHAR(100) NOT NULL,
  `FK_Cliente` INT NOT NULL,
  `FK_Recursos_Humanos` INT NOT NULL,
  PRIMARY KEY (`idCitas`),
  INDEX `fk_Citas_Cliente1_idx` (`FK_Cliente` ASC),
  INDEX `fk_Citas_Recursos_Humanos1_idx` (`FK_Recursos_Humanos` ASC),
  UNIQUE INDEX `idCitas_UNIQUE` (`idCitas` ASC),
  CONSTRAINT `fk_Citas_Cliente1`
    FOREIGN KEY (`FK_Cliente`)
    REFERENCES `mydb`.`Cliente` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Citas_Recursos_Humanos1`
    FOREIGN KEY (`FK_Recursos_Humanos`)
    REFERENCES `mydb`.`Recursos_Humanos` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Reporte_Ingresos_Egresos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Reporte_Ingresos_Egresos` (
  `idReporte_Ingresos_Egresos` INT NOT NULL AUTO_INCREMENT,
  `Fecha_Horal` TIMESTAMP NOT NULL,
  PRIMARY KEY (`idReporte_Ingresos_Egresos`),
  UNIQUE INDEX `idReporte_Ingresos_Egresos_UNIQUE` (`idReporte_Ingresos_Egresos` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Barberia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Barberia` (
  `idBarberia` INT NOT NULL AUTO_INCREMENT,
  `Direccion` VARCHAR(100) NOT NULL,
  `Nombre` VARCHAR(100) NOT NULL,
  `FK_Cliente` INT NOT NULL,
  `FK_Recursos_Humanos` INT NOT NULL,
  `FK_Citas` INT NOT NULL,
  `FK_Activo_Fijo` INT NOT NULL,
  `FK_Reporte_Ingresos_Egresos` INT NOT NULL,
  PRIMARY KEY (`idBarberia`),
  INDEX `fk_Barberia_Cliente_idx` (`FK_Cliente` ASC),
  INDEX `fk_Barberia_Recursos_Humanos1_idx` (`FK_Recursos_Humanos` ASC),
  INDEX `fk_Barberia_Citas1_idx` (`FK_Citas` ASC),
  INDEX `fk_Barberia_Activo_Fijo1_idx` (`FK_Activo_Fijo` ASC),
  INDEX `fk_Barberia_Reporte_Ingresos_Egresos1_idx` (`FK_Reporte_Ingresos_Egresos` ASC),
  UNIQUE INDEX `idBarberia_UNIQUE` (`idBarberia` ASC),
  CONSTRAINT `fk_Barberia_Cliente`
    FOREIGN KEY (`FK_Cliente`)
    REFERENCES `mydb`.`Cliente` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Barberia_Recursos_Humanos1`
    FOREIGN KEY (`FK_Recursos_Humanos`)
    REFERENCES `mydb`.`Recursos_Humanos` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Barberia_Citas1`
    FOREIGN KEY (`FK_Citas`)
    REFERENCES `mydb`.`Citas` (`idCitas`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Barberia_Activo_Fijo1`
    FOREIGN KEY (`FK_Activo_Fijo`)
    REFERENCES `mydb`.`Activo_Fijo` (`idActivo_Fijo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Barberia_Reporte_Ingresos_Egresos1`
    FOREIGN KEY (`FK_Reporte_Ingresos_Egresos`)
    REFERENCES `mydb`.`Reporte_Ingresos_Egresos` (`idReporte_Ingresos_Egresos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Factura`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Factura` (
  `idFactura` INT NOT NULL AUTO_INCREMENT,
  `FK_Recursos_Humanos` INT NOT NULL,
  `FK_Cliente` INT NOT NULL,
  `FK_Barberia` INT NOT NULL,
  PRIMARY KEY (`idFactura`),
  INDEX `fk_Factura_Recursos_Humanos1_idx` (`FK_Recursos_Humanos` ASC),
  INDEX `fk_Factura_Cliente1_idx` (`FK_Cliente` ASC),
  INDEX `fk_Factura_Barberia1_idx` (`FK_Barberia` ASC),
  UNIQUE INDEX `idFactura_UNIQUE` (`idFactura` ASC),
  CONSTRAINT `fk_Factura_Recursos_Humanos1`
    FOREIGN KEY (`FK_Recursos_Humanos`)
    REFERENCES `mydb`.`Recursos_Humanos` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Factura_Cliente1`
    FOREIGN KEY (`FK_Cliente`)
    REFERENCES `mydb`.`Cliente` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Factura_Barberia1`
    FOREIGN KEY (`FK_Barberia`)
    REFERENCES `mydb`.`Barberia` (`idBarberia`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Tiket`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Tiket` (
  `idTiket` INT NOT NULL AUTO_INCREMENT,
  `Hora` TIMESTAMP NOT NULL,
  `Descripcion` VARCHAR(100) NOT NULL,
  `Monto` INT NOT NULL,
  `Total` INT NOT NULL,
  `FK_Cliente` INT NOT NULL,
  PRIMARY KEY (`idTiket`),
  INDEX `fk_Tiket_Cliente1_idx` (`FK_Cliente` ASC),
  UNIQUE INDEX `idTiket_UNIQUE` (`idTiket` ASC),
  CONSTRAINT `fk_Tiket_Cliente1`
    FOREIGN KEY (`FK_Cliente`)
    REFERENCES `mydb`.`Cliente` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Stock_Producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Stock_Producto` (
  `idStock_Producto` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(45) NOT NULL,
  `Descripcion` VARCHAR(100) NOT NULL,
  `Stock` INT NOT NULL,
  `Fecha_Estimada` TIMESTAMP NOT NULL,
  `Cantidad` INT NOT NULL,
  `FK_Activo_Fijo` INT NOT NULL,
  PRIMARY KEY (`idStock_Producto`),
  INDEX `fk_Stock_Producto_Activo_Fijo1_idx` (`FK_Activo_Fijo` ASC),
  UNIQUE INDEX `idStock_Producto_UNIQUE` (`idStock_Producto` ASC),
  CONSTRAINT `fk_Stock_Producto_Activo_Fijo1`
    FOREIGN KEY (`FK_Activo_Fijo`)
    REFERENCES `mydb`.`Activo_Fijo` (`idActivo_Fijo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Reporte_Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Reporte_Cliente` (
  `idReporte_Cliente` INT NOT NULL AUTO_INCREMENT,
  `No_Visitas` VARCHAR(45) NOT NULL,
  `Fecha_Hora` TIMESTAMP NOT NULL,
  `FK_Cliente` INT NOT NULL,
  `FK_Recursos_Humanos` INT NOT NULL,
  `Fk_Barberia` INT NOT NULL,
  `FK_Citas` INT NOT NULL,
  PRIMARY KEY (`idReporte_Cliente`),
  INDEX `fk_Reporte_Cliente_Cliente1_idx` (`FK_Cliente` ASC),
  INDEX `fk_Reporte_Cliente_Recursos_Humanos1_idx` (`FK_Recursos_Humanos` ASC),
  INDEX `fk_Reporte_Cliente_Barberia1_idx` (`Fk_Barberia` ASC),
  INDEX `fk_Reporte_Cliente_Citas1_idx` (`FK_Citas` ASC),
  CONSTRAINT `fk_Reporte_Cliente_Cliente1`
    FOREIGN KEY (`FK_Cliente`)
    REFERENCES `mydb`.`Cliente` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Reporte_Cliente_Recursos_Humanos1`
    FOREIGN KEY (`FK_Recursos_Humanos`)
    REFERENCES `mydb`.`Recursos_Humanos` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Reporte_Cliente_Barberia1`
    FOREIGN KEY (`Fk_Barberia`)
    REFERENCES `mydb`.`Barberia` (`idBarberia`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Reporte_Cliente_Citas1`
    FOREIGN KEY (`FK_Citas`)
    REFERENCES `mydb`.`Citas` (`idCitas`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
