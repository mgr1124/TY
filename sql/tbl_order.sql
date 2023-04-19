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

 Date: 19/04/2023 22:14:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tbl_order
-- ----------------------------
DROP TABLE IF EXISTS `tbl_order`;
CREATE TABLE `tbl_order`  (
  `order_id` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `order_userid` int NULL DEFAULT NULL,
  `order_sender` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `order_consignee` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `order_type` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `order_weight` double NULL DEFAULT NULL,
  `order_volume` double NULL DEFAULT NULL,
  `order_cost` decimal(10, 2) NULL DEFAULT NULL,
  `order_state` tinyint(1) NULL DEFAULT NULL COMMENT '订单状态，是否支付',
  `order_sendtype` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '寄件方式',
  `order_pickuptime` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '上门取件时间',
  `order_couriernumber` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '邮寄单号',
  `order_commodity` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '邮寄物品',
  `order_desc` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '订单描述',
  PRIMARY KEY (`order_id`) USING BTREE,
  INDEX `order_consignee`(`order_consignee` ASC) USING BTREE,
  INDEX `order_sender`(`order_sender` ASC) USING BTREE,
  INDEX `order_userid`(`order_userid` ASC) USING BTREE,
  CONSTRAINT `order_consignee` FOREIGN KEY (`order_consignee`) REFERENCES `tbl_address` (`addr_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `order_sender` FOREIGN KEY (`order_sender`) REFERENCES `tbl_address` (`addr_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `order_userid` FOREIGN KEY (`order_userid`) REFERENCES `tbl_user` (`user_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tbl_order
-- ----------------------------
INSERT INTO `tbl_order` VALUES ('1', NULL, '1', '2', '1', 1, NULL, 80.00, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `tbl_order` VALUES ('458340175749431953947416058022', NULL, '782610468792758099914180442254', '784227335980363688598706403502', '1', 1, 0, 80.00, 0, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `tbl_order` VALUES ('618217576081082456840527054776', NULL, '847328691946456689655174228574', '800114953224732121493177931105', NULL, 11, 1, 10.00, 0, '自邮', 'Apr 17 2023 22:05:56', '123123123123', '文件', '需要箱子');
INSERT INTO `tbl_order` VALUES ('765343075389198964769781680679', NULL, '159606818438232962662037506308', '576326639954192222747636993551', NULL, 11, 1, 10.00, 0, '上门取件', 'Apr 17 2023 22:05:56', '123123123123', '文件', '需要箱子');
INSERT INTO `tbl_order` VALUES ('930906478049330290781214626609', NULL, '651437954433553229342284870437', '829698623895745636818210189440', '1', 1, 0, 80.00, 0, NULL, NULL, NULL, NULL, '12312313');
INSERT INTO `tbl_order` VALUES ('pMjIETxsLdXNqU2MrsAiXJK3AXdhqi', NULL, 'UVDmCecimTF4ZEkPNDKGIRTLYVz5SN', 'sPREIdU0a8GHf6w2NFsKnYbqUF8QUh', '1', 1, 0, 80.00, 0, NULL, NULL, NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
