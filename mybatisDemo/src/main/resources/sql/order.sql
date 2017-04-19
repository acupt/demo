use demo;
CREATE TABLE `demo`.`order` (
  `id` BIGINT (11) NOT NULL AUTO_INCREMENT,
  `detail` VARCHAR(255) NULL,
  `buyer` VARCHAR(45) NULL,
  `created_time` DATETIME NULL,
  PRIMARY KEY (`id`));
