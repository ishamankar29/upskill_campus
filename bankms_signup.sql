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
-- Table structure for table `signup`
--

DROP TABLE IF EXISTS `signup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `signup` (
  `Account_no` varchar(20) NOT NULL,
  `Name` varchar(20) DEFAULT NULL,
  `Father_Name` varchar(20) DEFAULT NULL,
  `Gender` varchar(20) DEFAULT NULL,
  `Marital_Status` varchar(20) DEFAULT NULL,
  `Email` varchar(20) DEFAULT NULL,
  `DateOfBirth` varchar(20) DEFAULT NULL,
  `Pin_code` varchar(20) DEFAULT NULL,
  `City` varchar(20) DEFAULT NULL,
  `State` varchar(20) DEFAULT NULL,
  `Address` varchar(225) DEFAULT NULL,
  PRIMARY KEY (`Account_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `signup`
--

LOCK TABLES `signup` WRITE;
/*!40000 ALTER TABLE `signup` DISABLE KEYS */;
INSERT INTO `signup` VALUES ('2281','wqws','wsaqws','Female','Unmarried','sasw','06-Jul-2023','121212','M2','Maharahstra','sasas'),('2875','dssds','dssads','Male','Married','dsds@gmail.com','12-Jul-2023','2323','M1','Maharahstra','dasdsad'),('6423','eedes','sfsfs','Male','Other','fsdd@gmail.com','05-Jul-2023','12121212','M2','Maharahstra','dsadsed'),('6846','jijiji','jshwjsjw','Male','Married','nbabs@gmail.com','16-Jul-2023','111111','M2','Maharahstra','qwqqw'),('6874','qwqwq','dsds','Female','Unmarried','dadad@gmail.com','09-Jul-2023','12121','M1','Maharahstra','wqwewe'),('7027','Isha Mankar','Vilas','Female','Unmarried','isha@gmail.com','11-Jul-2023','123345','M1','Maharahstra','bla blab bla');
/*!40000 ALTER TABLE `signup` ENABLE KEYS */;
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
