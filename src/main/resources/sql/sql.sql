#建立数据库
CREATE DATABASE kitchen;

#使用数据库
USE kitchen;

#用户表
CREATE TABLE `users` (
  `userid` char(32) NOT NULL COMMENT '用户编号主键uuid32位',
  `username` varchar(50) NOT NULL COMMENT '用户名唯一(50位以内)',
  `password` varchar(15) NOT NULL COMMENT '登录密码（6到15位）',
  `email` varchar(50) NOT NULL COMMENT '邮箱不可为空',
  `phonenumber` int(11) DEFAULT NULL COMMENT '手机号码11位可以为空',
  `code` char(64) NOT NULL COMMENT '激活码不可为空',
  `state` tinyint(1) DEFAULT NULL COMMENT '用户是否激活',
  `show` tinyint(1) DEFAULT NULL COMMENT '保留字段，0删除，1未删除',
  PRIMARY KEY (`userid`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#基本套餐表
CREATE TABLE `basepackage` (
  `basepackageid` char(32) NOT NULL COMMENT '基本套餐主键',
  `basefoodname` varchar(50) NOT NULL COMMENT '套餐名字',
  `baseimage` varchar(200) NOT NULL COMMENT '套餐图片',
  `basedescription` varchar(300) NOT NULL COMMENT '套餐详细介绍(300位以内)',
  `baseprice` decimal(5,1) NOT NULL COMMENT '价格',
  `basenum` int(4) NOT NULL COMMENT '总份数',
  `baserenum` int(4) NOT NULL COMMENT '剩余份数',
  `show` tinyint(1) DEFAULT NULL COMMENT '保留字段，0删除，1未删除',
  PRIMARY KEY (`basepackageid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#原材料表
CREATE TABLE `materials` (
  `materialid` char(32) NOT NULL COMMENT '原材料主键',
  `materialname` varchar(50) NOT NULL COMMENT '原材料名字',
  `materialprice` decimal(5,1) NOT NULL COMMENT '价格',
  `materialnum` int(4) NOT NULL COMMENT '剩余份数',
  `materialimage` varchar(200) DEFAULT NULL COMMENT '材料图片(先放着再说，不需要可以删除)',
  `show` tinyint(1) DEFAULT NULL COMMENT '保留字段，0删除，1未删除',
  PRIMARY KEY (`materialid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#订单表
CREATE TABLE `orders` (
  `orderid` char(32) NOT NULL COMMENT '主键',
  `ordertime` datetime DEFAULT NULL COMMENT '下单时间',
  `total` decimal(10,2) DEFAULT NULL COMMENT '订单合计价格',
  `state` smallint(1) DEFAULT NULL COMMENT '订单状态：1.未付款 2.已付款 3.已取消订单 4.完成交易',
  `userid` char(32) DEFAULT NULL COMMENT '订单所属用户',
  `address` varchar(200) DEFAULT NULL COMMENT '订单地址',
  `show` tinyint(1) DEFAULT NULL COMMENT '保留字段，0删除，1未删除',
  PRIMARY KEY (`orderid`),
  KEY `userid` (`userid`),
  CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`userid`) REFERENCES `users` (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#订单明细表
CREATE TABLE `orderitems` (
  `orderitemid` char(32) NOT NULL COMMENT '主键',
  `count` int(4) NOT NULL COMMENT '购买数量',
  `subtotal` decimal(10,0) NOT NULL COMMENT '小计',
  `orderid` char(32) NOT NULL COMMENT '所属订单',
  `basepackageid` char(32) DEFAULT NULL COMMENT '基本套餐id，实际为外键关系，但可以为空',
  `materialid` char(32) DEFAULT NULL COMMENT '原材料id，实际为外键关系，但可以为空，一般两个id不能同时为空',
  `show` tinyint(1) DEFAULT NULL COMMENT '保留字段，0删除，1未删除',
  PRIMARY KEY (`orderitemid`),
  KEY `orderid` (`orderid`),
  CONSTRAINT `orderitems_ibfk_1` FOREIGN KEY (`orderid`) REFERENCES `orders` (`orderid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;