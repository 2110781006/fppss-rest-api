-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server Version:               10.9.2-MariaDB-1:10.9.2+maria~ubu2204 - mariadb.org binary distribution
-- Server Betriebssystem:        debian-linux-gnu
-- HeidiSQL Version:             11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Exportiere Datenbank Struktur für fppss-energy
CREATE DATABASE IF NOT EXISTS `fppss-energy` /*!40100 DEFAULT CHARACTER SET armscii8 COLLATE armscii8_bin */;
USE `fppss-energy`;

-- Exportiere Struktur von Tabelle fppss-energy.provider
CREATE TABLE IF NOT EXISTS `provider` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` text COLLATE armscii8_bin NOT NULL,
  `fullname` text COLLATE armscii8_bin NOT NULL,
  `type` int(11) NOT NULL DEFAULT 0 COMMENT '0 ... energy provider\n1 ... inverter',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`) USING HASH
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=armscii8 COLLATE=armscii8_bin;

-- Daten Export vom Benutzer nicht ausgewählt

-- Exportiere Struktur von Tabelle fppss-energy.provider_accounts
CREATE TABLE IF NOT EXISTS `provider_accounts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `provider_id` int(11) NOT NULL,
  `username` text COLLATE armscii8_bin NOT NULL,
  `password` text COLLATE armscii8_bin NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=armscii8 COLLATE=armscii8_bin;

-- Daten Export vom Benutzer nicht ausgewählt

-- Exportiere Struktur von Tabelle fppss-energy.users
CREATE TABLE IF NOT EXISTS `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` text COLLATE armscii8_bin NOT NULL,
  `firstname` text COLLATE armscii8_bin DEFAULT NULL,
  `surename` text COLLATE armscii8_bin DEFAULT NULL,
  `email` text COLLATE armscii8_bin DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  UNIQUE KEY `name` (`name`) USING HASH
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=armscii8 COLLATE=armscii8_bin;

-- Daten Export vom Benutzer nicht ausgewählt

-- Exportiere Struktur von Tabelle fppss-energy.values_day
CREATE TABLE IF NOT EXISTS `values_day` (
  `stime` timestamp NOT NULL DEFAULT current_timestamp(),
  `meeter_id` varchar(60) COLLATE armscii8_bin NOT NULL,
  `datapoint_name` varchar(40) COLLATE armscii8_bin NOT NULL,
  `provider_account_id` int(11) NOT NULL,
  `value` float DEFAULT NULL,
  `counter_value` float DEFAULT NULL,
  `type` tinyint(1) NOT NULL,
  PRIMARY KEY (`stime`,`meeter_id`,`datapoint_name`,`provider_account_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=armscii8 COLLATE=armscii8_bin;

-- Daten Export vom Benutzer nicht ausgewählt

-- Exportiere Struktur von Tabelle fppss-energy.values_hour
CREATE TABLE IF NOT EXISTS `values_hour` (
  `stime` timestamp NOT NULL DEFAULT current_timestamp(),
  `meeter_id` varchar(60) COLLATE armscii8_bin NOT NULL,
  `datapoint_name` varchar(40) COLLATE armscii8_bin NOT NULL,
  `provider_account_id` int(11) NOT NULL,
  `value` float DEFAULT NULL,
  `counter_value` float DEFAULT NULL,
  `type` tinyint(1) NOT NULL,
  PRIMARY KEY (`stime`,`meeter_id`,`datapoint_name`,`provider_account_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=armscii8 COLLATE=armscii8_bin;

-- Daten Export vom Benutzer nicht ausgewählt

-- Exportiere Struktur von Tabelle fppss-energy.values_month
CREATE TABLE IF NOT EXISTS `values_month` (
  `stime` timestamp NOT NULL DEFAULT current_timestamp(),
  `meeter_id` varchar(60) COLLATE armscii8_bin NOT NULL,
  `datapoint_name` varchar(40) COLLATE armscii8_bin NOT NULL,
  `provider_account_id` int(11) NOT NULL,
  `value` float DEFAULT NULL,
  `counter_value` float DEFAULT NULL,
  `type` tinyint(1) NOT NULL,
  PRIMARY KEY (`stime`,`meeter_id`,`datapoint_name`,`provider_account_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=armscii8 COLLATE=armscii8_bin;

-- Daten Export vom Benutzer nicht ausgewählt

-- Exportiere Struktur von Tabelle fppss-energy.values_spontan
CREATE TABLE IF NOT EXISTS `values_spontan` (
  `stime` timestamp NOT NULL DEFAULT current_timestamp(),
  `meeter_id` varchar(60) COLLATE armscii8_bin NOT NULL,
  `datapoint_name` varchar(40) COLLATE armscii8_bin NOT NULL,
  `provider_account_id` int(11) NOT NULL,
  `value` float DEFAULT NULL,
  `counter_value` float DEFAULT NULL,
  `type` tinyint(1) NOT NULL,
  PRIMARY KEY (`stime`,`meeter_id`,`datapoint_name`,`provider_account_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=armscii8 COLLATE=armscii8_bin;

-- Daten Export vom Benutzer nicht ausgewählt

-- Exportiere Struktur von Tabelle fppss-energy.values_year
CREATE TABLE IF NOT EXISTS `values_year` (
  `stime` timestamp NOT NULL DEFAULT current_timestamp(),
  `meeter_id` varchar(60) COLLATE armscii8_bin NOT NULL,
  `datapoint_name` varchar(40) COLLATE armscii8_bin NOT NULL,
  `provider_account_id` int(11) NOT NULL,
  `value` float DEFAULT NULL,
  `counter_value` float DEFAULT NULL,
  `type` tinyint(1) NOT NULL,
  PRIMARY KEY (`stime`,`meeter_id`,`datapoint_name`,`provider_account_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=armscii8 COLLATE=armscii8_bin;

-- Daten Export vom Benutzer nicht ausgewählt

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
