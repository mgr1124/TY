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

 Date: 11/04/2023 23:49:39
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tbl_logistics
-- ----------------------------
DROP TABLE IF EXISTS `tbl_logistics`;
CREATE TABLE `tbl_logistics`  (
  `logistics_id` int NOT NULL AUTO_INCREMENT COMMENT '物流状态表',
  `order_time` datetime NULL DEFAULT NULL,
  `delivery_time` datetime NULL DEFAULT NULL,
  `logistics_addr` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `order_id` int NULL DEFAULT NULL,
  `user_id` int NULL DEFAULT NULL,
  PRIMARY KEY (`logistics_id`) USING BTREE,
  INDEX `logistics_order_id`(`order_id` ASC) USING BTREE,
  INDEX `logistics_user_id`(`user_id` ASC) USING BTREE,
  CONSTRAINT `logistics_order_id` FOREIGN KEY (`order_id`) REFERENCES `tbl_order` (`order_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `logistics_user_id` FOREIGN KEY (`user_id`) REFERENCES `tbl_user` (`user_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tbl_logistics
-- ----------------------------
INSERT INTO `tbl_logistics` VALUES (1, '2023-04-04 13:58:45', '2023-04-05 13:58:50', '沈阳', 1, 1);

SET FOREIGN_KEY_CHECKS = 1;
