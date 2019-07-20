CREATE SCHEMA `InfiniteBit` DEFAULT CHARACTER SET utf8 ;
CREATE TABLE `InfiniteBit`.`twitter_user` (
  `user_id` INT NOT NULL AUTO_INCREMENT,
  `twitter_user_id` BIGINT(19) NULL,
  `screen_name` VARCHAR(50) NULL,
  `access_token` VARCHAR(100) NULL,
  `access_token_secret` VARCHAR(100) NULL,
  `created_date` DATETIME NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE INDEX `twitter_user_id_UNIQUE` (`twitter_user_id` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = 'Tabla que almacena la información de conexion de los usuarios de Twitter';
