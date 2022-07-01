-- phpMyAdmin SQL Dump
-- version 4.6.6deb5ubuntu0.5
-- https://www.phpmyadmin.net/
--
-- Client :  localhost:3306
-- Généré le :  Ven 01 Juillet 2022 à 12:03
-- Version du serveur :  5.7.38-0ubuntu0.18.04.1
-- Version de PHP :  7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `redline`
--

-- --------------------------------------------------------

--
-- Structure de la table `adresse`
--

CREATE TABLE `adresse` (
  `id` bigint(20) NOT NULL,
  `codepostal` bigint(20) DEFAULT NULL,
  `complement` varchar(255) DEFAULT NULL,
  `numero` bigint(20) DEFAULT NULL,
  `rue` varchar(255) DEFAULT NULL,
  `ville` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `domaine`
--

CREATE TABLE `domaine` (
  `id` bigint(20) NOT NULL,
  `nom_domaine` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `evaluation`
--

CREATE TABLE `evaluation` (
  `id` bigint(20) NOT NULL,
  `note_formateur` int(11) DEFAULT NULL,
  `note_formation` int(11) DEFAULT NULL,
  `utilisateur_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `formation`
--

CREATE TABLE `formation` (
  `id` bigint(20) NOT NULL,
  `contenu` varchar(255) DEFAULT NULL,
  `nom_formation` varchar(255) DEFAULT NULL,
  `prix_formation` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Structure de la table `service`
--

CREATE TABLE `service` (
  `id` bigint(20) NOT NULL,
  `nom_service` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `session`
--

CREATE TABLE `session` (
  `id` bigint(20) NOT NULL,
  `debut_session` date DEFAULT NULL,
  `fin_session` date DEFAULT NULL,
  `lieu_formation` varchar(255) DEFAULT NULL,
  `type_session` varchar(255) DEFAULT NULL,
  `formation_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `soustheme_formation`
--

CREATE TABLE `soustheme_formation` (
  `soustheme_id` bigint(20) NOT NULL,
  `formation_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `sous_theme`
--

CREATE TABLE `sous_theme` (
  `id` bigint(20) NOT NULL,
  `nom_soustheme` varchar(255) DEFAULT NULL,
  `theme_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `theme`
--

CREATE TABLE `theme` (
  `id` bigint(20) NOT NULL,
  `nom_theme` varchar(255) DEFAULT NULL,
  `domaine_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

CREATE TABLE `utilisateur` (
  `id` bigint(20) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `est_client` bit(1) DEFAULT NULL,
  `est_formateur` bit(1) DEFAULT NULL,
  `est_responsable` bit(1) DEFAULT NULL,
  `experience` int(11) DEFAULT NULL,
  `fonction` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `nom_entreprise` varchar(255) DEFAULT NULL,
  `note_formateur` int(11) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  `adresse_id` bigint(20) DEFAULT NULL,
  `service_id` bigint(20) DEFAULT NULL,
  `session_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Index pour les tables exportées
--

--
-- Index pour la table `adresse`
--
ALTER TABLE `adresse`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `domaine`
--
ALTER TABLE `domaine`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `evaluation`
--
ALTER TABLE `evaluation`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK76e3k0i0mulegsle1qapcie8` (`utilisateur_id`);

--
-- Index pour la table `formation`
--
ALTER TABLE `formation`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `service`
--
ALTER TABLE `service`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `session`
--
ALTER TABLE `session`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKgxjpjguyud7yk8jb51ygcmay1` (`formation_id`);

--
-- Index pour la table `soustheme_formation`
--
ALTER TABLE `soustheme_formation`
  ADD PRIMARY KEY (`soustheme_id`,`formation_id`),
  ADD KEY `FKexc2lh85w7pg96d5cobp3momv` (`formation_id`);

--
-- Index pour la table `sous_theme`
--
ALTER TABLE `sous_theme`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKifst4tqu62w3vs569ycgj6h1q` (`theme_id`);

--
-- Index pour la table `theme`
--
ALTER TABLE `theme`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKlsvfon8w8hmkevf43qw90f0qf` (`domaine_id`);

--
-- Index pour la table `utilisateur`
--
ALTER TABLE `utilisateur`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKdvxe31y87uhakroedfn9vxgdy` (`adresse_id`),
  ADD KEY `FKoknusafgg0pbqwb5j6cpuqg5i` (`service_id`),
  ADD KEY `FKtd79fl0htjimbsdlmogw3n9a0` (`session_id`);

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `evaluation`
--
ALTER TABLE `evaluation`
  ADD CONSTRAINT `FK76e3k0i0mulegsle1qapcie8` FOREIGN KEY (`utilisateur_id`) REFERENCES `utilisateur` (`id`);

--
-- Contraintes pour la table `session`
--
ALTER TABLE `session`
  ADD CONSTRAINT `FKgxjpjguyud7yk8jb51ygcmay1` FOREIGN KEY (`formation_id`) REFERENCES `formation` (`id`);

--
-- Contraintes pour la table `soustheme_formation`
--
ALTER TABLE `soustheme_formation`
  ADD CONSTRAINT `FK7sih3t616ech8wql68ufmiwry` FOREIGN KEY (`soustheme_id`) REFERENCES `sous_theme` (`id`),
  ADD CONSTRAINT `FKexc2lh85w7pg96d5cobp3momv` FOREIGN KEY (`formation_id`) REFERENCES `formation` (`id`);

--
-- Contraintes pour la table `sous_theme`
--
ALTER TABLE `sous_theme`
  ADD CONSTRAINT `FKifst4tqu62w3vs569ycgj6h1q` FOREIGN KEY (`theme_id`) REFERENCES `theme` (`id`);

--
-- Contraintes pour la table `theme`
--
ALTER TABLE `theme`
  ADD CONSTRAINT `FKlsvfon8w8hmkevf43qw90f0qf` FOREIGN KEY (`domaine_id`) REFERENCES `domaine` (`id`);

--
-- Contraintes pour la table `utilisateur`
--
ALTER TABLE `utilisateur`
  ADD CONSTRAINT `FKdvxe31y87uhakroedfn9vxgdy` FOREIGN KEY (`adresse_id`) REFERENCES `adresse` (`id`),
  ADD CONSTRAINT `FKoknusafgg0pbqwb5j6cpuqg5i` FOREIGN KEY (`service_id`) REFERENCES `service` (`id`),
  ADD CONSTRAINT `FKtd79fl0htjimbsdlmogw3n9a0` FOREIGN KEY (`session_id`) REFERENCES `session` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
