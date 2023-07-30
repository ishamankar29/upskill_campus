-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: bankms
-- ------------------------------------------------------
-- Server version	8.0.33

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
-- Table structure for table `transactiondw`
--

DROP TABLE IF EXISTS `transactiondw`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `transactiondw` (
  `Id` int NOT NULL AUTO_INCREMENT,
  `Account_no` varchar(20) DEFAULT NULL,
  `Actions` varchar(20) DEFAULT NULL,
  `Amount` varchar(20) DEFAULT NULL,
  `transactio_date` date DEFAULT NULL,
  `ToAccount` varchar(20) DEFAULT NULL,
  `fromAccount` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transactiondw`
--

LOCK TABLES `transactiondw` WRITE;
/*!40000 ALTER TABLE `transactiondw` DISABLE KEYS */;
INSERT INTO `transactiondw` VALUES (1,' 2790','Deposite','10','2023-07-11',NULL,NULL),(2,' 2790','Deposite','20','2023-07-12',NULL,NULL),(3,' 2790','Deposite','40','2023-07-12',NULL,NULL),(4,' 2790','Deposite','11','2023-07-12',NULL,NULL),(5,' 2790','Deposite','11','2023-07-12',NULL,NULL),(6,' 2790','Deposite','1','2023-07-12',NULL,NULL),(7,' 2790','Deposite','2','2023-07-12',NULL,NULL),(8,' 2790','Deposite','33','2023-07-12',NULL,NULL),(9,' 2790','Widthdraw','44','2023-07-12',NULL,NULL),(10,' 2790','Widthdraw','6','2023-07-12',NULL,NULL),(11,' 2790','Deposite','22','2023-07-12',NULL,NULL),(12,' 2790','Deposite','111','2023-07-12',NULL,NULL),(13,' 2790','Deposite','19','2023-07-12',NULL,NULL),(14,' 2790','Widthdraw','5','2023-07-12',NULL,NULL),(15,' 2790','Deposite','4','2023-07-12',NULL,NULL),(16,' 2790','Deposite','7','2023-07-12',NULL,NULL),(17,' 2790','Deposite','7','2023-07-12',NULL,NULL),(18,' 2790','Deposite','21','2023-07-12',NULL,NULL),(19,' 2790','Deposite','23','2023-07-12',NULL,NULL),(20,' 7027','Deposite','12','2023-07-12',NULL,NULL),(23,'2790','Deposite','100','2023-07-12','Nil','Nil'),(24,'2790','Widthdraw','20','2023-07-12','Nil','Nil'),(25,'7027','Transfer','10','2023-07-13','2790','7027'),(26,'2790','Recieved','10','2023-07-13','2790','7027');
/*!40000 ALTER TABLE `transactiondw` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-15 21:56:41
