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

 Date: 11/04/2023 23:49:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tbl_order
-- ----------------------------
DROP TABLE IF EXISTS `tbl_order`;
CREATE TABLE `tbl_order`  (
  `order_id` int NOT NULL AUTO_INCREMENT,
  `order_sender` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `order_consignee` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `order_type` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `order_weight` double(10, 2) NULL DEFAULT NULL,
  `order_cost` decimal(10, 2) NULL DEFAULT NULL,
  `order_state` tinyint(1) NULL DEFAULT NULL COMMENT '订单状态，是否支付',
  PRIMARY KEY (`order_id`) USING BTREE,
  INDEX `order_order_sender`(`order_sender` ASC) USING BTREE,
  INDEX `order_order_consignee`(`order_consignee` ASC) USING BTREE,
  CONSTRAINT `order_order_consignee` FOREIGN KEY (`order_consignee`) REFERENCES `tbl_address` (`addr_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `order_order_sender` FOREIGN KEY (`order_sender`) REFERENCES `tbl_address` (`addr_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tbl_order
-- ----------------------------
INSERT INTO `tbl_order` VALUES (1, '1', '2', '1', 1.00, 80.00, NULL);

SET FOREIGN_KEY_CHECKS = 1;
