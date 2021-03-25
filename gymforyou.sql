-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Mar 25, 2021 alle 22:07
-- Versione del server: 10.4.11-MariaDB
-- Versione PHP: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gymforyou`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `consultazione`
--

CREATE TABLE `consultazione` (
  `id` int(255) NOT NULL,
  `utente` varchar(255) NOT NULL,
  `dottore` varchar(255) DEFAULT NULL,
  `trainer` varchar(255) DEFAULT NULL,
  `categoria` varchar(255) NOT NULL,
  `domanda` varchar(255) NOT NULL,
  `risposta` varchar(255) DEFAULT NULL,
  `voto` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struttura della tabella `credenziali`
--

CREATE TABLE `credenziali` (
  `id` int(5) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(32) NOT NULL,
  `type` varchar(3) NOT NULL DEFAULT 'usr'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `credenziali`
--

INSERT INTO `credenziali` (`id`, `email`, `password`, `type`) VALUES
(22, 'admin@admin.it', 'f6fdffe48c908deb0f4c3bd36c032e72', 'adm'),
(54, 'emainfortuna', '6038503b7494be43e875255d263d70e6', 'usr'),
(62, 'francescobiasi', '42f7f1b30cf8fa388dc16266ebc2835d', 'med'),
(63, 'medicomedico', '0a79e66afa6e537a23dc62438f56c148', 'med'),
(64, 'trainer@trainer.it', 'c93216f92bc1e10d2bfa76be93bac1aa', 'trn');

-- --------------------------------------------------------

--
-- Struttura della tabella `dottore`
--

CREATE TABLE `dottore` (
  `email` varchar(255) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `cognome` varchar(255) NOT NULL,
  `voto` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `dottore`
--

INSERT INTO `dottore` (`email`, `nome`, `cognome`, `voto`) VALUES
('francescobiasi', 'francesco', 'biasi', 4),
('medicomedico', 'medico', 'medico', NULL);

-- --------------------------------------------------------

--
-- Struttura della tabella `misure`
--

CREATE TABLE `misure` (
  `email` varchar(255) NOT NULL,
  `petto_iniz` float DEFAULT 0,
  `bicipite_iniz` float DEFAULT 0,
  `avambraccio_iniz` float DEFAULT 0,
  `cosce_iniz` float DEFAULT 0,
  `polpacci_iniz` float DEFAULT 0,
  `petto_inter` float DEFAULT 0,
  `bicipite_inter` float DEFAULT 0,
  `avambraccio_inter` float DEFAULT 0,
  `cosce_inter` float DEFAULT 0,
  `polpacci_inter` float DEFAULT 0,
  `petto_final` float DEFAULT 0,
  `bicipite_final` float DEFAULT 0,
  `avambraccio_final` float DEFAULT 0,
  `cosce_final` float DEFAULT 0,
  `polpacci_final` float DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struttura della tabella `questionario`
--

CREATE TABLE `questionario` (
  `email` varchar(255) NOT NULL,
  `prima` varchar(2) NOT NULL,
  `seconda` varchar(2) NOT NULL,
  `terza` varchar(2) NOT NULL,
  `quarta` varchar(2) NOT NULL,
  `quinta` varchar(2) NOT NULL,
  `sesta` varchar(2) NOT NULL,
  `settima` varchar(2) NOT NULL,
  `ottava` varchar(2) NOT NULL,
  `nona` varchar(2) NOT NULL,
  `decima` varchar(2) NOT NULL,
  `undicesima` varchar(2) NOT NULL,
  `dodicesima` varchar(2) NOT NULL,
  `tredicesima` varchar(2) NOT NULL,
  `esito` varchar(10) NOT NULL DEFAULT 'vuoto'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struttura della tabella `trainer`
--

CREATE TABLE `trainer` (
  `email` varchar(255) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `cognome` varchar(255) NOT NULL,
  `voto` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `trainer`
--

INSERT INTO `trainer` (`email`, `nome`, `cognome`, `voto`) VALUES
('trainer@trainer.it', 'trainer', 'trainer', 4);

-- --------------------------------------------------------

--
-- Struttura della tabella `utente`
--

CREATE TABLE `utente` (
  `id` int(5) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `cognome` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `genere` varchar(10) NOT NULL,
  `peso` float NOT NULL DEFAULT 0,
  `altezza` float NOT NULL DEFAULT 0,
  `polso` float DEFAULT 0,
  `caviglia` float DEFAULT 0,
  `crf_vita` float DEFAULT 0,
  `crf_collo` float DEFAULT 0,
  `crf_fianchi` float DEFAULT 0,
  `questionario` varchar(2) NOT NULL DEFAULT 'no',
  `massa_grassa` double NOT NULL DEFAULT 0,
  `massa_magra` double NOT NULL DEFAULT 0,
  `esito` varchar(10) NOT NULL DEFAULT 'vuoto'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dump dei dati per la tabella `utente`
--

INSERT INTO `utente` (`id`, `nome`, `cognome`, `email`, `genere`, `peso`, `altezza`, `polso`, `caviglia`, `crf_vita`, `crf_collo`, `crf_fianchi`, `questionario`, `massa_grassa`, `massa_magra`, `esito`) VALUES
(43, 'ema', 'infortuna', 'emainfortuna', 'U', 55, 175, 0, 0, 0, 0, 0, 'no', 0, 0, 'vuoto');

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `consultazione`
--
ALTER TABLE `consultazione`
  ADD PRIMARY KEY (`id`);

--
-- Indici per le tabelle `credenziali`
--
ALTER TABLE `credenziali`
  ADD PRIMARY KEY (`id`);

--
-- Indici per le tabelle `dottore`
--
ALTER TABLE `dottore`
  ADD PRIMARY KEY (`email`);

--
-- Indici per le tabelle `misure`
--
ALTER TABLE `misure`
  ADD PRIMARY KEY (`email`);

--
-- Indici per le tabelle `questionario`
--
ALTER TABLE `questionario`
  ADD PRIMARY KEY (`email`);

--
-- Indici per le tabelle `trainer`
--
ALTER TABLE `trainer`
  ADD PRIMARY KEY (`email`);

--
-- Indici per le tabelle `utente`
--
ALTER TABLE `utente`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `consultazione`
--
ALTER TABLE `consultazione`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT per la tabella `credenziali`
--
ALTER TABLE `credenziali`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=65;

--
-- AUTO_INCREMENT per la tabella `utente`
--
ALTER TABLE `utente`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
