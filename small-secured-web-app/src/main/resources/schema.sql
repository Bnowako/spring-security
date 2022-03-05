CREATE TABLE IF NOT EXISTS `user` (
                                               `id` INT NOT NULL AUTO_INCREMENT,
                                               `username` VARCHAR(45) NOT NULL,
                                               `password` TEXT NOT NULL,
                                               `algorithm` VARCHAR(45) NOT NULL,
                                               PRIMARY KEY (`id`));

CREATE TABLE IF NOT EXISTS `authority` (
                                                    `id` INT NOT NULL AUTO_INCREMENT,
                                                    `name` VARCHAR(45) NOT NULL,
                                                    `user` INT NOT NULL,
                                                    PRIMARY KEY (`id`));

CREATE TABLE IF NOT EXISTS `product` (
                                                  `id` INT NOT NULL AUTO_INCREMENT,
                                                  `name` VARCHAR(45) NOT NULL,
                                                  `price` VARCHAR(45) NOT NULL,
                                                  `currency` VARCHAR(45) NOT NULL,
                                                  PRIMARY KEY (`id`));