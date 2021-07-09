-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 21, 2021 at 10:36 AM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 7.2.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `atmdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `accounttbl`
--

CREATE TABLE `accounttbl` (
  `AccNum` int(11) NOT NULL,
  `AccName` varchar(10) NOT NULL,
  `FaName` varchar(10) NOT NULL,
  `Dob` varchar(50) NOT NULL,
  `Phone` varchar(10) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Education` varchar(20) NOT NULL,
  `Occupation` varchar(20) NOT NULL,
  `Balance` int(11) NOT NULL,
  `PIN` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `accounttbl`
--
-- --------------------------------------------------------

--
-- Table structure for table `trasanctiontbl`
--

CREATE TABLE `transactiontbl` (
  `Tid` int(11) NOT NULL,
  `AccNum` int(11) NOT NULL,
  `Type` varchar(11) NOT NULL,
  `TDate` varchar(20) NOT NULL,
  `Amount` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `trasanctiontbl`
--

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
