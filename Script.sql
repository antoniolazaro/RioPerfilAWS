--<ScriptOptions statementTerminator=";"/>


--
-- Table structure for table `auditoria_acesso`
--

DROP TABLE IF EXISTS `auditoria_acesso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `auditoria_acesso` (
  `COD_ACESSO` int(11) NOT NULL AUTO_INCREMENT,
  `DAT_ACESSO` varchar(45) DEFAULT NULL,
  `COD_USUARIO` int(11) NOT NULL,
  PRIMARY KEY (`COD_ACESSO`),
  KEY `fk_AUDITORIA_ACESSO_USUARIO1` (`COD_USUARIO`),
  CONSTRAINT `fk_AUDITORIA_ACESSO_USUARIO1` FOREIGN KEY (`COD_USUARIO`) REFERENCES `usuario` (`COD_USUARIO`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=134 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `auditoria_acesso`
--

LOCK TABLES `auditoria_acesso` WRITE;
/*!40000 ALTER TABLE `auditoria_acesso` DISABLE KEYS */;
INSERT INTO `auditoria_acesso` VALUES (8,'2012-03-15 15:39:08',21),(9,'2012-03-16 09:36:52',22),(10,'2012-03-16 09:52:55',21),(11,'2012-03-16 11:47:02',23),(12,'2012-03-16 11:58:23',23),(13,'2012-03-17 11:46:41',24),(14,'2012-03-17 14:54:58',21),(15,'2012-03-17 15:26:30',24),(16,'2012-03-17 16:08:10',21),(17,'2012-03-17 21:02:12',21),(18,'2012-03-19 11:03:40',23),(19,'2012-03-19 11:07:07',23),(20,'2012-03-22 14:00:55',27),(21,'2012-03-22 17:32:18',21),(22,'2012-03-22 21:11:21',21),(23,'2012-03-23 11:30:28',21),(24,'2012-03-23 11:33:18',21),(25,'2012-03-23 11:37:48',21),(26,'2012-03-23 11:39:12',21),(27,'2012-03-23 11:43:47',21),(28,'2012-03-23 11:49:37',21),(29,'2012-03-23 11:51:53',21),(30,'2012-03-23 11:55:01',21),(31,'2012-03-23 13:58:51',21),(32,'2012-03-23 14:10:49',21),(33,'2012-03-23 14:16:09',21),(34,'2012-03-23 15:04:17',21),(35,'2012-03-23 15:06:26',21),(36,'2012-03-23 15:39:06',21),(37,'2012-03-23 15:43:23',21),(38,'2012-03-23 15:45:56',21),(39,'2012-03-23 15:46:24',21),(40,'2012-03-23 15:56:30',21),(41,'2012-03-23 15:57:49',21),(42,'2012-03-23 16:00:12',21),(43,'2012-03-23 16:02:10',21),(44,'2012-03-23 16:16:17',21),(45,'2012-03-23 16:23:56',21),(46,'2012-03-23 16:40:45',24),(47,'2012-03-23 16:55:35',21),(48,'2012-03-23 17:02:39',21),(49,'2012-03-23 17:06:28',21),(50,'2012-03-23 17:45:02',27),(51,'2012-03-24 00:45:04',21),(52,'2012-03-25 23:37:27',26),(53,'2012-03-26 15:24:46',27),(54,'2012-03-27 20:25:53',21),(55,'2012-03-28 08:34:23',21),(56,'2012-03-28 09:11:20',21),(57,'2012-03-28 10:23:34',21),(58,'2012-03-28 10:50:20',37),(59,'2012-03-28 11:14:08',37),(60,'2012-03-28 12:28:30',43),(61,'2012-03-28 14:00:48',21),(62,'2012-03-28 14:32:53',21),(63,'2012-03-28 15:16:27',46),(64,'2012-03-28 17:04:47',21),(65,'2012-03-28 18:02:16',37),(66,'2012-03-28 18:03:43',37),(67,'2012-03-28 21:04:46',21),(68,'2012-03-28 23:22:56',43),(69,'2012-03-29 15:18:40',21),(70,'2012-03-29 16:51:17',21),(71,'2012-03-29 17:37:57',21),(72,'2012-03-29 17:38:43',21),(73,'2012-03-29 18:16:06',21),(74,'2012-03-29 20:56:07',21),(75,'2012-03-30 00:16:20',21),(76,'2012-03-30 11:32:32',62),(77,'2012-03-30 13:38:43',65),(78,'2012-03-30 16:12:54',21),(79,'2012-03-30 17:49:31',57),(80,'2012-03-30 21:17:58',43),(81,'2012-03-30 21:27:25',58),(82,'2012-03-30 22:32:05',65),(83,'2012-03-30 22:32:17',65),(84,'2012-03-31 21:15:22',21),(85,'2012-03-31 22:37:49',64),(86,'2012-04-01 17:44:59',37),(87,'2012-04-02 07:44:09',74),(88,'2012-04-02 07:49:30',74),(89,'2012-04-02 13:53:46',65),(90,'2012-04-03 10:58:10',62),(91,'2012-04-03 12:03:35',74),(92,'2012-04-03 19:29:09',74),(93,'2012-04-03 19:49:07',74),(94,'2012-04-04 15:11:54',21),(95,'2012-04-04 19:02:21',74),(96,'2012-04-05 01:18:23',26),(97,'2012-04-05 08:39:30',21),(98,'2012-04-06 12:02:04',37),(99,'2012-04-06 15:01:08',72),(100,'2012-04-06 15:03:44',72),(101,'2012-04-06 19:04:05',73),(102,'2012-04-07 14:44:18',21),(103,'2012-04-08 18:50:50',78),(104,'2012-04-09 19:19:32',26),(105,'2012-04-11 20:37:50',21),(106,'2012-04-11 20:45:57',78),(107,'2012-04-12 21:26:50',21),(108,'2012-04-13 16:59:39',89),(109,'2012-04-16 23:41:02',26),(110,'2012-04-17 18:43:33',85),(111,'2012-04-17 23:54:05',21),(112,'2012-04-17 23:54:12',21),(113,'2012-04-17 23:54:12',21),(114,'2012-04-17 23:54:12',21),(115,'2012-04-18 21:57:19',21),(116,'2012-04-20 20:36:34',21),(117,'2012-04-20 20:40:25',21),(118,'2012-04-26 23:09:16',21),(119,'2012-04-28 09:53:46',88),(120,'2012-05-08 20:02:47',21),(121,'2012-05-08 20:14:13',21),(122,'2012-05-08 20:21:38',21),(123,'2012-05-08 20:28:32',21),(124,'2012-05-08 20:29:30',21),(125,'2012-05-08 20:33:39',21),(126,'2012-05-08 20:33:51',21),(127,'2012-05-08 20:37:56',21),(128,'2012-05-08 20:38:51',21),(129,'2012-05-08 20:39:08',21),(130,'2012-05-08 22:48:39',21),(131,'2012-05-08 23:08:14',21),(132,'2012-05-09 00:54:36',21),(133,'2012-05-09 10:52:58',24);
/*!40000 ALTER TABLE `auditoria_acesso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comentario`
--

DROP TABLE IF EXISTS `comentario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comentario` (
  `COD_COMENTARIO` int(11) NOT NULL AUTO_INCREMENT,
  `DESCRICAO` varchar(300) NOT NULL,
  `DATA_CRIACAO` datetime NOT NULL,
  `VALOR` int(11) NOT NULL DEFAULT '5',
  `FLG_ATIVO` varchar(1) DEFAULT '1',
  `COD_USUARIO` int(11) NOT NULL,
  `COD_MARCADOR` int(11) NOT NULL,
  `FLG_COMENT_FACEBOOK` varchar(1) DEFAULT '0',
  `FLG_COMENT_TWITTER` varchar(1) DEFAULT '0',
  PRIMARY KEY (`COD_COMENTARIO`),
  KEY `fk_COMENTARIO_USUARIO` (`COD_USUARIO`),
  KEY `fk_COMENTARIO_MARCADOR1` (`COD_MARCADOR`),
  CONSTRAINT `fk_COMENTARIO_MARCADOR1` FOREIGN KEY (`COD_MARCADOR`) REFERENCES `marcador` (`COD_MARCADOR`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_COMENTARIO_USUARIO1` FOREIGN KEY (`COD_USUARIO`) REFERENCES `usuario` (`COD_USUARIO`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=210 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comentario`
--

LOCK TABLES `comentario` WRITE;
/*!40000 ALTER TABLE `comentario` DISABLE KEYS */;
INSERT INTO `comentario` VALUES (178,'Excelente atendimento. Deixou a desejar apenas na limpeza.','2012-03-15 15:29:12',4,NULL,21,25,NULL,NULL),(179,'Atendimento lento, pessoas despreparadas e não tive o meu problema resolvido. Só não dou 1 porque a estrutura não é das piores.','2012-03-15 15:38:59',2,NULL,21,43,NULL,NULL),(180,'Eis a escola do meu filho. Excelente estabelecimento. Parabéns pró Gisa, graças ao seu esforço e boa vontade meu filho tem a educ. merecida','2012-03-15 15:40:14',5,NULL,21,59,NULL,NULL),(181,'Nada de muito ruim a declarar. Só não é 100% por conta da fila.','2012-03-15 15:42:43',4,NULL,21,60,NULL,NULL),(182,'Muito sujo.. um dos poucos que funcionam mas é um lixo. Tem que limpar né ???','2012-03-16 09:52:48',1,NULL,21,61,NULL,NULL),(183,'Simplesmente PERFEITO !!! Excelente estrutura e é lá que o fogão ganha tudo !!! FOOGggoo Fooogoooo','2012-03-16 09:53:31',4,NULL,21,62,NULL,NULL),(184,'Nunca funcionou ! ','2012-03-16 09:54:41',3,NULL,21,63,NULL,NULL),(186,'Legal ','2012-03-16 12:00:57',3,NULL,23,35,NULL,NULL),(187,'Gostei da estrutura da escola. Recomendo.','2012-03-17 14:50:55',4,NULL,21,30,NULL,NULL),(188,'Gostei da visita que fiz a escola. Recomendo!','2012-03-17 16:04:16',3,NULL,21,52,NULL,NULL),(189,'Pessimo atendimento. Sai sem ser atendido.','2012-03-17 21:03:19',1,NULL,21,65,NULL,NULL),(191,'Excelente atendimento, exames disponíveis, profissionais capacitados e muito limpo.','2012-03-24 00:45:10',5,NULL,21,67,NULL,NULL),(192,'estrutura\n\n','2012-03-27 20:27:53',3,NULL,21,33,NULL,NULL),(193,'Excelente refeição porém o antedimento foi lento','2012-03-29 16:52:09',3,NULL,21,68,NULL,NULL),(194,'excelente cafe. sucesso','2012-03-30 16:10:15',4,NULL,21,66,NULL,NULL),(196,'Excelente para passar tempo , tomar uma gelada e relaxar.','2012-03-31 21:16:01',4,NULL,21,69,NULL,NULL),(197,'Poderia ter mais opções','2012-03-31 21:16:27',2,NULL,21,70,NULL,NULL),(198,'Simplesmente perfeito!','2012-03-31 21:17:06',5,NULL,21,71,NULL,NULL),(199,'Bom hotel. Recomendo','2012-03-31 21:18:30',3,NULL,21,72,NULL,NULL),(200,'Tradicional, perfeito e emblemático. Orgulho de ter essa estrutura para receber as celebridades. Excelente serviço!!','2012-03-31 21:19:34',5,NULL,21,73,NULL,NULL),(201,'Bom','2012-03-31 21:22:57',3,NULL,21,69,NULL,NULL),(202,'Muita música e som de alta qualidade. Na noite de Copacabana não pode faltar uma passadinha nesse Bar Club quando visitar o Rio.','2012-03-31 21:25:32',5,NULL,21,74,NULL,NULL),(203,'serviço bem prestado!','2012-04-05 08:40:15',3,NULL,21,35,NULL,NULL),(204,'Gostei da estrutura da escola.','2012-04-07 14:39:00',3,NULL,21,33,NULL,NULL),(205,'Bom hotel. Limpo organizado, com um bom restaurante e perto do metrô ( Est. Cardeal Arco verde).\n\n\n','2012-04-11 20:48:27',4,NULL,78,75,NULL,NULL),(206,'Local simpatico e com bom preco.. recomendo','2012-04-12 21:26:56',4,NULL,21,76,NULL,NULL),(207,'Escola muito boa','2012-04-20 20:29:36',3,NULL,21,29,NULL,NULL),(208,'Muito boa a escola!','2012-05-08 20:23:06',4,NULL,21,35,NULL,NULL),(209,'teste novo','2012-05-09 00:42:02',3,NULL,21,33,NULL,NULL);
/*!40000 ALTER TABLE `comentario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `configuracao_parametros`
--

DROP TABLE IF EXISTS `configuracao_parametros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `configuracao_parametros` (
  `CODIGO` int(11) NOT NULL AUTO_INCREMENT,
  `NOME` varchar(100) NOT NULL,
  `VALOR` varchar(100) NOT NULL,
  PRIMARY KEY (`CODIGO`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `configuracao_parametros`
--

LOCK TABLES `configuracao_parametros` WRITE;
/*!40000 ALTER TABLE `configuracao_parametros` DISABLE KEYS */;
INSERT INTO `configuracao_parametros` VALUES (1,'APP_ID','347822ab2fb1bb2fb851c54b518888f2'),(2,'APP_SECRET','8azoc-13se5-od6vn');
/*!40000 ALTER TABLE `configuracao_parametros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contador_acesso`
--

DROP TABLE IF EXISTS `contador_acesso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contador_acesso` (
  `COD_CONTADOR` int(11) NOT NULL AUTO_INCREMENT,
  `DAT_ACESSO` datetime NOT NULL,
  `DES_IP_ACESSO` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`COD_CONTADOR`)
) ENGINE=InnoDB AUTO_INCREMENT=216 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contador_acesso`
--

LOCK TABLES `contador_acesso` WRITE;
/*!40000 ALTER TABLE `contador_acesso` DISABLE KEYS */;
INSERT INTO `contador_acesso` VALUES (1,'2012-04-07 16:27:45','177.42.127.33'),(2,'2012-04-07 16:39:46','177.42.127.33'),(3,'2012-04-07 16:53:33','177.42.127.33'),(4,'2012-04-07 17:16:39','177.42.127.33'),(5,'2012-04-07 18:18:52','189.1.143.161'),(6,'2012-04-08 10:41:20','189.26.255.132'),(7,'2012-04-08 10:45:58','189.26.255.132'),(8,'2012-04-08 10:55:10','189.26.255.132'),(9,'2012-04-08 14:19:36','177.42.127.33'),(10,'2012-04-08 14:20:28','177.42.127.33'),(11,'2012-04-08 14:56:43','177.42.127.33'),(12,'2012-04-08 15:56:13','177.42.127.33'),(13,'2012-04-08 21:22:40','200.162.213.253'),(14,'2012-04-08 22:39:23','119.63.196.125'),(15,'2012-04-08 22:39:24','119.63.196.94'),(16,'2012-04-08 23:11:39','200.162.213.253'),(17,'2012-04-09 09:04:39','200.142.128.16'),(18,'2012-04-09 09:04:40','200.142.128.16'),(19,'2012-04-09 09:05:38','200.142.128.16'),(20,'2012-04-09 09:57:48','200.142.128.16'),(21,'2012-04-09 10:19:23','177.118.234.88'),(22,'2012-04-09 10:20:34','216.38.216.101'),(23,'2012-04-09 11:40:04','200.142.128.16'),(24,'2012-04-09 12:16:30','189.3.211.194'),(25,'2012-04-09 20:44:26','186.214.183.173'),(26,'2012-04-09 20:56:42','186.214.183.173'),(27,'2012-04-09 21:03:06','186.214.183.173'),(28,'2012-04-09 21:42:52','186.214.183.173'),(29,'2012-04-09 21:43:20','186.214.183.173'),(30,'2012-04-09 21:44:49','177.99.34.150'),(31,'2012-04-09 21:47:51','177.99.34.150'),(32,'2012-04-09 22:08:15','186.214.183.173'),(33,'2012-04-09 22:08:19','186.214.183.173'),(34,'2012-04-09 22:57:32','201.8.70.172'),(35,'2012-04-09 22:59:23','177.42.218.24'),(36,'2012-04-09 23:20:26','186.214.183.173'),(37,'2012-04-09 23:35:20','186.214.183.173'),(38,'2012-04-10 00:05:22','186.214.183.173'),(39,'2012-04-10 06:31:48','66.249.72.132'),(40,'2012-04-10 09:38:09','200.187.4.102'),(41,'2012-04-10 09:40:39','200.187.4.102'),(42,'2012-04-10 10:04:46','186.205.219.118'),(43,'2012-04-10 16:08:25','173.178.27.26'),(44,'2012-04-10 20:34:21','187.59.251.229'),(45,'2012-04-10 21:57:20','177.99.34.150'),(46,'2012-04-11 08:55:50','85.139.250.107'),(47,'2012-04-11 11:04:07','201.48.114.241'),(48,'2012-04-11 11:46:24','200.255.122.251'),(49,'2012-04-11 12:46:17','201.19.113.176'),(50,'2012-04-11 12:46:30','201.19.113.176'),(51,'2012-04-11 13:43:58','201.65.190.65'),(52,'2012-04-11 23:00:18','201.87.108.115'),(53,'2012-04-11 23:36:20','187.114.184.177'),(54,'2012-04-11 23:38:42','187.114.184.177'),(55,'2012-04-12 06:35:01','177.98.241.24'),(56,'2012-04-12 12:49:26','189.108.171.10'),(57,'2012-04-12 12:50:15','189.108.171.10'),(58,'2012-04-12 13:41:56','200.142.128.16'),(59,'2012-04-12 16:10:40','189.1.143.161'),(60,'2012-04-12 21:13:26','206.41.88.2'),(61,'2012-04-12 21:16:50','206.41.88.2'),(62,'2012-04-12 21:18:26','206.41.88.2'),(63,'2012-04-13 00:53:54','189.79.127.79'),(64,'2012-04-13 16:26:14','186.215.83.185'),(65,'2012-04-14 10:17:45','186.214.184.201'),(66,'2012-04-14 10:48:52','186.214.184.201'),(67,'2012-04-14 12:05:28','177.42.227.149'),(68,'2012-04-14 12:05:58','177.42.227.149'),(69,'2012-04-14 12:36:38','177.42.227.149'),(70,'2012-04-14 13:00:41','177.42.227.149'),(71,'2012-04-14 13:31:38','177.42.227.149'),(72,'2012-04-14 13:58:18','201.19.146.166'),(73,'2012-04-14 14:16:42','177.42.227.149'),(74,'2012-04-14 14:20:47','177.42.227.149'),(75,'2012-04-14 15:49:50','177.42.227.149'),(76,'2012-04-14 16:58:22','177.42.227.149'),(77,'2012-04-14 19:07:41','177.100.111.248'),(78,'2012-04-14 23:28:17','186.214.242.123'),(79,'2012-04-15 12:11:52','177.42.233.221'),(80,'2012-04-15 14:23:14','206.172.18.93'),(81,'2012-04-15 15:17:15','177.100.111.248'),(82,'2012-04-15 21:33:39','187.126.8.45'),(83,'2012-04-15 21:34:01','187.126.8.45'),(84,'2012-04-15 21:40:33','187.126.8.45'),(85,'2012-04-15 23:10:13','177.98.246.32'),(86,'2012-04-15 23:35:12','177.98.246.32'),(87,'2012-04-15 23:37:03','177.98.246.32'),(88,'2012-04-16 06:47:40','66.249.67.13'),(89,'2012-04-16 12:40:56','200.142.128.16'),(90,'2012-04-16 12:48:55','200.142.128.16'),(91,'2012-04-16 18:19:42','200.142.128.16'),(92,'2012-04-16 19:18:07','187.63.99.220'),(93,'2012-04-16 21:56:45','177.100.111.248'),(94,'2012-04-16 22:54:43','186.214.184.44'),(95,'2012-04-17 10:13:03','200.141.78.10'),(96,'2012-04-17 10:13:26','200.141.78.10'),(97,'2012-04-17 10:14:45','200.141.78.10'),(98,'2012-04-17 13:12:39','200.255.122.251'),(99,'2012-04-17 14:28:48','200.202.193.1'),(100,'2012-04-17 14:45:26','200.142.128.16'),(101,'2012-04-17 14:52:58','200.142.128.16'),(102,'2012-04-17 18:03:10','200.216.162.113'),(103,'2012-04-17 22:38:16','177.98.241.58'),(104,'2012-04-17 22:54:59','177.98.241.58'),(105,'2012-04-17 23:36:48','189.115.156.57'),(106,'2012-04-19 12:12:44','200.142.97.242'),(107,'2012-04-19 19:13:57','189.106.162.44'),(108,'2012-04-19 21:45:45','186.194.90.210'),(109,'2012-04-19 21:57:16','186.194.90.210'),(110,'2012-04-19 22:19:03','192.168.0.118'),(111,'2012-04-19 22:31:18','192.168.0.118'),(112,'2012-04-19 22:31:58','192.168.0.118'),(113,'2012-04-19 22:34:32','192.168.0.118'),(114,'2012-04-19 23:41:40','192.168.0.118'),(115,'2012-04-20 08:31:24','192.168.0.118'),(116,'2012-04-20 14:04:35','177.98.5.153'),(117,'2012-04-20 19:36:00','189.4.220.19'),(118,'2012-04-20 20:44:52','192.168.0.118'),(119,'2012-04-20 20:53:12','192.168.0.118'),(120,'2012-04-20 21:18:46','186.194.90.210'),(121,'2012-04-21 10:06:21','186.194.90.210'),(122,'2012-04-21 10:51:10','127.0.0.1'),(123,'2012-04-21 14:54:24','127.0.0.1'),(124,'2012-04-21 14:55:28','127.0.0.1'),(125,'2012-04-21 14:57:04','127.0.0.1'),(126,'2012-04-21 14:57:32','127.0.0.1'),(127,'2012-04-21 14:58:51','127.0.0.1'),(128,'2012-04-21 19:45:55','67.207.129.72'),(129,'2012-04-21 19:46:32','67.207.129.72'),(130,'2012-04-21 19:47:00','67.207.129.72'),(131,'2012-04-22 01:33:02','127.0.0.1'),(132,'2012-04-22 17:29:35','201.23.177.68'),(133,'2012-04-22 20:58:37','127.0.0.1'),(134,'2012-04-23 13:19:25','200.142.128.16'),(135,'2012-04-23 16:33:16','200.142.128.16'),(136,'2012-04-23 23:35:17','192.168.0.118'),(137,'2012-04-24 07:44:11','182.2.85.216'),(138,'2012-04-24 08:01:02','182.2.85.216'),(139,'2012-04-24 10:40:50','200.142.128.16'),(140,'2012-04-24 22:08:06','128.6.192.156'),(141,'2012-04-24 22:08:09','128.6.192.156'),(142,'2012-04-25 00:32:01','186.214.252.9'),(143,'2012-04-25 01:44:20','187.14.7.234'),(144,'2012-04-25 01:51:40','187.14.7.234'),(145,'2012-04-26 00:07:11','192.168.0.118'),(146,'2012-04-26 07:39:11','66.249.67.240'),(147,'2012-04-26 10:17:48','200.255.122.252'),(148,'2012-04-26 10:18:06','200.255.122.252'),(149,'2012-04-26 10:18:16','200.255.122.252'),(150,'2012-04-26 10:47:41','189.25.134.136'),(151,'2012-04-26 11:48:21','189.60.102.37'),(152,'2012-04-26 15:38:41','200.142.128.16'),(153,'2012-04-26 16:31:38','189.60.169.248'),(154,'2012-04-26 16:43:05','200.142.97.242'),(155,'2012-04-26 17:06:30','200.142.97.242'),(156,'2012-04-26 20:40:41','189.104.56.251'),(157,'2012-04-26 22:52:41','192.168.0.118'),(158,'2012-04-26 23:06:16','192.168.0.118'),(159,'2012-04-26 23:07:09','192.168.0.118'),(160,'2012-04-27 05:53:55','139.82.24.138'),(161,'2012-04-27 19:40:52','67.207.133.146'),(162,'2012-04-27 19:41:29','67.207.133.146'),(163,'2012-04-27 19:41:58','67.207.133.146'),(164,'2012-04-27 23:59:33','139.82.24.138'),(165,'2012-04-28 09:50:51','189.27.26.49'),(166,'2012-04-28 18:36:09','177.49.55.113'),(167,'2012-04-28 19:09:24','139.82.24.138'),(168,'2012-04-28 19:09:25','139.82.24.138'),(169,'2012-04-28 19:57:35','189.120.172.177'),(170,'2012-04-29 21:05:48','192.168.0.118'),(171,'2012-04-30 14:05:18','177.98.107.221'),(172,'2012-04-30 19:58:26','189.122.207.76'),(173,'2012-04-30 22:24:08','187.118.148.216'),(174,'2012-05-01 09:49:52','177.27.156.85'),(175,'2012-05-01 09:58:21','177.27.156.85'),(176,'2012-05-01 13:55:20','189.60.231.21'),(177,'2012-05-01 14:03:17','189.60.231.21'),(178,'2012-05-01 17:14:44','201.87.20.248'),(179,'2012-05-01 17:16:02','201.87.20.248'),(180,'2012-05-01 21:53:14','192.168.0.118'),(181,'2012-05-01 22:58:45','192.168.0.118'),(182,'2012-05-02 00:43:51','192.168.0.118'),(183,'2012-05-02 01:21:35','186.214.254.66'),(184,'2012-05-02 09:53:49','200.142.128.16'),(185,'2012-05-02 09:53:55','200.142.128.16'),(186,'2012-05-02 19:16:50','200.142.128.16'),(187,'2012-05-04 01:23:51','189.24.252.132'),(188,'2012-05-04 09:03:08','85.139.250.107'),(189,'2012-05-04 10:28:17','85.139.250.107'),(190,'2012-05-05 14:09:36','129.93.229.138'),(191,'2012-05-05 14:09:38','129.93.229.138'),(192,'2012-05-05 17:06:07','192.168.0.118'),(193,'2012-05-05 18:16:50','192.168.0.118'),(194,'2012-05-05 19:22:11','50.57.50.9'),(195,'2012-05-05 19:22:27','50.57.50.9'),(196,'2012-05-05 19:22:35','50.57.50.9'),(197,'2012-05-06 23:20:35','189.122.222.83'),(198,'2012-05-07 10:31:16','200.142.128.16'),(199,'2012-05-07 15:53:41','200.255.122.251'),(200,'2012-05-07 16:51:33','200.142.128.16'),(201,'2012-05-07 17:56:36','201.76.185.24'),(202,'2012-05-07 18:28:35','200.142.128.16'),(203,'2012-05-07 22:51:01','192.168.0.118'),(204,'2012-05-07 23:58:18','192.168.0.118'),(205,'2012-05-08 20:01:54','177.30.69.5'),(206,'2012-05-08 23:37:34','186.194.90.210'),(207,'2012-05-08 23:42:48','186.194.90.210'),(208,'2012-05-08 23:44:24','186.194.90.210'),(209,'2012-05-08 23:44:26','186.194.90.210'),(210,'2012-05-08 23:45:08','186.194.90.210'),(211,'2012-05-10 00:57:23','192.168.0.118'),(212,'2012-05-10 09:35:17','200.142.128.16'),(213,'2012-05-10 09:35:31','200.142.128.16'),(214,'2012-05-10 15:25:49','164.85.6.3'),(215,'2012-05-10 22:43:49','192.168.0.118');
/*!40000 ALTER TABLE `contador_acesso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marcador`
--

DROP TABLE IF EXISTS `marcador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `marcador` (
  `COD_MARCADOR` int(11) NOT NULL AUTO_INCREMENT,
  `LATITUDE` varchar(45) DEFAULT NULL,
  `LONGITUDE` varchar(45) DEFAULT NULL,
  `DESCRICAO` varchar(100) DEFAULT NULL,
  `FLG_ATIVO` varchar(1) DEFAULT '1',
  `COD_TIPO_MARCADOR` int(11) NOT NULL,
  PRIMARY KEY (`COD_MARCADOR`),
  UNIQUE KEY `LATITUDE` (`LATITUDE`,`LONGITUDE`),
  UNIQUE KEY `LATITUDE_2` (`LATITUDE`,`LONGITUDE`),
  UNIQUE KEY `LATITUDE_3` (`LATITUDE`,`LONGITUDE`),
  UNIQUE KEY `LATITUDE_4` (`LATITUDE`,`LONGITUDE`),
  KEY `fk_MARCADOR_TIPO_MARCADOR` (`COD_TIPO_MARCADOR`),
  CONSTRAINT `fk_MARCADOR_TIPO_MARCADOR` FOREIGN KEY (`COD_TIPO_MARCADOR`) REFERENCES `tipo_marcador` (`COD_TIPO_MARCADOR`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marcador`
--

LOCK TABLES `marcador` WRITE;
/*!40000 ALTER TABLE `marcador` DISABLE KEYS */;
INSERT INTO `marcador` VALUES (24,'-22.96156','-43.169918','Cms Chapeu Mangueira Babilonia - Ap 21',NULL,6),(25,'-22.967111','-43.187489','Cms Joao Barros Barreto - Ap 21',NULL,6),(26,'-22.967484','-43.184447','12º DP - Copacabana',NULL,3),(27,'-22.964186','-43.1696','Estádio de Copacabana',NULL,5),(28,'-22.9651','-43.1762','Escola Municipal Roma',NULL,4),(29,'-22.9686','-43.1812','Escola Municipal Doutor Cícero Penna',NULL,4),(30,'-22.9612','-43.1782','Escola Municipal Porto Rico',NULL,4),(33,'-22.9647','-43.181','Escola Municipal Alencastro Guimarães',NULL,4),(35,'-22.9651','-43.1805','Escola Municipal Dom Aquino Corrêa',NULL,4),(36,'-22.9748','-43.1891','Escola Municipal Doutor Cocio Barcellos',NULL,4),(39,'-22.9343','-43.2391','Escola Municipal Almirante Barroso',NULL,4),(40,'-22.934281','-43.24287','Coordenadoria de Area de Planejamento Cap 2.2',NULL,6),(41,'-22.981728','-43.218389','DEAT - Delegacia de Atendimento ao Turista',NULL,3),(42,'-22.9792','-43.2221','Escola Municipal George Pfisterer',NULL,4),(43,'-22.930581','-43.244687','19º DP - Tijuca',NULL,3),(44,'-22.903577','-43.210515','Porto Olímpico - Acomodações e Operações',NULL,5),(45,'-22.8809','-43.4845','Escola Municipal Engenheiro Pires do Rio',NULL,4),(47,'-22.8834','-43.4782','Escola Municipal Presidente Médici',NULL,4),(48,'-22.935452','-43.247343','Cms Casa Branca - Ap 22',NULL,6),(52,'-22.9615','-43.165','Escola Municipal São Tomás de Aquino',NULL,4),(53,'-22.977042','-43.216246','Lagoa Rodrigo de Freitas',NULL,5),(54,'-22.974327','-43.217766','Corpo de Bombeiros Lagoa',NULL,2),(55,'-22.92839','-43.239578','Corpo de Bombeiros Tijuca',NULL,2),(56,'-22.954','-43.1822','Escola Municipal Francisco Alves',NULL,4),(57,'-22.913163','-43.214404','18º DP - Praca da Bandeira',NULL,3),(58,'-22.883319','-43.466611','Av. Cônego de Vasconcelos esq. Rua Prof. Clemente Ferreira - Bangu',NULL,1),(59,'-22.9295','-43.2281','Escola Municipal Bombeiro Geraldo Dias',NULL,4),(60,'-22.912181','-43.241959','Hospital Municipal Jesus',NULL,6),(61,'-22.903152','-43.294641','Praça Amambaí  13 Engenho de Dentro',NULL,1),(62,'-22.89282','-43.291925','Estádio Olímpico João Havelange',NULL,5),(63,'-22.877866','-43.363326','Praça Valqueire - Vila Valqueire',NULL,1),(64,'-22.882943','-43.367356','Praça Saiqui - Vila Valqueire',NULL,1),(65,'-22.94178','-43.242754','Cms Professor Julio Barbosa - Ap 22',NULL,6),(66,'-22.968746','-43.180089','Caf?04 Del Mar',NULL,1),(67,'-22.878116','-43.269997','Cf Barbara Starfield - Ap 32',NULL,6),(68,'-22.962631','-43.167877','La Fiorentina',NULL,1),(69,'-22.970406','-43.182578','Manoel & Juaquim',NULL,1),(70,'-22.968311','-43.1882','Galeria Artur Fidalgo',NULL,1),(71,'-22.967442','-43.178973','P?a7rgula',NULL,1),(72,'-22.965466','-43.179295','Mirasol Copacabana',NULL,1),(73,'-22.96681','-43.177214','Copacabana Palace',NULL,1),(74,'-22.966286','-43.187524','Fosfobox Bar Club',NULL,1),(75,'-22.965585','-43.177943','Royal Rio Palace',NULL,1),(76,'-22.885071','-43.265533','Bar da Amendoeira',NULL,1);
/*!40000 ALTER TABLE `marcador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `palavra_proibida`
--

DROP TABLE IF EXISTS `palavra_proibida`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `palavra_proibida` (
  `CODIGO` int(11) NOT NULL AUTO_INCREMENT,
  `DESCRICAO` varchar(45) DEFAULT NULL,
  `FLG_ATIVO` varchar(1) DEFAULT '1',
  PRIMARY KEY (`CODIGO`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `palavra_proibida`
--

LOCK TABLES `palavra_proibida` WRITE;
/*!40000 ALTER TABLE `palavra_proibida` DISABLE KEYS */;
INSERT INTO `palavra_proibida` VALUES (1,'Porra','1'),(2,'Caralho','1'),(3,'Merda','1'),(4,'CARALHO','1'),(5,'PICA','1'),(6,'BUCETA','1'),(7,'CACETE','1'),(8,'XERECA','1'),(9,'PUTA','1'),(10,'PROSTITUTA','1'),(11,'DESGRACA','1'),(12,'porr@','1'),(13,'cu','1'),(14,'bosta','1'),(15,'vagabunda','1'),(16,'vagabunda','1'),(17,'vagabunda','1');
/*!40000 ALTER TABLE `palavra_proibida` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_marcador`
--

DROP TABLE IF EXISTS `tipo_marcador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipo_marcador` (
  `COD_TIPO_MARCADOR` int(11) NOT NULL AUTO_INCREMENT,
  `DESCRICAO` varchar(45) NOT NULL,
  `URL_ICONE` varchar(100) DEFAULT NULL,
  `URL_SERVICO` varchar(45) DEFAULT NULL,
  `FLG_ATIVO` varchar(1) DEFAULT '1',
  PRIMARY KEY (`COD_TIPO_MARCADOR`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_marcador`
--

LOCK TABLES `tipo_marcador` WRITE;
/*!40000 ALTER TABLE `tipo_marcador` DISABLE KEYS */;
INSERT INTO `tipo_marcador` VALUES (1,'Banheiro Cemusa','','/rest/infraestruturas/banheiros-cemusa','1'),(2,'Corpo de Bombeiros',NULL,NULL,NULL),(3,'Delegacia de Polícia',NULL,NULL,NULL),(4,'Escola',NULL,NULL,NULL),(5,'Jogos Olímpicos','','/rest/infraestruturas/jogos-olimpicos','1'),(6,'Unidade de Saúde',NULL,NULL,NULL),(13,'Onde comer',NULL,NULL,'1'),(14,'Onde dormir',NULL,NULL,'1'),(15,'O que fazer',NULL,NULL,'1'),(16,'Praias',NULL,NULL,'1');
/*!40000 ALTER TABLE `tipo_marcador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `COD_USUARIO` int(11) NOT NULL AUTO_INCREMENT,
  `NOME` varchar(100) NOT NULL,
  `SENHA` varchar(45) NOT NULL,
  `EMAIL` varchar(50) NOT NULL,
  `ENDERECO` varchar(150) NOT NULL,
  `RG` varchar(20) DEFAULT NULL,
  `FLG_ATIVO` varchar(1) DEFAULT '1',
  `DATA_CRIACAO` datetime DEFAULT NULL,
  `DATA_NASCIMENTO` datetime DEFAULT NULL,
  PRIMARY KEY (`COD_USUARIO`),
  UNIQUE KEY `EMAIL_UNIQUE` (`EMAIL`)
) ENGINE=InnoDB AUTO_INCREMENT=98 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (19,'magno correia','221403jse','maguinhomatrix@gmail.com','Copacabana',NULL,NULL,'2012-03-14 02:31:32',NULL),(21,'Carlos Santana','socios','brunoreisportela@gmail.com','Copacabana',NULL,NULL,'2012-03-15 15:25:51',NULL),(22,'Anderson Jorge Santos Costa','derson','anddersen@gmail.com','Copacabana',NULL,NULL,'2012-03-15 23:00:16',NULL),(23,'bruno santana','brunoleo','bleonardo.santana@gmail.com','Copacabana',NULL,NULL,'2012-03-16 11:45:47',NULL),(24,'Luis Alexandre Silva Santos','@%marezia%','luisalexandre19@gmail.com','Copacabana',NULL,NULL,'2012-03-17 11:42:56',NULL),(26,'Igor Noudant','162111','noudant@gmail.com','Copacabana',NULL,NULL,'2012-03-19 15:53:04',NULL),(27,'Rodrigo Falcão','vicedagama','Rmfalcao@ig.com.br','Copacabana',NULL,NULL,'2012-03-19 15:54:30',NULL),(28,'teste teste','880367','santanamagalhaes@hotmail.com','Copacabana',NULL,NULL,'2012-03-21 10:56:37',NULL),(29,'Marcelo Vivas','123456','Celovivas@gmail.com','Copacabana',NULL,NULL,'2012-03-24 17:25:37',NULL),(30,'nelson ','leithold','bilthon@gmail.com','Copacabana',NULL,NULL,'2012-03-27 21:28:19',NULL),(31,'Denis Santos','4513918','denis_oliverboy@hotmail.com','Copacabana',NULL,NULL,'2012-03-28 01:02:16',NULL),(32,'Marcelo Sobral','junior','msobralb@gmail.com','Copacabana',NULL,NULL,'2012-03-28 02:36:18',NULL),(33,'Luis alfonso Meza ortiz','numatere','Numatere@gmail.com','Copacabana',NULL,NULL,'2012-03-28 02:41:21',NULL),(34,'pedro ribeiro filho','prfilho@','pedrofilhoribeiro@hotmail.com','Copacabana',NULL,NULL,'2012-03-28 06:15:26',NULL),(35,'pablo mendes','diplomata','pablosmendes@gmail.com','Copacabana',NULL,NULL,'2012-03-28 07:43:21',NULL),(36,'Mauricio Menezes','tuca2008','mancontatos@gmail.com','Copacabana',NULL,NULL,'2012-03-28 07:56:20',NULL),(37,'Luciano Munhóz','munhoz10','luciano.munhoz@gmail.com','Copacabana',NULL,NULL,'2012-03-28 08:00:28',NULL),(38,'gabriel pires','1234','gabpires@gmail.com','Copacabana',NULL,NULL,'2012-03-28 05:23:16',NULL),(39,'douglas correa','3sgtpm5619','d.hcorrea@hotmail.com','Copacabana',NULL,NULL,'2012-03-28 08:57:00',NULL),(40,'pedro ribeiro filho','vascaino00','pedrovascaino007@gmail.com','Copacabana',NULL,NULL,'2012-03-28 09:29:54',NULL),(41,'Tulio Ribeiro','tulio','Triberr@hotmail.com','Copacabana',NULL,NULL,'2012-03-28 09:37:45',NULL),(42,'Rblds Sossa','17741774','r.souzz@hotmail.com','Copacabana',NULL,NULL,'2012-03-28 11:08:57',NULL),(43,'Sales Silva','3615','salessilva@gmail.com','Copacabana',NULL,NULL,'2012-03-28 12:27:22',NULL),(44,'luiz eugenio','70091016','luiz.dossantos@terra.com.br','Copacabana',NULL,NULL,'2012-03-28 09:48:04',NULL),(45,'Janaina Pompeu','543aldqua','janaina.pompeu@gmail.com','Copacabana',NULL,NULL,'2012-03-28 13:07:33',NULL),(46,'Henriette  Ribeiro ','beleza','henrietteasr@hotmail.com','Copacabana',NULL,NULL,'2012-03-28 12:16:59',NULL),(47,'Lucas França','150252','lucaspefisiorj@hotmail.com','Copacabana',NULL,NULL,'2012-03-28 17:09:49',NULL),(48,'Koiti Kamura','ed5478','koitikamura@gmail.com','Copacabana',NULL,NULL,'2012-03-28 17:36:34',NULL),(49,'Ivens Mendes','18125331','ivensmarcos@gmail.com','Copacabana',NULL,NULL,'2012-03-28 18:56:32',NULL),(50,'Marcelo Ferreira','benjamim','marcelof214@gmail.com','Copacabana',NULL,NULL,'2012-03-28 19:02:04',NULL),(51,'Wilquerson Rocha','zv540m','wilquerson@gmail.com','Copacabana',NULL,NULL,'2012-03-28 19:03:02',NULL),(52,'Mikhael Rodrigues','9968471313','mikhaelpnr@gmail.com','Copacabana',NULL,NULL,'2012-03-28 19:50:42',NULL),(53,'sandra  vidal','301288','sandrapvidal@ig·com·br','Copacabana',NULL,NULL,'2012-03-28 20:02:24',NULL),(54,'Grace Neves','joara1957','grace_neves27@hotmail.com','Copacabana',NULL,NULL,'2012-03-28 20:34:25',NULL),(55,'renato  quaresma ','lirinha19','butturini@hotmail.com','Copacabana',NULL,NULL,'2012-03-28 20:53:48',NULL),(56,'Alcides Pires','@lc1d3s','alcidesnpires@gmail.com','Copacabana',NULL,NULL,'2012-03-29 21:57:24',NULL),(57,'leandro lagden','davilagden','leandrolagden@gmail.com','Copacabana',NULL,NULL,'2012-03-29 22:29:16',NULL),(58,'Helvio Pariz','agata2507','hpariz22@gmail.com','Copacabana',NULL,NULL,'2012-03-29 22:32:44',NULL),(59,'Renato G. dos Santos','c1d@d@um','rbaomnqf@gmail.com','Copacabana',NULL,NULL,'2012-03-29 22:40:55',NULL),(60,'Wellington Machado','Mossad007','wellington-mc@hotmail.com','Copacabana',NULL,NULL,'2012-03-30 04:34:34',NULL),(61,'Bernardo Rosmaninho','020518ber','bernardo.rosmaninho@gmail.com','Copacabana',NULL,NULL,'2012-03-30 07:10:06',NULL),(62,'Edson Bastos','dfkl','Pontes.vinicius@hotmail.com','Copacabana',NULL,NULL,'2012-03-30 11:31:02',NULL),(63,'Dominique Montenegro','123123','Domniquemontenegro@gmail.com','Copacabana',NULL,NULL,'2012-03-30 11:57:36',NULL),(64,'Fernando Pinhel','321fpinhel','fernandopinhelll@gmail.com','Copacabana',NULL,NULL,'2012-03-30 12:45:32',NULL),(65,'Edgard Da silva rocha','061281','Rocha0612@hotmail.com','Copacabana',NULL,NULL,'2012-03-30 13:37:11',NULL),(66,'ricardo fontes','riky6460','rikyvazquez@yahoo.com.br','Copacabana',NULL,NULL,'2012-03-30 14:20:08',NULL),(67,'valdir  lopes','samuel2211','valdir.fge@gmail.com','Copacabana',NULL,NULL,'2012-03-30 15:17:14',NULL),(68,'telma bezerra araujo','04038853','gnosticismo@fmusp.com','Copacabana',NULL,NULL,'2012-03-30 17:55:51',NULL),(69,'daisy barbosa','rd160976','rdbarbosa@globo.com','Copacabana',NULL,NULL,'2012-03-30 15:18:36',NULL),(70,'Alessandra Barcellos','amorosa140','alessandra.barcellos@hotmail.com','Copacabana',NULL,NULL,'2012-03-31 00:19:37',NULL),(71,'I. Buarque','147514741','i.buarque@yahoo.com.br','Copacabana',NULL,NULL,'2012-03-31 03:01:33',NULL),(72,'Raphael Panno','noparilhos','raphaelpanno@hotmail.com','Copacabana',NULL,NULL,'2012-03-31 16:30:51',NULL),(73,'Renato G. Silva','sapato','ibirap@bol.com.br','Copacabana',NULL,NULL,'2012-04-01 06:08:38',NULL),(74,'Edson Vandaleti','3990','eovandaleti@gmail.com','Copacabana',NULL,NULL,'2012-04-01 08:23:01',NULL),(75,'Tommy  carioca','humlan','hummelhunden@hotmail.com','Copacabana',NULL,NULL,'2012-04-02 07:24:00',NULL),(76,'alexandre vaconcelos','duda2006','amagnoal@gmail.com','Copacabana',NULL,NULL,'2012-04-02 23:44:32',NULL),(77,'Rundsthen Nader','rubeka','rvnader@gmail.com','Copacabana',NULL,NULL,'2012-04-03 15:43:30',NULL),(78,'George Coelho','gelico16','glcoelho@gmail.com','Copacabana',NULL,NULL,'2012-04-03 19:02:20',NULL),(80,'Lars Hofvander','bullet1','lars@floripaweb.net','Copacabana',NULL,NULL,'2012-04-03 23:26:12',NULL),(81,'Segismundo Valadares','1965resa','smvaladares@yahoo.com.br','Copacabana',NULL,NULL,'2012-04-04 06:50:38',NULL),(82,'Flavio Fonseca','ca4et7df','fbfonseca@gmail.com','Copacabana',NULL,NULL,'2012-04-04 08:43:55',NULL),(83,'Marcus Vinicius  Santana de Oliveira ','progoz@3','oliveira.mvs@gmail.com','Copacabana',NULL,NULL,'2012-04-05 10:39:57',NULL),(84,'Luciano  Duarte ','123456','lduarte@gmail.com','Copacabana',NULL,NULL,'2012-04-06 21:01:16',NULL),(85,'delamar amorim','dedorevi','gtcons@osite.com.br','Copacabana',NULL,NULL,'2012-04-07 10:13:36',NULL),(86,'sérgio  faria filho','itambe2008','ssfaria@hotmail.com','Copacabana',NULL,NULL,'2012-04-07 22:05:50',NULL),(87,'dive dives','123456','dive3452@gmail.com','Copacabana',NULL,NULL,'2012-04-11 17:03:25',NULL),(88,'fabiano scardua','sca15a','fabiano.scardua@gmail.com','Copacabana',NULL,NULL,'2012-04-13 16:32:03',NULL),(89,'Raphael ','191006','raphans9@gmail.com','Copacabana',NULL,NULL,'2012-04-13 16:40:25',NULL),(90,'Luiz Paulo Gomes R.','roubogalax','l_paulo_g@hotmail.com','Copacabana',NULL,NULL,'2012-04-14 12:09:21',NULL),(91,'Flávia  Oliveira','iaga1002','flavinha_oliveira@msn.com','Copacabana',NULL,NULL,'2012-04-16 16:35:47',NULL),(92,'Marcos Silva','democracia','marbahiano@gmail.com','Copacabana',NULL,NULL,'2012-05-01 13:50:42',NULL),(93,'André  Damasceno','013271oab','anddamasceno@hotmail.com','Copacabana',NULL,NULL,'2012-05-02 15:41:01',NULL),(95,'dive d','123123','dive3452@yahoo.com','Copacabana',NULL,NULL,'2012-05-03 18:00:14',NULL),(96,'Julia  Lepreri','101618','julialepreri@hotmail.com','Copacabana',NULL,NULL,'2012-05-05 21:48:13',NULL),(97,'MARCOS ALEXANDRE  BRANDÃO DE MOURA','juanalef','alichamdre@yahoo.com.br','Copacabana',NULL,NULL,'2012-05-07 22:08:17',NULL);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;