/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80031 (8.0.31)
 Source Host           : localhost:3306
 Source Schema         : dash

 Target Server Type    : MySQL
 Target Server Version : 80031 (8.0.31)
 File Encoding         : 65001

 Date: 11/04/2023 23:49:15
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tbl_payment
-- ----------------------------
DROP TABLE IF EXISTS `tbl_payment`;
CREATE TABLE `tbl_payment`  (
  `pay_id` int NOT NULL AUTO_INCREMENT,
  `pay_type` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `pay_time` datetime NULL DEFAULT NULL,
  `pay_cost` decimal(10, 2) NULL DEFAULT NULL,
  `order_id` int NULL DEFAULT NULL,
  PRIMARY KEY (`pay_id`) USING BTREE,
  INDEX `payment_order_id`(`order_id` ASC) USING BTREE,
  CONSTRAINT `payment_order_id` FOREIGN KEY (`order_id`) REFERENCES `tbl_order` (`order_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tbl_payment
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
