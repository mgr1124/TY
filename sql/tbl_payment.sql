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

 Date: 19/04/2023 22:14:32
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
  `order_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`pay_id`) USING BTREE,
  INDEX `pay_order`(`order_id` ASC) USING BTREE,
  CONSTRAINT `pay_order` FOREIGN KEY (`order_id`) REFERENCES `tbl_order` (`order_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tbl_payment
-- ----------------------------
INSERT INTO `tbl_payment` VALUES (1, '到付', '2023-04-19 14:17:07', 12.00, '1');
INSERT INTO `tbl_payment` VALUES (5, '1', NULL, 10.00, 'pMjIETxsLdXNqU2MrsAiXJK3AXdhqi');
INSERT INTO `tbl_payment` VALUES (6, '1', NULL, 10.00, '458340175749431953947416058022');
INSERT INTO `tbl_payment` VALUES (7, '1', NULL, 10.00, '930906478049330290781214626609');
INSERT INTO `tbl_payment` VALUES (8, '寄付现结', NULL, 10.00, '618217576081082456840527054776');
INSERT INTO `tbl_payment` VALUES (9, '寄付现结', NULL, 10.00, '765343075389198964769781680679');

SET FOREIGN_KEY_CHECKS = 1;
