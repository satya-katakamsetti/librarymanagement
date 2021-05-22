/*
SQLyog Community v13.0.1 (64 bit)
MySQL - 5.5.60 : Database - librarymanagement
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`librarymanagement` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `librarymanagement`;

/*Table structure for table `books` */

DROP TABLE IF EXISTS `books`;

CREATE TABLE `books` (
  `BookId` int(11) NOT NULL,
  `Title` varchar(20) DEFAULT NULL,
  `Author` varchar(20) DEFAULT NULL,
  `CategotyId` int(11) DEFAULT NULL,
  PRIMARY KEY (`BookId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `books` */

insert  into `books`(`BookId`,`Title`,`Author`,`CategotyId`) values 
(101,'Alchemist','Poel Choelo',202),
(102,'Wings of Fire','A.P.J. Andul Kamal',202),
(103,'3 Mistake of My Life','Chetan Bhagat',201),
(104,'Fiction','XYZ',201);

/*Table structure for table `category` */

DROP TABLE IF EXISTS `category`;

CREATE TABLE `category` (
  `CategoryId` int(11) DEFAULT NULL,
  `CategoryName` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `category` */

insert  into `category`(`CategoryId`,`CategoryName`) values 
(201,'Fiction'),
(202,'Biograpy');

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `RoleId` int(11) NOT NULL,
  `RoleName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`RoleId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `role` */

insert  into `role`(`RoleId`,`RoleName`) values 
(1,'Admin'),
(2,'User');

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `FName` varchar(20) DEFAULT NULL,
  `LName` varchar(20) DEFAULT NULL,
  `UserId` int(11) NOT NULL,
  `Password` varchar(20) DEFAULT NULL,
  `RollId` int(11) DEFAULT NULL,
  PRIMARY KEY (`UserId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `users` */

insert  into `users`(`FName`,`LName`,`UserId`,`Password`,`RollId`) values 
('Ram','Dhangar',1,'Ram123',2),
('Neha','Sigh',2,'Neha123',1),
('Deepak','D',3,'Deepak123',1),
('Satya','S',4,'Satya123',2);

/*Table structure for table `users_books` */

DROP TABLE IF EXISTS `users_books`;

CREATE TABLE `users_books` (
  `Tid` int(11) NOT NULL,
  `UserId` int(11) DEFAULT NULL,
  `BookId` int(11) DEFAULT NULL,
  `BorrowDate` date DEFAULT NULL,
  `DueDate` date DEFAULT NULL,
  `OverdueCharges` double DEFAULT NULL,
  PRIMARY KEY (`Tid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `users_books` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
