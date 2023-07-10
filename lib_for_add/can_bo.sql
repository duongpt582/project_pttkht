-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 09, 2022 at 07:49 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_company`
--

-- --------------------------------------------------------

--
-- Table structure for table `can_bo`
--

CREATE TABLE `can_bo` (
  `id` int(11) NOT NULL,
  `ho_ten` varchar(100) NOT NULL,
  `ngay_sinh` date NOT NULL,
  `dia_chi` text NOT NULL,
  `chuc_vu` text NOT NULL,
  `ma_can_bo` text NOT NULL,
  `so_ngay_lam_viec` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `can_bo`
--

INSERT INTO `can_bo` (`id`, `ho_ten`, `ngay_sinh`, `dia_chi`, `chuc_vu`, `ma_can_bo`, `so_ngay_lam_viec`) VALUES
(1, 'Phạm Thái Dương', '2002-08-05', 'Hà Nội', '', '20207595', 5),
(2, 'Đặng Anh Tú', '2002-07-03', 'Hà Nội', '', '20207955', 5),
(3, 'Tu Ngoc Duc', '2002-05-08', 'Ha Noi', 'xxxx', 'xxxxx', 5),
(4, 'Tu Ngoc Duc', '2002-05-08', 'Ha Noi', 'xxxx', 'xxxxx', 5),
(5, 'Tu Ngoc Duc', '2002-05-08', 'Ha Noi', 'xxxx', 'xxxxx', 5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `can_bo`
--
ALTER TABLE `can_bo`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `can_bo`
--
ALTER TABLE `can_bo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
