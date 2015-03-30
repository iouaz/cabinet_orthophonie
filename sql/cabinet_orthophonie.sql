-- phpMyAdmin SQL Dump
-- version 4.1.4
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Lun 30 Mars 2015 à 18:59
-- Version du serveur :  5.6.15-log
-- Version de PHP :  5.4.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `cabinet_orthophonie`
--

-- --------------------------------------------------------

--
-- Structure de la table `utilisatuer`
--

CREATE TABLE IF NOT EXISTS `UTILISATEUR` (
  `ID_UTILISATEUR` int(11) NOT NULL AUTO_INCREMENT,
  `NOM_UTILISATEUR` varchar(25) NOT NULL,
  `PRENOM_UTILISATEUR` varchar(25) NOT NULL,
  `TEL` int(11) NOT NULL,
  `LOGIN` varchar(15) NOT NULL,
  `PASSWORD` varchar(15) NOT NULL,
  PRIMARY KEY (`ID_UTILISATEUR`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Contenu de la table `utilisatuer`
--

INSERT INTO `utilisateur` (`ID_UTILISATEUR`, `NOM_UTILISATEUR`, `PRENOM_UTILISATEUR`, `TEL`, `LOGIN`, `PASSWORD`) VALUES
(1, 'Ouaz', 'Ines', 22507300, 'iouaz', '123456');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
