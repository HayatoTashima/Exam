CREATE TABLE `CLASS_NUM` (
	`SCHOOL_CD` CHAR(3) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci,
	`CLASS_NUM` VARCHAR(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci,
	PRIMARY KEY (`SCHOOL_CD`,`CLASS_NUM`)
) ENGINE=InnoDB;