-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 27 Des 2020 pada 09.48
-- Versi server: 10.4.11-MariaDB
-- Versi PHP: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbapotek`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `apoteker`
--

CREATE TABLE `apoteker` (
  `idapoteker` int(11) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `telepon` varchar(255) NOT NULL,
  `jabatan` varchar(255) NOT NULL,
  `gaji` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `apoteker`
--

INSERT INTO `apoteker` (`idapoteker`, `nama`, `alamat`, `telepon`, `jabatan`, `gaji`) VALUES
(1, 'Tita', 'Malang', '085123456789', 'Tingkat Ahli', 7000000),
(2, 'Nadia', 'Pasuruan', '081122455788', 'Fungsional', 6500000),
(3, 'Wijaya', 'Medan', '081000555000', 'Apoteker Madya', 4000000),
(9, 'Rosabela', 'Semarang', '082562109548', 'Fungsional', 6000000),
(10, 'Layra', 'Jakarta', '088112200000', 'Apoteker Madya', 7250000),
(11, 'Hidayat', 'Sidoarjo', '085888234710', 'Tingkat Ahli', 5000000),
(12, 'Ubaidillah', 'Jember', '081664423970001', 'Ahli Madya', 5700000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `kasir`
--

CREATE TABLE `kasir` (
  `idkasir` int(11) NOT NULL,
  `namakasir` varchar(255) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `telepon` varchar(255) NOT NULL,
  `jabatan` varchar(255) NOT NULL,
  `gaji` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `kasir`
--

INSERT INTO `kasir` (`idkasir`, `namakasir`, `alamat`, `telepon`, `jabatan`, `gaji`) VALUES
(2, 'Raffi Ahmad', 'Jepara', '082121255110', 'Admin Kasir', 3700000),
(3, 'Amanda', 'Makassar', '085341256980', 'Pelayan Kasir', 2500000),
(4, 'Angelia', 'Jepara', '081721829122', 'Kasir Finance', 3000000),
(9, 'Rey Mbayang', 'Jakarta', '081982160235', 'Kepala Kasir', 4500000),
(10, 'Xavier', 'Probolinggo', '082570196582', 'Admin Kasir', 3500000),
(11, 'Hamzah', 'Surabaya', '088000341234', 'Kasir Finance', 3250000),
(12, 'Gabriela', 'Denpasar', '085981265551', 'Pelayan kasir', 3000000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `obat`
--

CREATE TABLE `obat` (
  `idobat` int(11) NOT NULL,
  `namaobat` varchar(255) NOT NULL,
  `rincianobat` varchar(255) NOT NULL,
  `jumlahkonsumsi` varchar(255) NOT NULL,
  `harga` int(11) NOT NULL,
  `tanggalkadaluarsa` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `obat`
--

INSERT INTO `obat` (`idobat`, `namaobat`, `rincianobat`, `jumlahkonsumsi`, `harga`, `tanggalkadaluarsa`) VALUES
(1, 'Acarbose', 'Obat Diabetes', '2 x 1', 35000, '2028-08-25'),
(2, 'Decolgen', 'Obat Flu', '3 x 1', 18000, '2030-02-25'),
(4, 'Albenzadol', 'Obat Cacing', '3 x 1', 27000, '2027-05-12'),
(5, 'Aminofilin', 'Obat Asma', '3 x 1', 150000, '2031-12-03'),
(6, 'Amlodipin', 'Obat Hipertensi', '2 x 1', 64000, '2029-07-22'),
(7, 'Attapulgit Tab', 'Obat Diare', '3 x 1', 25000, '2030-03-15'),
(8, 'Polysilane', 'Obat Maag', '2 x 1', 42000, '2032-10-04');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pembeli`
--

CREATE TABLE `pembeli` (
  `idpembeli` int(11) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `telepon` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL,
  `idmember` int(11) NOT NULL,
  `nomorantri` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pembeli`
--

INSERT INTO `pembeli` (`idpembeli`, `nama`, `alamat`, `telepon`, `status`, `idmember`, `nomorantri`) VALUES
(1, 'Muhammad', 'Pasuruan', '085197501239', 'Member', 1, 0),
(3, 'Dora', 'Probolinggo', '081930122109', 'NonMember', 0, 2),
(4, 'Floridina', 'Jember', '088120592187', 'Member', 2, 0),
(5, 'Ehsan', 'Malang', '082777511234', 'NonMember', 0, 3),
(6, 'Chantika', 'Surabaya', '081111220582913', 'Member', 3, 0),
(7, 'Galuh', 'Sidoarjo', '082665912045', 'Member', 4, 0),
(8, 'Efendi', 'Malang', '081201125673', 'Member', 5, 0),
(9, 'Clara', 'Pasuruan', '085094596812', 'NonMember', 0, 4),
(10, 'Bisri', 'Jember', '088451209341', 'NonMember', 0, 5);

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `idtransaksi` int(11) NOT NULL,
  `tanggaltransaksi` date NOT NULL,
  `idkasir` int(11) NOT NULL,
  `idpembeli` int(11) NOT NULL,
  `idobat` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `totalbiaya` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`idtransaksi`, `tanggaltransaksi`, `idkasir`, `idpembeli`, `idobat`, `jumlah`, `totalbiaya`) VALUES
(3, '2020-10-12', 9, 1, 1, 2, 66500),
(4, '2021-01-24', 10, 3, 7, 4, 100000),
(6, '2020-09-05', 12, 7, 2, 3, 51300),
(7, '2021-03-15', 10, 9, 5, 1, 150000);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `apoteker`
--
ALTER TABLE `apoteker`
  ADD PRIMARY KEY (`idapoteker`),
  ADD KEY `idapoteker` (`idapoteker`);

--
-- Indeks untuk tabel `kasir`
--
ALTER TABLE `kasir`
  ADD PRIMARY KEY (`idkasir`),
  ADD UNIQUE KEY `idkasir` (`idkasir`),
  ADD KEY `idkasir_2` (`idkasir`);

--
-- Indeks untuk tabel `obat`
--
ALTER TABLE `obat`
  ADD PRIMARY KEY (`idobat`),
  ADD UNIQUE KEY `idobat` (`idobat`);

--
-- Indeks untuk tabel `pembeli`
--
ALTER TABLE `pembeli`
  ADD PRIMARY KEY (`idpembeli`);

--
-- Indeks untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`idtransaksi`),
  ADD UNIQUE KEY `idtransaksi` (`idtransaksi`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `apoteker`
--
ALTER TABLE `apoteker`
  MODIFY `idapoteker` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT untuk tabel `kasir`
--
ALTER TABLE `kasir`
  MODIFY `idkasir` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT untuk tabel `obat`
--
ALTER TABLE `obat`
  MODIFY `idobat` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT untuk tabel `pembeli`
--
ALTER TABLE `pembeli`
  MODIFY `idpembeli` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `idtransaksi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
