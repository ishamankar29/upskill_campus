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
-- Table structure for table `signuptwo`
--

DROP TABLE IF EXISTS `signuptwo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `signuptwo` (
  `Account_no` varchar(20) NOT NULL,
  `Religion` varchar(20) DEFAULT NULL,
  `Category` varchar(20) DEFAULT NULL,
  `Education` varchar(20) DEFAULT NULL,
  `Occupation` varchar(20) DEFAULT NULL,
  `Income` varchar(20) DEFAULT NULL,
  `Pan` varchar(20) DEFAULT NULL,
  `Aadhar` varchar(20) DEFAULT NULL,
  `Senior_citizen` varchar(20) DEFAULT NULL,
  `Existing_Acc` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Account_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `signuptwo`
--

LOCK TABLES `signuptwo` WRITE;
/*!40000 ALTER TABLE `signuptwo` DISABLE KEYS */;
INSERT INTO `signuptwo` VALUES (' 7027','Hindu','OBC','Under-Grad','Student','<1,00,000','1212121','43214214211','No','No'),('2281','Hindu','OBC','Post-Grad','Self-Employed','<7,00,000','12121212','1212121212','No','No'),('6846','Muslim','ST','HSC','Employeed','< 2,50,000','3434343','3434343','No','No'),('6874','Christian','ST','Post-Grad','Self-Employed','<7,00,000','454545','545454545','No','No');
/*!40000 ALTER TABLE `signuptwo` ENABLE KEYS */;
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
