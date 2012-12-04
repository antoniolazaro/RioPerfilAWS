
-- -----------------------------------------------------
-- Table `app_rio`.`usuario`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `app_rio`.`usuario` (
  `COD_USUARIO` INT(11) NOT NULL AUTO_INCREMENT ,
  `NOME` VARCHAR(100) NOT NULL ,
  `SENHA` VARCHAR(45) NOT NULL ,
  `EMAIL` VARCHAR(50) NOT NULL ,
  `ENDERECO` VARCHAR(150) NOT NULL ,
  `RG` VARCHAR(20) NULL DEFAULT NULL ,
  `FLG_ATIVO` VARCHAR(1) NULL DEFAULT '1' ,
  `DATA_CRIACAO` DATETIME NULL DEFAULT NULL ,
  `DATA_NASCIMENTO` DATETIME NULL DEFAULT NULL ,
  PRIMARY KEY (`COD_USUARIO`) );

CREATE UNIQUE INDEX `EMAIL_UNIQUE` ON `app_rio`.`usuario` (`EMAIL` ASC) ;


-- -----------------------------------------------------
-- Table `app_rio`.`auditoria_acesso`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `app_rio`.`auditoria_acesso` (
  `COD_ACESSO` INT(11) NOT NULL AUTO_INCREMENT ,
  `DAT_ACESSO` VARCHAR(45) NULL DEFAULT NULL ,
  `COD_USUARIO` INT(11) NOT NULL ,
  PRIMARY KEY (`COD_ACESSO`) ,
  CONSTRAINT `fk_AUDITORIA_ACESSO_USUARIO1`
    FOREIGN KEY (`COD_USUARIO` )
    REFERENCES `app_rio`.`usuario` (`COD_USUARIO` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE INDEX `fk_AUDITORIA_ACESSO_USUARIO1` ON `app_rio`.`auditoria_acesso` (`COD_USUARIO` ASC) ;


-- -----------------------------------------------------
-- Table `app_rio`.`tipo_marcador`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `app_rio`.`tipo_marcador` (
  `COD_TIPO_MARCADOR` INT(11) NOT NULL AUTO_INCREMENT ,
  `DESCRICAO` VARCHAR(45) NOT NULL ,
  `URL_ICONE` VARCHAR(100) NULL DEFAULT NULL ,
  `URL_SERVICO` VARCHAR(45) NULL DEFAULT NULL ,
  `FLG_ATIVO` VARCHAR(1) NULL DEFAULT '1' ,
  PRIMARY KEY (`COD_TIPO_MARCADOR`) );


-- -----------------------------------------------------
-- Table `app_rio`.`marcador`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `app_rio`.`marcador` (
  `COD_MARCADOR` INT(11) NOT NULL AUTO_INCREMENT ,
  `LATITUDE` VARCHAR(45) NULL DEFAULT NULL ,
  `LONGITUDE` VARCHAR(45) NULL DEFAULT NULL ,
  `DESCRICAO` VARCHAR(100) NULL DEFAULT NULL ,
  `FLG_ATIVO` VARCHAR(1) NULL DEFAULT '1' ,
  `COD_TIPO_MARCADOR` INT(11) NOT NULL ,
  PRIMARY KEY (`COD_MARCADOR`) ,
  CONSTRAINT `fk_MARCADOR_TIPO_MARCADOR`
    FOREIGN KEY (`COD_TIPO_MARCADOR` )
    REFERENCES `app_rio`.`tipo_marcador` (`COD_TIPO_MARCADOR` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE UNIQUE INDEX `LATITUDE` ON `app_rio`.`marcador` (`LATITUDE` ASC, `LONGITUDE` ASC) ;

CREATE UNIQUE INDEX `LATITUDE_2` ON `app_rio`.`marcador` (`LATITUDE` ASC, `LONGITUDE` ASC) ;

CREATE UNIQUE INDEX `LATITUDE_3` ON `app_rio`.`marcador` (`LATITUDE` ASC, `LONGITUDE` ASC) ;

CREATE UNIQUE INDEX `LATITUDE_4` ON `app_rio`.`marcador` (`LATITUDE` ASC, `LONGITUDE` ASC) ;

CREATE INDEX `fk_MARCADOR_TIPO_MARCADOR` ON `app_rio`.`marcador` (`COD_TIPO_MARCADOR` ASC) ;


-- -----------------------------------------------------
-- Table `app_rio`.`comentario`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `app_rio`.`comentario` (
  `COD_COMENTARIO` INT(11) NOT NULL AUTO_INCREMENT ,
  `DESCRICAO` VARCHAR(300) NOT NULL ,
  `DATA_CRIACAO` DATETIME NOT NULL ,
  `VALOR` INT(11) NOT NULL DEFAULT '5' ,
  `FLG_ATIVO` VARCHAR(1) NULL DEFAULT '1' ,
  `COD_USUARIO` INT(11) NOT NULL ,
  `COD_MARCADOR` INT(11) NOT NULL ,
  `FLG_COMENT_FACEBOOK` VARCHAR(1) NULL DEFAULT '0' ,
  `FLG_COMENT_TWITTER` VARCHAR(1) NULL DEFAULT '0' ,
  PRIMARY KEY (`COD_COMENTARIO`) ,
  CONSTRAINT `fk_COMENTARIO_MARCADOR1`
    FOREIGN KEY (`COD_MARCADOR` )
    REFERENCES `app_rio`.`marcador` (`COD_MARCADOR` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_COMENTARIO_USUARIO1`
    FOREIGN KEY (`COD_USUARIO` )
    REFERENCES `app_rio`.`usuario` (`COD_USUARIO` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE INDEX `fk_COMENTARIO_USUARIO` ON `app_rio`.`comentario` (`COD_USUARIO` ASC) ;

CREATE INDEX `fk_COMENTARIO_MARCADOR1` ON `app_rio`.`comentario` (`COD_MARCADOR` ASC) ;


-- -----------------------------------------------------
-- Table `app_rio`.`configuracao_parametros`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `app_rio`.`configuracao_parametros` (
  `CODIGO` INT(11) NOT NULL AUTO_INCREMENT ,
  `NOME` VARCHAR(100) NOT NULL ,
  `VALOR` VARCHAR(100) NOT NULL ,
  PRIMARY KEY (`CODIGO`) );


-- -----------------------------------------------------
-- Table `app_rio`.`contador_acesso`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `app_rio`.`contador_acesso` (
  `COD_CONTADOR` INT(11) NOT NULL AUTO_INCREMENT ,
  `DAT_ACESSO` DATETIME NOT NULL ,
  `DES_IP_ACESSO` VARCHAR(45) NULL DEFAULT NULL ,
  PRIMARY KEY (`COD_CONTADOR`) );


-- -----------------------------------------------------
-- Table `app_rio`.`palavra_proibida`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `app_rio`.`palavra_proibida` (
  `CODIGO` INT(11) NOT NULL AUTO_INCREMENT ,
  `DESCRICAO` VARCHAR(45) NULL DEFAULT NULL ,
  `FLG_ATIVO` VARCHAR(1) NULL DEFAULT '1' ,
  PRIMARY KEY (`CODIGO`) );

