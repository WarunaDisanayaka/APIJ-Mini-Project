-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema techmis
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema techmis
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `techmis` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `techmis` ;

-- -----------------------------------------------------
-- Table `techmis`.`course`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `techmis`.`course` (
  `CourseID` INT NOT NULL,
  `CourseName` VARCHAR(45) NOT NULL,
  `CourseCredit` INT NOT NULL,
  PRIMARY KEY (`CourseID`))
ENGINE = MyISAM
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `techmis`.`attendance`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `techmis`.`attendance` (
  `AtdID` INT NOT NULL,
  `Date` DATE NOT NULL,
  `State` VARCHAR(10) NOT NULL,
  `course_CourseID` INT NOT NULL,
  PRIMARY KEY (`AtdID`, `course_CourseID`),
  INDEX `fk_attendance_course1_idx` (`course_CourseID` ASC) VISIBLE)
ENGINE = MyISAM
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `techmis`.`department`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `techmis`.`department` (
  `DepID` INT NOT NULL,
  `DepName` VARCHAR(25) NOT NULL,
  `DepContactNo` INT NULL DEFAULT NULL,
  `DepEmail` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`DepID`))
ENGINE = MyISAM
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `techmis`.`medical`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `techmis`.`medical` (
  `MedicalID` INT NOT NULL,
  `StartDate` DATE NOT NULL,
  `EndDate` DATE NOT NULL,
  `Description` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`MedicalID`))
ENGINE = MyISAM
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `techmis`.`notice`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `techmis`.`notice` (
  `NoticeID` INT NOT NULL,
  `Title` VARCHAR(30) NULL DEFAULT NULL,
  `Description` VARCHAR(200) NULL DEFAULT NULL,
  `CreateDate` DATE NULL DEFAULT NULL,
  PRIMARY KEY (`NoticeID`))
ENGINE = MyISAM
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `techmis`.`role`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `techmis`.`role` (
  `RoleID` INT NOT NULL,
  `RoleType` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`RoleID`))
