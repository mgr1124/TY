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

 Date: 11/04/2023 23:50:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tbl_book
-- ----------------------------
DROP TABLE IF EXISTS `tbl_book`;
CREATE TABLE `tbl_book`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 38 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tbl_book
-- ----------------------------
INSERT INTO `tbl_book` VALUES (1, '计算机', '数据结构', '数据结构是一门计算机学科');
INSERT INTO `tbl_book` VALUES (2, '计算机', '计算机网络', '计算机网络是一门是计算机学科');
INSERT INTO `tbl_book` VALUES (3, '娱乐', '三生三世十里桃花', '是一个热门小说');
INSERT INTO `tbl_book` VALUES (5, '小说', '小李飞刀5', '武打小说');
INSERT INTO `tbl_book` VALUES (6, '小说', '小李飞刀6', '武打小说');
INSERT INTO `tbl_book` VALUES (8, '计算机', '计算机原理', '撒大苏打盛大的');
INSERT INTO `tbl_book` VALUES (13, '小说', '神雕侠侣', '经典小说神雕侠侣');
INSERT INTO `tbl_book` VALUES (14, '小说', '小李飞刀', '武打小说');
INSERT INTO `tbl_book` VALUES (16, 'impl test', 'impl test', 'impl test');
INSERT INTO `tbl_book` VALUES (17, '小说', '神雕侠侣', '经典小说神雕侠侣');
INSERT INTO `tbl_book` VALUES (18, '小说', '小李飞刀', '武打小说');
INSERT INTO `tbl_book` VALUES (19, '小说', '小李飞刀7', '武打小说');
INSERT INTO `tbl_book` VALUES (20, 'impl test', 'impl test', 'impl test');
INSERT INTO `tbl_book` VALUES (21, '小说', '小李飞刀', '武打小说');
INSERT INTO `tbl_book` VALUES (22, '小说', '小李飞刀7', '武打小说');
INSERT INTO `tbl_book` VALUES (24, 'impl test', 'impl test', 'impl test');
INSERT INTO `tbl_book` VALUES (25, '小说', '神雕侠侣', '经典小说神雕侠侣');
INSERT INTO `tbl_book` VALUES (26, '小说', '小李飞刀', '武打小说');
INSERT INTO `tbl_book` VALUES (27, '小说', '小李飞刀7', '武打小说');
INSERT INTO `tbl_book` VALUES (28, 'impl test', 'impl test', 'impl test');
INSERT INTO `tbl_book` VALUES (29, '小说', '神雕侠侣', '经典小说神雕侠侣');
INSERT INTO `tbl_book` VALUES (30, '小说', '小李飞刀', '武打小说');
INSERT INTO `tbl_book` VALUES (31, '小说', '小李飞刀7', '武打小说');
INSERT INTO `tbl_book` VALUES (32, 'impl test', 'impl test', 'impl test');
INSERT INTO `tbl_book` VALUES (33, '小说', '仙剑奇侠传', '武侠小说');
INSERT INTO `tbl_book` VALUES (36, '小说', '神雕侠侣', '经典小说神雕侠侣');
INSERT INTO `tbl_book` VALUES (37, '2', '2', '2');

SET FOREIGN_KEY_CHECKS = 1;
