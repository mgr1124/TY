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

 Date: 19/04/2023 22:13:58
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tbl_address
-- ----------------------------
DROP TABLE IF EXISTS `tbl_address`;
CREATE TABLE `tbl_address`  (
  `addr_id` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `user_id` int NOT NULL,
  `addr_linkman` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `addr_telephone` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `addr_des` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `addr_tag` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`addr_id`) USING BTREE,
  INDEX `user_id`(`user_id` ASC) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tbl_address
-- ----------------------------
INSERT INTO `tbl_address` VALUES ('092418674472974666418385008277', 1, '小白', '13999999999', '上海', '公司');
INSERT INTO `tbl_address` VALUES ('1', 1, '刘亦菲', '15234597395', '北京', '1');
INSERT INTO `tbl_address` VALUES ('159606818438232962662037506308', 1, '小白', '13999999999', '上海', '公司');
INSERT INTO `tbl_address` VALUES ('2', 1, '蔡徐坤', '13945758365', '大连', '2');
INSERT INTO `tbl_address` VALUES ('576326639954192222747636993551', 1, '小黑', '13888888888', '山东', '家');
INSERT INTO `tbl_address` VALUES ('651437954433553229342284870437', 1, '刘亦菲', '15234597395', '北京', '1');
INSERT INTO `tbl_address` VALUES ('742769078510244932721181937097', 1, '小黑', '13888888888', '山东', '家');
INSERT INTO `tbl_address` VALUES ('782610468792758099914180442254', 1, '刘亦菲', '15234597395', '北京', '1');
INSERT INTO `tbl_address` VALUES ('784227335980363688598706403502', 1, '蔡徐坤', '13945758365', '大连', '2');
INSERT INTO `tbl_address` VALUES ('800114953224732121493177931105', 1, '小黑', '13888888888', '山东', '家');
INSERT INTO `tbl_address` VALUES ('829698623895745636818210189440', 1, '蔡徐坤', '13945758365', '大连', '2');
INSERT INTO `tbl_address` VALUES ('847328691946456689655174228574', 1, '小白', '13999999999', '上海', '公司');
INSERT INTO `tbl_address` VALUES ('e45GTYndi41hH4IylgD9A4FLW5fcHU', 1, '刘亦菲', '15234597395', '北京', '1');
INSERT INTO `tbl_address` VALUES ('sPREIdU0a8GHf6w2NFsKnYbqUF8QUh', 1, '蔡徐坤', '13945758365', '大连', '2');
INSERT INTO `tbl_address` VALUES ('UVDmCecimTF4ZEkPNDKGIRTLYVz5SN', 1, '刘亦菲', '15234597395', '北京', '1');

SET FOREIGN_KEY_CHECKS = 1;