ENGINE = MyISAM
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `techmis`.`level`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `techmis`.`level` (
  `LevelID` INT NOT NULL,
  `LevelType` VARCHAR(10) NULL,
  PRIMARY KEY (`LevelID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `techmis`.`timetable`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `techmis`.`timetable` (
  `TimetableID` INT NOT NULL,
  `File` BLOB NOT NULL,
  `UploadDate` DATE NULL DEFAULT NULL,
  `department_DepID` INT NOT NULL,
  `level_LevelID` INT NOT NULL,
  PRIMARY KEY (`TimetableID`, `department_DepID`, `level_LevelID`),
  INDEX `fk_timetable_department1_idx` (`department_DepID` ASC) VISIBLE,
  INDEX `fk_timetable_level1_idx` (`level_LevelID` ASC) VISIBLE)
ENGINE = MyISAM
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `techmis`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `techmis`.`user` (
  `UserID` VARCHAR(10) NOT NULL,
  `Fname` VARCHAR(20) NOT NULL,
  `Lname` VARCHAR(20) NOT NULL,
  `ProPic` BLOB NULL DEFAULT NULL,
  `HouseNo` INT NULL DEFAULT NULL,
  `Street` VARCHAR(20) NULL DEFAULT NULL,
  `City` VARCHAR(20) NULL DEFAULT NULL,
  `Email` VARCHAR(50) NOT NULL,
  `Gender` VARCHAR(10) NOT NULL,
  `DOB` DATE NOT NULL,
  `Password` VARCHAR(30) NOT NULL,
  `ContactNo` INT NOT NULL,
  `role_RoleID` INT NOT NULL,
  `department_DepID` INT NOT NULL,
  `level_LevelID` INT NOT NULL,
  PRIMARY KEY (`UserID`, `role_RoleID`, `department_DepID`, `level_LevelID`),
  INDEX `fk_user_role1_idx` (`role_RoleID` ASC) VISIBLE,
  INDEX `fk_user_department1_idx` (`department_DepID` ASC) VISIBLE,
  INDEX `fk_user_level1_idx` (`level_LevelID` ASC) VISIBLE)
ENGINE = MyISAM
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `techmis`.`course_has_user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `techmis`.`course_has_user` (
  `course_CourseID` INT NOT NULL,
  `user_UserID` VARCHAR(10) NOT NULL,
  `user_role_RoleID` INT NOT NULL,
  `user_department_DepID` INT NOT NULL,
  PRIMARY KEY (`course_CourseID`, `user_UserID`, `user_role_RoleID`, `user_department_DepID`),
  INDEX `fk_course_has_user_user1_idx` (`user_UserID` ASC, `user_role_RoleID` ASC, `user_department_DepID` ASC) VISIBLE,
  INDEX `fk_course_has_user_course1_idx` (`course_CourseID` ASC) VISIBLE)
ENGINE = MyISAM
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `techmis`.`user_has_notice`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `techmis`.`user_has_notice` (
  `user_UserID` VARCHAR(10) NOT NULL,
  `user_role_RoleID` INT NOT NULL,
  `user_department_DepID` INT NOT NULL,
  `user_level_LevelID` INT NOT NULL,
  `notice_NoticeID` INT NOT NULL,
  PRIMARY KEY (`user_UserID`, `user_role_RoleID`, `user_department_DepID`, `user_level_LevelID`, `notice_NoticeID`),
  INDEX `fk_user_has_notice_notice1_idx` (`notice_NoticeID` ASC) VISIBLE,
  INDEX `fk_user_has_notice_user1_idx` (`user_UserID` ASC, `user_role_RoleID` ASC, `user_department_DepID` ASC, `user_level_LevelID` ASC) VISIBLE)
ENGINE = MyISAM
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `techmis`.`user_has_attendance`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `techmis`.`user_has_attendance` (
  `user_UserID` VARCHAR(10) NOT NULL,
  `user_role_RoleID` INT NOT NULL,
  `user_department_DepID` INT NOT NULL,
  `user_level_LevelID` INT NOT NULL,
  `attendance_AtdID` INT NOT NULL,
  `medical_MedicalID` INT NOT NULL,
  PRIMARY KEY (`user_UserID`, `user_role_RoleID`, `user_department_DepID`, `user_level_LevelID`, `attendance_AtdID`, `medical_MedicalID`),
  INDEX `fk_user_has_attendance_attendance1_idx` (`attendance_AtdID` ASC) VISIBLE,
  INDEX `fk_user_has_attendance_user1_idx` (`user_UserID` ASC, `user_role_RoleID` ASC, `user_department_DepID` ASC, `user_level_LevelID` ASC) VISIBLE,
  INDEX `fk_user_has_attendance_medical1_idx` (`medical_MedicalID` ASC) VISIBLE)
ENGINE = MyISAM
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `techmis`.`CA mark`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `techmis`.`CA mark` (
  `CAid` INT NOT NULL,
  `Quiz1` DOUBLE NULL,
  `Quiz2` DOUBLE NULL,
  `Quiz3` DOUBLE NULL,
  `MidTerm` DOUBLE NULL,
  `Assignment1` DOUBLE NULL,
  `Assignment2` DOUBLE NULL,
  `user_UserID` VARCHAR(10) NOT NULL,
  `user_role_RoleID` INT NOT NULL,
  `user_department_DepID` INT NOT NULL,
  `user_level_LevelID` INT NOT NULL,
  `course_CourseID` INT NOT NULL,
  PRIMARY KEY (`CAid`, `user_UserID`, `user_role_RoleID`, `user_department_DepID`, `user_level_LevelID`, `course_CourseID`),
  INDEX `fk_CA marks_user1_idx` (`user_UserID` ASC, `user_role_RoleID` ASC, `user_department_DepID` ASC, `user_level_LevelID` ASC) VISIBLE,
  INDEX `fk_CA marks_course1_idx` (`course_CourseID` ASC) VISIBLE,
  CONSTRAINT `fk_CA marks_user1`
    FOREIGN KEY (`user_UserID` , `user_role_RoleID` , `user_department_DepID` , `user_level_LevelID`)
    REFERENCES `techmis`.`user` (`UserID` , `role_RoleID` , `department_DepID` , `level_LevelID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_CA marks_course1`
    FOREIGN KEY (`course_CourseID`)
    REFERENCES `techmis`.`course` (`CourseID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `techmis`.`end exam mark`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `techmis`.`end exam mark` (
  `MarkID` INT NOT NULL,
  `TheoryMark` DOUBLE NULL,
  `PracticalMark` DOUBLE NULL,
  `CGPA` DOUBLE NULL,
  `course_CourseID` INT NOT NULL,
  `user_UserID` VARCHAR(10) NOT NULL,
  `user_role_RoleID` INT NOT NULL,
  `user_department_DepID` INT NOT NULL,
  `user_level_LevelID` INT NOT NULL,
  PRIMARY KEY (`MarkID`, `course_CourseID`, `user_UserID`, `user_role_RoleID`, `user_department_DepID`, `user_level_LevelID`),
  INDEX `fk_final mark_course1_idx` (`course_CourseID` ASC) VISIBLE,
  INDEX `fk_final mark_user1_idx` (`user_UserID` ASC, `user_role_RoleID` ASC, `user_department_DepID` ASC, `user_level_LevelID` ASC) VISIBLE,
  CONSTRAINT `fk_final mark_course1`
    FOREIGN KEY (`course_CourseID`)
    REFERENCES `techmis`.`course` (`CourseID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_final mark_user1`
    FOREIGN KEY (`user_UserID` , `user_role_RoleID` , `user_department_DepID` , `user_level_LevelID`)
    REFERENCES `techmis`.`user` (`UserID` , `role_RoleID` , `department_DepID` , `level_LevelID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
