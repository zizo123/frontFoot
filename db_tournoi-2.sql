-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Client :  127.0.0.1
-- Généré le :  Jeu 01 Février 2018 à 19:05
-- Version du serveur :  5.7.14
-- Version de PHP :  5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `db_tournoi`
--

-- --------------------------------------------------------

--
-- Structure de la table `bareme`
--

CREATE TABLE `bareme` (
  `id` bigint(20) NOT NULL,
  `bareme_defaite` int(11) NOT NULL,
  `bareme_nul` int(11) NOT NULL,
  `bareme_victoire` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `bareme`
--

INSERT INTO `bareme` (`id`, `bareme_defaite`, `bareme_nul`, `bareme_victoire`) VALUES
(1, 0, 1, 3);

-- --------------------------------------------------------

--
-- Structure de la table `but`
--

CREATE TABLE `but` (
  `id` bigint(20) NOT NULL,
  `minute` int(11) NOT NULL,
  `game_id` bigint(20) DEFAULT NULL,
  `joueur_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `but`
--

INSERT INTO `but` (`id`, `minute`, `game_id`, `joueur_id`) VALUES
(1, 80, 1, 1),
(2, 45, 1, 2);

-- --------------------------------------------------------

--
-- Structure de la table `championnat`
--

CREATE TABLE `championnat` (
  `id` bigint(20) NOT NULL,
  `libelle` varchar(255) DEFAULT NULL,
  `saison_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `championnat`
--

INSERT INTO `championnat` (`id`, `libelle`, `saison_id`) VALUES
(1, 'botola pro', 1);

-- --------------------------------------------------------

--
-- Structure de la table `championnat_equipes`
--

CREATE TABLE `championnat_equipes` (
  `equipe_id` bigint(20) NOT NULL,
  `championnat_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `championnat_equipes`
--

INSERT INTO `championnat_equipes` (`equipe_id`, `championnat_id`) VALUES
(1, 1),
(2, 1);

-- --------------------------------------------------------

--
-- Structure de la table `equipe`
--

CREATE TABLE `equipe` (
  `id` bigint(20) NOT NULL,
  `nom_equipe` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `equipe`
--

INSERT INTO `equipe` (`id`, `nom_equipe`) VALUES
(1, 'raja'),
(2, 'widad');

-- --------------------------------------------------------

--
-- Structure de la table `equipe_entraineurs`
--

CREATE TABLE `equipe_entraineurs` (
  `id` bigint(20) NOT NULL,
  `date_debut` datetime DEFAULT NULL,
  `date_fin` datetime DEFAULT NULL,
  `entraineur_id` bigint(20) DEFAULT NULL,
  `equipe_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `equipe_entraineurs`
--

INSERT INTO `equipe_entraineurs` (`id`, `date_debut`, `date_fin`, `entraineur_id`, `equipe_id`) VALUES
(1, '2017-01-01 00:00:00', '2018-08-28 00:00:00', 3, 1),
(2, '2018-01-01 00:00:00', '2018-05-26 00:00:00', 4, 1);

-- --------------------------------------------------------

--
-- Structure de la table `equipe_joueurs`
--

CREATE TABLE `equipe_joueurs` (
  `num_maillot` int(11) NOT NULL,
  `poste` varchar(255) DEFAULT NULL,
  `equipe_id` bigint(20) NOT NULL,
  `joueur_id` bigint(20) NOT NULL,
  `saison_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `equipe_joueurs`
--

INSERT INTO `equipe_joueurs` (`num_maillot`, `poste`, `equipe_id`, `joueur_id`, `saison_id`) VALUES
(10, 'attaquant', 1, 1, 1),
(5, 'defenceur', 2, 2, 1);

-- --------------------------------------------------------

--
-- Structure de la table `game`
--

CREATE TABLE `game` (
  `id` bigint(20) NOT NULL,
  `date_game` datetime DEFAULT NULL,
  `nombre_spectateur` int(11) NOT NULL,
  `arbitre_id` bigint(20) DEFAULT NULL,
  `equipea_id` bigint(20) DEFAULT NULL,
  `equipeb_id` bigint(20) DEFAULT NULL,
  `journee_id` bigint(20) DEFAULT NULL,
  `stade_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `game`
--

INSERT INTO `game` (`id`, `date_game`, `nombre_spectateur`, `arbitre_id`, `equipea_id`, `equipeb_id`, `journee_id`, `stade_id`) VALUES
(1, '2018-01-06 00:00:00', 40000, 5, 1, 2, 1, 1);

-- --------------------------------------------------------

--
-- Structure de la table `game_joueurs`
--

CREATE TABLE `game_joueurs` (
  `joueur_id` bigint(20) NOT NULL,
  `game_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `game_joueurs`
--

INSERT INTO `game_joueurs` (`joueur_id`, `game_id`) VALUES
(1, 1),
(2, 1);

-- --------------------------------------------------------

--
-- Structure de la table `journee`
--

CREATE TABLE `journee` (
  `id` bigint(20) NOT NULL,
  `numero` int(11) NOT NULL,
  `championnat_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `journee`
--

INSERT INTO `journee` (`id`, `numero`, `championnat_id`) VALUES
(1, 1, 1),
(2, 2, 1);

-- --------------------------------------------------------

--
-- Structure de la table `nationalite`
--

CREATE TABLE `nationalite` (
  `id` bigint(20) NOT NULL,
  `nation` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `nationalite`
--

INSERT INTO `nationalite` (`id`, `nation`) VALUES
(1, 'Maroc'),
(2, 'France');

-- --------------------------------------------------------

--
-- Structure de la table `personne`
--

CREATE TABLE `personne` (
  `id` bigint(20) NOT NULL,
  `type` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `nationalite_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `personne`
--

INSERT INTO `personne` (`id`, `type`, `nom`, `prenom`, `nationalite_id`) VALUES
(1, 'joueur', 'tiss', 'soufiane', 1),
(2, 'joueur', 'zahraoui', 'oussama', 2),
(3, 'entraineur', 'fakhir', 'mohamed', 1),
(4, 'entraineur', 'amouta', 'hassan', 1),
(5, 'arbitre', 'lebkola', 'abdelkrim', 1);

-- --------------------------------------------------------

--
-- Structure de la table `remplacement`
--

CREATE TABLE `remplacement` (
  `id` bigint(20) NOT NULL,
  `minute` int(11) NOT NULL,
  `joueur_in_id` bigint(20) DEFAULT NULL,
  `joueur_out_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `saison`
--

CREATE TABLE `saison` (
  `id` bigint(20) NOT NULL,
  `libelle` varchar(255) DEFAULT NULL,
  `bareme_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `saison`
--

INSERT INTO `saison` (`id`, `libelle`, `bareme_id`) VALUES
(1, '2017/2018', 1);

-- --------------------------------------------------------

--
-- Structure de la table `stade`
--

CREATE TABLE `stade` (
  `id` bigint(20) NOT NULL,
  `nom_stade` varchar(255) DEFAULT NULL,
  `nombre_place` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `stade`
--

INSERT INTO `stade` (`id`, `nom_stade`, `nombre_place`) VALUES
(1, 'stade d\'honor', 40000),
(2, 'stade abjigo', 200000);

--
-- Index pour les tables exportées
--

--
-- Index pour la table `bareme`
--
ALTER TABLE `bareme`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `but`
--
ALTER TABLE `but`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK97lnmhb8tkar6qnpcd255sg97` (`game_id`),
  ADD KEY `FKk5bofovmsxp90werhwo17bwd8` (`joueur_id`);

--
-- Index pour la table `championnat`
--
ALTER TABLE `championnat`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKcqhg6abbiv977ii6v2kfqcdi6` (`saison_id`);

--
-- Index pour la table `championnat_equipes`
--
ALTER TABLE `championnat_equipes`
  ADD PRIMARY KEY (`championnat_id`,`equipe_id`),
  ADD KEY `FKb1hbln6lqa2wyl5aey3yfqr5b` (`equipe_id`);

--
-- Index pour la table `equipe`
--
ALTER TABLE `equipe`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `equipe_entraineurs`
--
ALTER TABLE `equipe_entraineurs`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK4b6fjcqtsllh4x4kcel0qdcn` (`entraineur_id`),
  ADD KEY `FK8bblltc0odagdkrrvmxb4j6mb` (`equipe_id`);

--
-- Index pour la table `equipe_joueurs`
--
ALTER TABLE `equipe_joueurs`
  ADD PRIMARY KEY (`equipe_id`,`joueur_id`,`saison_id`),
  ADD KEY `FKjt9ewsa69w3pbwgxs5u29k5yw` (`joueur_id`),
  ADD KEY `FKnvi3qc117rixwa9wrgfdo0o6c` (`saison_id`);

--
-- Index pour la table `game`
--
ALTER TABLE `game`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK4mh6pk9bly2nrt5l02081172h` (`arbitre_id`),
  ADD KEY `FKa1peo79hy3wvxfkifxggu22lg` (`journee_id`),
  ADD KEY `FKbmg1ih6mx1s4wdh2w0h1ttbg4` (`equipeb_id`),
  ADD KEY `FKm1w2r1jykwp0uo1i9m8lidxob` (`equipea_id`),
  ADD KEY `FKsv64v3jnfal0sv5k0u2fvi785` (`stade_id`);

--
-- Index pour la table `game_joueurs`
--
ALTER TABLE `game_joueurs`
  ADD PRIMARY KEY (`game_id`,`joueur_id`),
  ADD KEY `FKjchxihfpjrtny7djl97lwscq` (`joueur_id`);

--
-- Index pour la table `journee`
--
ALTER TABLE `journee`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK95fgbbonxnxo90k9dx8vmghrb` (`championnat_id`);

--
-- Index pour la table `nationalite`
--
ALTER TABLE `nationalite`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `personne`
--
ALTER TABLE `personne`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKkenihid5kc1hh7v33oab2u74f` (`nationalite_id`);

--
-- Index pour la table `remplacement`
--
ALTER TABLE `remplacement`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKgec6psko09b1n7y25w14nlwd5` (`joueur_out_id`),
  ADD KEY `FKq8vyrpi2nspr74bj50iir757q` (`joueur_in_id`);

--
-- Index pour la table `saison`
--
ALTER TABLE `saison`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKexet4cf6ja1iyd9thtijhs9li` (`bareme_id`);

--
-- Index pour la table `stade`
--
ALTER TABLE `stade`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `bareme`
--
ALTER TABLE `bareme`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT pour la table `but`
--
ALTER TABLE `but`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT pour la table `championnat`
--
ALTER TABLE `championnat`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT pour la table `equipe`
--
ALTER TABLE `equipe`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT pour la table `equipe_entraineurs`
--
ALTER TABLE `equipe_entraineurs`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT pour la table `game`
--
ALTER TABLE `game`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT pour la table `journee`
--
ALTER TABLE `journee`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT pour la table `nationalite`
--
ALTER TABLE `nationalite`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT pour la table `personne`
--
ALTER TABLE `personne`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT pour la table `remplacement`
--
ALTER TABLE `remplacement`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `saison`
--
ALTER TABLE `saison`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT pour la table `stade`
--
ALTER TABLE `stade`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `but`
--
ALTER TABLE `but`
  ADD CONSTRAINT `FK97lnmhb8tkar6qnpcd255sg97` FOREIGN KEY (`game_id`) REFERENCES `game` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FKk5bofovmsxp90werhwo17bwd8` FOREIGN KEY (`joueur_id`) REFERENCES `personne` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `championnat`
--
ALTER TABLE `championnat`
  ADD CONSTRAINT `FKcqhg6abbiv977ii6v2kfqcdi6` FOREIGN KEY (`saison_id`) REFERENCES `saison` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `championnat_equipes`
--
ALTER TABLE `championnat_equipes`
  ADD CONSTRAINT `FK7e0x8ur7dhpsuw92kgq73hunq` FOREIGN KEY (`championnat_id`) REFERENCES `championnat` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FKb1hbln6lqa2wyl5aey3yfqr5b` FOREIGN KEY (`equipe_id`) REFERENCES `equipe` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `equipe_entraineurs`
--
ALTER TABLE `equipe_entraineurs`
  ADD CONSTRAINT `FK4b6fjcqtsllh4x4kcel0qdcn` FOREIGN KEY (`entraineur_id`) REFERENCES `personne` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK8bblltc0odagdkrrvmxb4j6mb` FOREIGN KEY (`equipe_id`) REFERENCES `equipe` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `equipe_joueurs`
--
ALTER TABLE `equipe_joueurs`
  ADD CONSTRAINT `FK33hpuffm7dgi6lf2744ahf3e1` FOREIGN KEY (`equipe_id`) REFERENCES `equipe` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FKjt9ewsa69w3pbwgxs5u29k5yw` FOREIGN KEY (`joueur_id`) REFERENCES `personne` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FKnvi3qc117rixwa9wrgfdo0o6c` FOREIGN KEY (`saison_id`) REFERENCES `saison` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `game`
--
ALTER TABLE `game`
  ADD CONSTRAINT `FK4mh6pk9bly2nrt5l02081172h` FOREIGN KEY (`arbitre_id`) REFERENCES `personne` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FKa1peo79hy3wvxfkifxggu22lg` FOREIGN KEY (`journee_id`) REFERENCES `journee` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FKbmg1ih6mx1s4wdh2w0h1ttbg4` FOREIGN KEY (`equipeb_id`) REFERENCES `equipe` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FKm1w2r1jykwp0uo1i9m8lidxob` FOREIGN KEY (`equipea_id`) REFERENCES `equipe` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FKsv64v3jnfal0sv5k0u2fvi785` FOREIGN KEY (`stade_id`) REFERENCES `stade` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `game_joueurs`
--
ALTER TABLE `game_joueurs`
  ADD CONSTRAINT `FK8xywvqyl2dndug5l5wbtbxosy` FOREIGN KEY (`game_id`) REFERENCES `game` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FKjchxihfpjrtny7djl97lwscq` FOREIGN KEY (`joueur_id`) REFERENCES `personne` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `journee`
--
ALTER TABLE `journee`
  ADD CONSTRAINT `FK95fgbbonxnxo90k9dx8vmghrb` FOREIGN KEY (`championnat_id`) REFERENCES `championnat` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `personne`
--
ALTER TABLE `personne`
  ADD CONSTRAINT `FKkenihid5kc1hh7v33oab2u74f` FOREIGN KEY (`nationalite_id`) REFERENCES `nationalite` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `remplacement`
--
ALTER TABLE `remplacement`
  ADD CONSTRAINT `FKgec6psko09b1n7y25w14nlwd5` FOREIGN KEY (`joueur_out_id`) REFERENCES `personne` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FKq8vyrpi2nspr74bj50iir757q` FOREIGN KEY (`joueur_in_id`) REFERENCES `personne` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `saison`
--
ALTER TABLE `saison`
  ADD CONSTRAINT `FKexet4cf6ja1iyd9thtijhs9li` FOREIGN KEY (`bareme_id`) REFERENCES `bareme` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
