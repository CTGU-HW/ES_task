/*
 Navicat Premium Data Transfer

 Source Server         : dbroot
 Source Server Type    : MySQL
 Source Server Version : 80016
 Source Host           : localhost:3306
 Source Schema         : dullproject

 Target Server Type    : MySQL
 Target Server Version : 80016
 File Encoding         : 65001

 Date: 04/08/2020 17:45:58
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admins
-- ----------------------------
DROP TABLE IF EXISTS `admins`;
CREATE TABLE `admins`  (
  `adminid` int(11) NOT NULL AUTO_INCREMENT,
  `adminname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `adminpwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `admindate` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`adminid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admins
-- ----------------------------
INSERT INTO `admins` VALUES (1, 'admin', 'admin', 'in', 'in', '2020-08-01');

-- ----------------------------
-- Table structure for cart
-- ----------------------------
DROP TABLE IF EXISTS `cart`;
CREATE TABLE `cart`  (
  `cartid` int(11) NOT NULL AUTO_INCREMENT,
  `pid` int(11) NULL DEFAULT NULL,
  `pname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `count` int(11) NULL DEFAULT NULL,
  `aliImage` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `uid` int(11) NULL DEFAULT NULL,
  `price` float(50, 1) NULL DEFAULT NULL,
  `limitUm` int(20) NULL DEFAULT NULL,
  `checked` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`cartid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of cart
-- ----------------------------
INSERT INTO `cart` VALUES (1, 1, '草莓', 1, '/static/img/特价水果/草莓.jpg', 1, 12.0, 5, " ");
INSERT INTO `cart` VALUES (2, 2, '赣南脐橙', 2, '/static/img/特价水果/赣南脐橙.jpg', 1, 13.0, 5, " ");
INSERT INTO `cart` VALUES (3, 3, '红提', 4, '/static/img/特价水果/红提.jpg', 2, 25.0, 5, " ");

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category`  (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `cname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`cid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES (1, '特价水果');
INSERT INTO `category` VALUES (2, '精美包装');
INSERT INTO `category` VALUES (3, '国产水果');
INSERT INTO `category` VALUES (4, '进口水果');
INSERT INTO `category` VALUES (5, '果脯系列');

-- ----------------------------
-- Table structure for products
-- ----------------------------
DROP TABLE IF EXISTS `products`;
CREATE TABLE `products`  (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `pname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pnameTitle` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `price` float(50, 1) NULL DEFAULT NULL,
  `aliImage` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `limitNum` int(11) NULL DEFAULT NULL,
  `cid` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`pid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of products
-- ----------------------------
INSERT INTO `products` VALUES (1, '草莓', '特价新鲜水果来啦，好吃又营养，快来选购叭', 12.0, '/static/img/特价水果/草莓.jpg', 5, 1);
INSERT INTO `products` VALUES (2, '赣南脐橙', '特价新鲜水果来啦，好吃又营养，快来选购叭', 13.0, '/static/img/特价水果/赣南脐橙.jpg', 5, 1);
INSERT INTO `products` VALUES (3, '红提', '特价新鲜水果来啦，好吃又营养，快来选购叭', 25.0, '/static/img/特价水果/红提.jpg', 5, 1);
INSERT INTO `products` VALUES (4, '火龙果', '特价新鲜水果来啦，好吃又营养，快来选购叭', 34.0, '/static/img/特价水果/火龙果.jpg', 5, 1);
INSERT INTO `products` VALUES (5, '葡萄', '特价新鲜水果来啦，好吃又营养，快来选购叭', 32.4, '/static/img/特价水果/葡萄.jpg', 5, 1);
INSERT INTO `products` VALUES (6, '山东红富士', '特价新鲜水果来啦，好吃又营养，快来选购叭', 23.0, '/static/img/特价水果/山东红富士.jpg', 5, 1);
INSERT INTO `products` VALUES (7, '西州哈密瓜', '特价新鲜水果来啦，好吃又营养，快来选购叭', 21.0, '/static/img/特价水果/西州蜜哈密瓜.jpg', 5, 1);
INSERT INTO `products` VALUES (8, '小河沟御梨', '特价新鲜水果来啦，好吃又营养，快来选购叭', 12.0, '/static/img/特价水果/小河沟御梨.jpg', 5, 1);
INSERT INTO `products` VALUES (9, '牛油果', '特价新鲜水果来啦，好吃又营养，快来选购叭', 34.0, '/static/img/特价水果/牛油果.jpg', 5, 1);
INSERT INTO `products` VALUES (10, '龙眼', '特价新鲜水果来啦，好吃又营养，快来选购叭', 42.0, '/static/img/特价水果/龙眼.jpg', 5, 1);
INSERT INTO `products` VALUES (11, '香蕉', '特价新鲜水果来啦，好吃又营养，快来选购叭', 23.0, '/static/img/特价水果/香蕉.jpg', 5, 1);
INSERT INTO `products` VALUES (12, '新鲜罗汉果', '特价新鲜水果来啦，好吃又营养，快来选购叭', 32.0, '/static/img/特价水果/新鲜罗汉果.jpg', 5, 1);
INSERT INTO `products` VALUES (13, '水果礼盒', '超值水果礼盒，高端大气，你值得拥有', 20.0, '/static/img/精美包装/水果礼盒.jpg', 30, 2);
INSERT INTO `products` VALUES (14, '苹果礼盒', '苹果量身定做礼盒，送去平安这份独特心意', 40.0, '/static/img/精美包装/苹果礼盒.jpg', 30, 2);
INSERT INTO `products` VALUES (15, '孕妈礼盒', '送给孕妈妈的首选礼盒，温馨而又健康', 60.0, '/static/img/精美包装/14035056765923.jpg', 30, 2);
INSERT INTO `products` VALUES (16, '车厘子', '精美国产水果，欢迎选购哦，百分百好货', 50.0, '/static/img/国产水果/车厘子.jpg', 30, 3);
INSERT INTO `products` VALUES (17, '荔枝', '精美国产水果，欢迎选购哦，百分百好货', 20.0, '/static/img/国产水果/荔枝.jpg', 30, 3);
INSERT INTO `products` VALUES (18, '红西柚', '精美国产水果，欢迎选购哦，百分百好货', 23.0, '/static/img/国产水果/红西柚.jpg', 30, 3);
INSERT INTO `products` VALUES (19, '美国新奇士柠檬', '鲜味进口水果，快来抢先品尝吧', 43.0, '/static/img/进口水果/美国新奇士柠檬.jpg', 30, 4);
INSERT INTO `products` VALUES (20, '新西兰奇异果', '鲜味进口水果，快来抢先品尝吧', 54.0, '/static/img/进口水果/新西兰奇异果.jpg', 30, 4);
INSERT INTO `products` VALUES (21, '英国红心芭乐', '鲜味进口水果，快来抢先品尝吧', 65.0, '/static/img/进口水果/英国红心芭乐.jpg', 30, 4);
INSERT INTO `products` VALUES (22, '芒果干', '独特果脯系列，满足你味蕾的所有幻想', 60.0, '/static/img/果脯系列/芒果干.jpg', 30, 5);
INSERT INTO `products` VALUES (23, '蓝莓干', '独特果脯系列，满足你味蕾的所有幻想', 80.0, '/static/img/果脯系列/蓝莓干.jpg', 30, 5);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '周政', '123456', '周政', '555@126.com', '18371799831');
INSERT INTO `user` VALUES (2, '华好文', '123456', '华好文', '666@126.com', '18371799832');
INSERT INTO `user` VALUES (3, '董彩云', '123456', '董彩云', '777@126.com', '18371799833');
INSERT INTO `user` VALUES (4, '程飞扬', '123456', '程飞扬', '888@126.com', '18371799834');
INSERT INTO `user` VALUES (5, '沈锐', '123456', '沈锐', '999@126com', '18371799835');
INSERT INTO `user` VALUES (6, 'user1', '123456', 'user1', '12345@126.com', '18371799836');
INSERT INTO `user` VALUES (7, 'user2', '123456', 'user2', '12346@126.com', '18371799837');
INSERT INTO `user` VALUES (8, 'user3', '123456', 'user3', '12347@126.com', '18371799838');
INSERT INTO `user` VALUES (9, 'user4', '123456', 'user4', '12348@126.com', '18371799839');
INSERT INTO `user` VALUES (10, 'user5', '123456', 'user5', '12349@126.com', '18371799840');

SET FOREIGN_KEY_CHECKS = 1;

create unique index onlyOne on user(phone)
