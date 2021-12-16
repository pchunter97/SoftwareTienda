-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: midbventas
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `detalleventa`
--

DROP TABLE IF EXISTS `detalleventa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detalleventa` (
  `iddetalleventa` int NOT NULL AUTO_INCREMENT,
  `idventa` int DEFAULT NULL,
  `idproducto` int DEFAULT NULL,
  `cantidadproducto` int DEFAULT NULL,
  `precioventa` double DEFAULT NULL,
  PRIMARY KEY (`iddetalleventa`),
  KEY `venta detalle venta` (`idventa`),
  KEY `detalle producto` (`idproducto`),
  CONSTRAINT `detalle producto` FOREIGN KEY (`idproducto`) REFERENCES `productos` (`id`),
  CONSTRAINT `venta detalle venta` FOREIGN KEY (`idventa`) REFERENCES `ventas` (`idventa`)
) ENGINE=InnoDB AUTO_INCREMENT=109 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalleventa`
--

LOCK TABLES `detalleventa` WRITE;
/*!40000 ALTER TABLE `detalleventa` DISABLE KEYS */;
INSERT INTO `detalleventa` VALUES (1,1,1,1,32000),(2,1,2,1,70000),(3,2,1,1,32000),(4,2,2,1,70000),(5,3,4,1,32213),(6,3,1,1,32000),(7,4,4,1,32213),(8,4,1,1,32000),(9,4,2,5,70000),(10,5,4,1,32213),(11,5,1,1,32000),(12,5,2,5,70000),(13,5,1,1,32000),(14,6,4,1,32213),(15,6,1,1,32000),(16,6,2,5,70000),(17,6,1,1,32000),(18,6,1,1,32000),(19,7,4,1,32213),(20,7,1,1,32000),(21,7,2,5,70000),(22,7,1,1,32000),(23,7,1,1,32000),(24,8,4,1,32213),(25,8,1,1,32000),(26,8,2,5,70000),(27,8,1,1,32000),(28,8,1,1,32000),(29,9,4,1,32213),(30,9,1,1,32000),(31,9,2,5,70000),(32,9,1,1,32000),(33,9,1,1,32000),(34,9,3,20,10560000),(35,10,4,1,32213),(36,10,1,1,32000),(37,10,2,5,70000),(38,10,1,1,32000),(39,10,1,1,32000),(40,10,3,20,10560000),(41,10,3,4,10560000),(42,11,6,5,230000),(43,12,6,5,230000),(44,12,2,1,70000),(45,12,6,1,230000),(46,13,6,5,230000),(47,13,2,1,70000),(48,13,6,1,230000),(49,13,6,1,230000),(50,14,2,1,70000),(95,1,1,1,500.2),(97,1,2,1,500.2),(105,14,3,50,5000),(106,14,3,50,5000),(107,14,3,50,5000),(108,14,3,50,5000);
/*!40000 ALTER TABLE `detalleventa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombreproducto` varchar(200) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `descripcionproducto` varchar(500) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `unidad` varchar(10) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `precio` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (1,'Memoria USB 64Gb Kingston','Memoria marca Kingston de 64Gb con carcasa metalica','UND',32000),(2,'Mouse Genius','Mouse Genius altos DPI gamer','UND',70000),(3,'i MAC 27\"','Itntel i7 16GB RAm 3Tb Disco','UND',10560000),(4,'wsada','dsda','dssa',32213),(5,'Portatil lenovo','e430','UND',3000000),(6,'Web Cam Logitech 1080','Camra de alta definicion para computador, puerto USB resolucion 1920x1080','UND',230000),(7,'Memoria USB 64Gb Kingston','Memoria marca Kingston de 64Gb con carcasa metalica','UND',42000),(8,'Memoria USB 64Gb Kingston sds','Memoria marca Kingston de 64Gb con carcasa metalica','UND',32000),(16,'221','2312','2121',321213),(19,NULL,NULL,NULL,NULL),(20,NULL,NULL,NULL,NULL),(21,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `documento` int DEFAULT NULL,
  `nombre` varchar(100) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `correo` varchar(200) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `password` varchar(100) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `Rol` enum('Empleado','Cliente') CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `estado` enum('Activo','Inactivo') CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (2,1075212819,'Juan Camilo Gonzalez','jgonz@mail.com','123','Empleado','Activo'),(10,7730123,'Alfonso Martinez Gomez','am2@mail.com','12345','Empleado','Activo'),(33,123456,'Jefferson','Correo@gmail.com','123456','Empleado','Activo'),(38,4,'asdasd','asdasd','asdasd','Cliente','Activo'),(39,0,NULL,NULL,NULL,NULL,NULL),(40,0,NULL,NULL,NULL,NULL,NULL),(41,0,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ventas`
--

DROP TABLE IF EXISTS `ventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ventas` (
  `idventa` int NOT NULL AUTO_INCREMENT,
  `numerofactura` varchar(20) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `idclienteventa` int DEFAULT NULL,
  `idempleadoventa` int NOT NULL,
  `fechaventa` date DEFAULT NULL,
  `totalventa` double DEFAULT NULL,
  `estado` varchar(20) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  PRIMARY KEY (`idventa`)
) ENGINE=InnoDB AUTO_INCREMENT=58 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ventas`
--

LOCK TABLES `ventas` WRITE;
/*!40000 ALTER TABLE `ventas` DISABLE KEYS */;
INSERT INTO `ventas` VALUES (1,'34',2,2,'2020-10-01',342342,'A'),(2,'0',1,1,'2020-10-21',102000,'1'),(3,'35',1,1,'2020-10-21',64213,'1'),(4,'36',2,1,'2020-10-21',414213,'1'),(5,'37',1,1,'2020-10-21',446213,'1'),(6,'38',1,1,'2020-10-21',478213,'1'),(7,'38',1,1,'2020-10-21',478213,'1'),(8,'39',1,1,'2020-10-21',478213,'1'),(9,'40',1,1,'2020-10-21',211678213,'1'),(10,'41',2,1,'2020-10-21',253918213,'1'),(11,'42',7,1,'2020-10-21',1150000,'1'),(12,'42',1,1,'2020-10-21',1450000,'1'),(13,'43',2,1,'2020-10-21',1680000,'1'),(14,'44',1,1,'2020-10-21',70000,'1'),(52,NULL,0,0,NULL,0,NULL),(53,NULL,0,0,NULL,0,NULL),(54,NULL,0,0,NULL,0,NULL),(55,NULL,0,0,NULL,0,NULL),(56,NULL,0,0,NULL,0,NULL),(57,NULL,0,0,NULL,0,NULL);
/*!40000 ALTER TABLE `ventas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-15 22:27:04
