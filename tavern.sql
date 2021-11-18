-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 12, 2021 at 02:03 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tavern`
--

-- --------------------------------------------------------

--
-- Table structure for table `akun`
--

CREATE TABLE `akun` (
  `id_akun` int(11) NOT NULL,
  `username_akun` varchar(30) NOT NULL,
  `password_akun` varchar(30) NOT NULL,
  `roles_akun` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `akun`
--

INSERT INTO `akun` (`id_akun`, `username_akun`, `password_akun`, `roles_akun`) VALUES
(1, 'super', 'super', 'Super Administrator'),
(2, 'power', 'power', 'Administrator'),
(3, 'yes', 'yes', 'Administrator');

-- --------------------------------------------------------

--
-- Table structure for table `detailpenjualan`
--

CREATE TABLE `detailpenjualan` (
  `id` int(11) NOT NULL,
  `id_detailpenjualan` varchar(20) NOT NULL,
  `tgl_detailpenjualan` date NOT NULL,
  `idmenu_detailpenjualan` int(11) NOT NULL,
  `qty_detailpenjualan` int(19) NOT NULL,
  `harga_detailpenjualan` int(19) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `detailpenjualan`
--

INSERT INTO `detailpenjualan` (`id`, `id_detailpenjualan`, `tgl_detailpenjualan`, `idmenu_detailpenjualan`, `qty_detailpenjualan`, `harga_detailpenjualan`) VALUES
(9, 'TVN201228033725', '2020-12-28', 5, 1, 15000),
(10, 'TVN201228033725', '2020-12-28', 6, 2, 60000),
(11, 'TVN201228212131', '2020-12-28', 5, 2, 30000),
(12, 'TVN201228212131', '2020-12-28', 6, 4, 120000),
(14, 'TVN210112105031', '2021-01-12', 6, 1, 30000),
(15, 'TVN210112105231', '2021-01-12', 6, 2, 60000),
(16, 'TVN210112191612', '2021-01-12', 5, 2, 30000),
(18, 'TVN210112194834', '2021-01-12', 6, 2, 60000),
(19, 'TVN210112194834', '2021-01-12', 5, 2, 30000),
(21, 'TVN210112195919', '2021-01-12', 9, 2, 30000),
(22, 'TVN210112195919', '2021-01-12', 6, 2, 60000);

-- --------------------------------------------------------

--
-- Table structure for table `kategori`
--

CREATE TABLE `kategori` (
  `id_kategori` int(11) NOT NULL,
  `nama_kategori` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kategori`
--

INSERT INTO `kategori` (`id_kategori`, `nama_kategori`) VALUES
(1, 'Appetizer'),
(2, 'Maincourse'),
(3, 'Dessert'),
(4, 'Drink-Ice'),
(5, 'Drink-Hot'),
(8, 'Pastry');

-- --------------------------------------------------------

--
-- Table structure for table `menu`
--

CREATE TABLE `menu` (
  `id_menu` int(11) NOT NULL,
  `idkategori_menu` int(11) NOT NULL,
  `nama_menu` varchar(50) NOT NULL,
  `rc_menu` int(19) NOT NULL,
  `sc_menu` int(19) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `menu`
--

INSERT INTO `menu` (`id_menu`, `idkategori_menu`, `nama_menu`, `rc_menu`, `sc_menu`) VALUES
(5, 5, 'Espresso', 5000, 10000),
(6, 4, 'Bloody Marry', 10000, 20000),
(9, 2, 'Nasi Goreng', 10000, 5000);

-- --------------------------------------------------------

--
-- Table structure for table `penjualan`
--

CREATE TABLE `penjualan` (
  `id_penjualan` varchar(30) NOT NULL,
  `tgl_penjualan` date NOT NULL,
  `totalqty_penjualan` int(19) NOT NULL,
  `totalharga_penjualan` int(19) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `penjualan`
--

INSERT INTO `penjualan` (`id_penjualan`, `tgl_penjualan`, `totalqty_penjualan`, `totalharga_penjualan`) VALUES
('TVN201228033725', '2020-12-28', 3, 75000),
('TVN201228212131', '2020-12-28', 6, 150000),
('TVN210112105031', '2021-01-12', 1, 30000),
('TVN210112105231', '2021-01-12', 2, 60000),
('TVN210112191612', '2021-01-12', 2, 30000),
('TVN210112194834', '2021-01-12', 4, 90000),
('TVN210112195919', '2021-01-12', 0, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `akun`
--
ALTER TABLE `akun`
  ADD PRIMARY KEY (`id_akun`);

--
-- Indexes for table `detailpenjualan`
--
ALTER TABLE `detailpenjualan`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_detailpenjualan` (`id_detailpenjualan`),
  ADD KEY `idmenu_detailpenjualan` (`idmenu_detailpenjualan`);

--
-- Indexes for table `kategori`
--
ALTER TABLE `kategori`
  ADD PRIMARY KEY (`id_kategori`);

--
-- Indexes for table `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`id_menu`),
  ADD KEY `idkategori_menu` (`idkategori_menu`);

--
-- Indexes for table `penjualan`
--
ALTER TABLE `penjualan`
  ADD PRIMARY KEY (`id_penjualan`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `detailpenjualan`
--
ALTER TABLE `detailpenjualan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `kategori`
--
ALTER TABLE `kategori`
  MODIFY `id_kategori` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `menu`
--
ALTER TABLE `menu`
  MODIFY `id_menu` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `detailpenjualan`
--
ALTER TABLE `detailpenjualan`
  ADD CONSTRAINT `detailpenjualan_ibfk_1` FOREIGN KEY (`id_detailpenjualan`) REFERENCES `penjualan` (`id_penjualan`) ON DELETE CASCADE ON UPDATE NO ACTION,
  ADD CONSTRAINT `detailpenjualan_ibfk_2` FOREIGN KEY (`idmenu_detailpenjualan`) REFERENCES `menu` (`id_menu`) ON DELETE CASCADE ON UPDATE NO ACTION;

--
-- Constraints for table `menu`
--
ALTER TABLE `menu`
  ADD CONSTRAINT `menu_ibfk_1` FOREIGN KEY (`idkategori_menu`) REFERENCES `kategori` (`id_kategori`) ON DELETE CASCADE ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
