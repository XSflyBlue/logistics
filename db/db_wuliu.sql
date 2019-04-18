/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : db_wuliu

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2017-03-14 12:20:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_carmessage
-- ----------------------------
DROP TABLE IF EXISTS `tb_carmessage`;
CREATE TABLE `tb_carmessage` (
  `Code` int(11) NOT NULL,
  `TradeMark` varchar(20) NOT NULL,
  `Brand` varchar(50) NOT NULL,
  `Style` varchar(30) NOT NULL,
  `CarLoad` varchar(10) NOT NULL,
  `UsedTime` varchar(50) NOT NULL,
  `DriverName` varchar(30) NOT NULL,
  `DriverTime` varchar(50) NOT NULL,
  `LicenceNumber` varchar(50) NOT NULL,
  `LicenceStyle` varchar(20) NOT NULL,
  `TransportStyle` varchar(20) NOT NULL,
  `LinkMan` varchar(20) NOT NULL,
  `LinkPhone` varchar(50) NOT NULL,
  `Remark` varchar(100) NOT NULL,
  `IssueDate` datetime NOT NULL,
  `UserDate` varchar(20) NOT NULL,
  PRIMARY KEY (`Code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_carmessage
-- ----------------------------
INSERT INTO `tb_carmessage` VALUES ('1', '川123', '东风', '普通货车', '100', '1', '一天', '2', '15643', 'A', '长途', '撒旦', '1654', '哈哈哈', '2017-03-10 08:23:29', 'flyblue');
INSERT INTO `tb_carmessage` VALUES ('2', '渝123', '解放', '大货车', '200', '1', '一塔', '2', '25455', 'B', '发的', '电风扇', '153665', '地方不舍得', '2017-03-10 08:53:12', 'Tony');
INSERT INTO `tb_carmessage` VALUES ('3', '新153', '而非', '无服务', '300', '1', '无人', '3', '531536', 'C', 'argue', '过的人', '2364', '如果认为个人', '2017-03-10 08:54:37', 'Mary');
INSERT INTO `tb_carmessage` VALUES ('4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '44', '4', '4', '2017-03-10 09:05:32', 'flyblue');
INSERT INTO `tb_carmessage` VALUES ('5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '2017-03-10 09:06:35', 'Tony');
INSERT INTO `tb_carmessage` VALUES ('6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '2017-03-10 09:06:58', 'Mary');
INSERT INTO `tb_carmessage` VALUES ('7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '2017-03-10 09:07:21', 'flyblue');
INSERT INTO `tb_carmessage` VALUES ('8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '2017-03-10 09:07:38', 'Tony');
INSERT INTO `tb_carmessage` VALUES ('9', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9', '2017-03-10 09:08:00', 'Mary');
INSERT INTO `tb_carmessage` VALUES ('10', '10', '10', '10', '10', '10', '10', '10', '10', '10', '10', '10', '10', '10', '2017-03-10 09:08:27', 'flyblue');
INSERT INTO `tb_carmessage` VALUES ('11', '11', '11', '11', '11', '11', '11', '11', '11', '1', '11', '11', '11', '11', '2017-03-10 09:08:55', 'Tony');

-- ----------------------------
-- Table structure for tb_customer
-- ----------------------------
DROP TABLE IF EXISTS `tb_customer`;
CREATE TABLE `tb_customer` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(20) NOT NULL,
  `Password` varchar(16) NOT NULL,
  `Pow` char(10) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Sex` varchar(10) NOT NULL,
  `Phone` varchar(50) NOT NULL,
  `Question` varchar(50) NOT NULL,
  `Result` varchar(50) NOT NULL,
  `IssueDate` varchar(50) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_customer
-- ----------------------------
INSERT INTO `tb_customer` VALUES ('1', 'flyblue', '123', '2', '838797517@qq.com', 'man', '123', '我的学校', '重庆邮电大学', '123');
INSERT INTO `tb_customer` VALUES ('2', 'Tony', '123', '1', '123', 'man', '123', '我的家乡', '重庆', '123');
INSERT INTO `tb_customer` VALUES ('3', 'Mary', '123', '1', '123', 'woman', '123', '我的高中', '成七', '123');

-- ----------------------------
-- Table structure for tb_enterprise
-- ----------------------------
DROP TABLE IF EXISTS `tb_enterprise`;
CREATE TABLE `tb_enterprise` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `EnterpriseSort` varchar(50) NOT NULL,
  `EnterpriseName` varchar(100) NOT NULL,
  `Operation` varchar(100) DEFAULT NULL,
  `WorkArea` varchar(50) DEFAULT NULL,
  `Address` varchar(100) DEFAULT NULL,
  `Phone` varchar(200) DEFAULT NULL,
  `LinkMan` varchar(30) DEFAULT NULL,
  `HandSet` varchar(30) DEFAULT NULL,
  `Fax` varchar(30) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Http` varchar(50) DEFAULT NULL,
  `Intro` varchar(200) DEFAULT NULL,
  `IssueDate` varchar(80) DEFAULT NULL,
  `UserName` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_enterprise
-- ----------------------------
INSERT INTO `tb_enterprise` VALUES ('1', '旅行社', '**旅行社', '旅游业', '重庆', '重庆', '123', '撒旦', '123', '023-90890', '123', 'www', 'fbg', '2015-6-12', 'flyblue');
INSERT INTO `tb_enterprise` VALUES ('2', '1', '1', '1', '1', '1', '1', '1', '1', '1', '123', '1', '1', '2017-2-4', 'Tony');
INSERT INTO `tb_enterprise` VALUES ('3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '2017-3-3', 'Mary');
INSERT INTO `tb_enterprise` VALUES ('4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '2016-4-4', 'flyblue');
INSERT INTO `tb_enterprise` VALUES ('5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '2017-1-1', 'Tony');
INSERT INTO `tb_enterprise` VALUES ('6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '2017-2-2', 'Mary');
INSERT INTO `tb_enterprise` VALUES ('7', '7', '7', '7', '7', '7', '7', '7', '7', '77', '7', '7', '7', '2016-12-3', 'flyblue');
INSERT INTO `tb_enterprise` VALUES ('8', '8', '8', '8', '8', '8', '8', '8', '88', '8', '8', '8', '8', '2016-3-3', 'Tony');
INSERT INTO `tb_enterprise` VALUES ('9', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9', '2015-10-9', 'Mary');
INSERT INTO `tb_enterprise` VALUES ('10', '10', '10', '10', '10', '10', '10', '10', '10', '10', '10', '10', '10', '2016-8-8', 'flyblue');
INSERT INTO `tb_enterprise` VALUES ('11', '11', '11', '11', '11', '1', '11', '1', '1', '1', '1', '1', '1', '2017-3-3', 'Tony');

-- ----------------------------
-- Table structure for tb_goodsmeg
-- ----------------------------
DROP TABLE IF EXISTS `tb_goodsmeg`;
CREATE TABLE `tb_goodsmeg` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `GoodsStyle` varchar(50) NOT NULL,
  `GoodsName` varchar(100) NOT NULL,
  `GoodsNumber` varchar(50) NOT NULL,
  `GoodsUnit` varchar(50) NOT NULL,
  `StartProvince` varchar(30) NOT NULL,
  `StartCity` varchar(30) NOT NULL,
  `EndProvince` varchar(30) NOT NULL,
  `EndCity` varchar(30) NOT NULL,
  `Style` varchar(50) NOT NULL,
  `TransportTime` varchar(50) NOT NULL,
  `Phone` varchar(50) NOT NULL,
  `Link` varchar(200) NOT NULL,
  `IssueDate` datetime NOT NULL,
  `Remark` varchar(800) NOT NULL,
  `Request` varchar(50) NOT NULL,
  `UserName` varchar(50) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_goodsmeg
-- ----------------------------
INSERT INTO `tb_goodsmeg` VALUES ('1', '煤', '优质煤', '400', 'T', '重庆市', '重庆市', '四川省', '成都市', '普通', '2016-6-5', '123', '搭好', '2017-03-10 08:30:45', '哈哈哈', '车况好', 'Tony');
INSERT INTO `tb_goodsmeg` VALUES ('2', '电子', '计算器', '200', '个', '重庆市', '重庆市', '北京市', '北京市', '普通', '2017-2-2', '123', '潘', '2017-03-10 08:48:27', '高红玫瑰', '界面风格', 'flyblue');
INSERT INTO `tb_goodsmeg` VALUES ('3', '铁质物品', '钢筋', '2000', '斤', '重庆市', '重庆市', '湖南省', '长沙市', '普通', '2017-2-3', '123', '才', '2017-03-10 08:50:49', '是点v是', '速度GV', 'Mary');
INSERT INTO `tb_goodsmeg` VALUES ('4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '2017-03-10 08:55:37', '4', '4', 'flyblue');
INSERT INTO `tb_goodsmeg` VALUES ('5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '2017-03-10 08:56:10', '5', '5', 'Tony');
INSERT INTO `tb_goodsmeg` VALUES ('6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '2017-03-10 08:56:42', '6', '6', 'Mary');
INSERT INTO `tb_goodsmeg` VALUES ('7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '2017-03-10 08:57:08', '7', '7', 'flyblue');
INSERT INTO `tb_goodsmeg` VALUES ('8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '2017-03-10 08:57:33', '8', '8', 'Tony');
INSERT INTO `tb_goodsmeg` VALUES ('9', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9', '2017-03-10 08:58:01', '9', '9', 'flyblue');
INSERT INTO `tb_goodsmeg` VALUES ('10', '10', '10', '10', '10', '10', '10', '10', '101', '10', '10', '10', '10', '2017-03-10 08:58:45', '10', '10', 'Mary');
INSERT INTO `tb_goodsmeg` VALUES ('11', '11', '11', '11', '11', '11', '11', '11', '11', '11', '11', '11', '11', '2017-03-10 08:59:13', '11', '11', 'Tony');

-- ----------------------------
-- Table structure for tb_knowledge
-- ----------------------------
DROP TABLE IF EXISTS `tb_knowledge`;
CREATE TABLE `tb_knowledge` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Title` varchar(50) NOT NULL,
  `Content` varchar(2000) NOT NULL,
  `Author` varchar(50) NOT NULL,
  `IssueDate` datetime NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_knowledge
-- ----------------------------
INSERT INTO `tb_knowledge` VALUES ('1', '车辆停运', '天气变化，暂停运营', 'flyblue', '2017-03-10 08:32:44');
INSERT INTO `tb_knowledge` VALUES ('2', '延长通知', '二段跳那就好set和人', 'Tony', '2017-03-10 08:45:03');
INSERT INTO `tb_knowledge` VALUES ('3', '日嘎尔', '认为阿哥如果', 'Mary', '2017-03-10 08:45:49');

-- ----------------------------
-- Table structure for tb_logistics
-- ----------------------------
DROP TABLE IF EXISTS `tb_logistics`;
CREATE TABLE `tb_logistics` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Title` varchar(50) NOT NULL,
  `Content` varchar(2000) NOT NULL,
  `Author` varchar(50) NOT NULL,
  `IssueDate` datetime NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_logistics
-- ----------------------------
INSERT INTO `tb_logistics` VALUES ('1', '你好', '      鼠标有点顾虑撒', 'flyblue', '2017-03-10 09:40:45');
INSERT INTO `tb_logistics` VALUES ('2', '点v', '四五个污染', 'Tony', '2017-03-10 08:43:13');
INSERT INTO `tb_logistics` VALUES ('3', '多少', '黯然八个人', 'Mary', '2017-03-10 08:43:39');

-- ----------------------------
-- Table structure for tb_placard
-- ----------------------------
DROP TABLE IF EXISTS `tb_placard`;
CREATE TABLE `tb_placard` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Title` varchar(50) NOT NULL,
  `Content` varchar(1000) NOT NULL,
  `Author` varchar(20) DEFAULT NULL,
  `IssueDate` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_placard
-- ----------------------------
INSERT INTO `tb_placard` VALUES ('1', '关于计划', '方式对不对', 'flyblue', '2017-03-10 08:33:56');
INSERT INTO `tb_placard` VALUES ('2', '的风湿病额额', '我发给四个人', 'flyblue', '2017-03-10 08:44:12');
INSERT INTO `tb_placard` VALUES ('3', '阿尔', '如果摄入', 'flyblue', '2017-03-10 08:44:27');
