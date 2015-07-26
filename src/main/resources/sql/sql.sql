#�������ݿ�
CREATE DATABASE kitchen;

#ʹ�����ݿ�
USE kitchen;

#�û���
CREATE TABLE `users` (
  `userid` char(32) NOT NULL COMMENT '�û��������uuid32λ',
  `username` varchar(50) NOT NULL COMMENT '�û���Ψһ(50λ����)',
  `password` varchar(15) NOT NULL COMMENT '��¼���루6��15λ��',
  `email` varchar(50) NOT NULL COMMENT '���䲻��Ϊ��',
  `phonenumber` int(11) DEFAULT NULL COMMENT '�ֻ�����11λ����Ϊ��',
  `code` char(64) NOT NULL COMMENT '�����벻��Ϊ��',
  `state` tinyint(1) DEFAULT NULL COMMENT '�û��Ƿ񼤻�',
  `show` tinyint(1) DEFAULT NULL COMMENT '�����ֶΣ�0ɾ����1δɾ��',
  PRIMARY KEY (`userid`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#�����ײͱ�
CREATE TABLE `basepackage` (
  `basepackageid` char(32) NOT NULL COMMENT '�����ײ�����',
  `basefoodname` varchar(50) NOT NULL COMMENT '�ײ�����',
  `baseimage` varchar(200) NOT NULL COMMENT '�ײ�ͼƬ',
  `basedescription` varchar(300) NOT NULL COMMENT '�ײ���ϸ����(300λ����)',
  `baseprice` decimal(5,1) NOT NULL COMMENT '�۸�',
  `basenum` int(4) NOT NULL COMMENT '�ܷ���',
  `baserenum` int(4) NOT NULL COMMENT 'ʣ�����',
  `show` tinyint(1) DEFAULT NULL COMMENT '�����ֶΣ�0ɾ����1δɾ��',
  PRIMARY KEY (`basepackageid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#ԭ���ϱ�
CREATE TABLE `materials` (
  `materialid` char(32) NOT NULL COMMENT 'ԭ��������',
  `materialname` varchar(50) NOT NULL COMMENT 'ԭ��������',
  `materialprice` decimal(5,1) NOT NULL COMMENT '�۸�',
  `materialnum` int(4) NOT NULL COMMENT 'ʣ�����',
  `materialimage` varchar(200) DEFAULT NULL COMMENT '����ͼƬ(�ȷ�����˵������Ҫ����ɾ��)',
  `show` tinyint(1) DEFAULT NULL COMMENT '�����ֶΣ�0ɾ����1δɾ��',
  PRIMARY KEY (`materialid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#������
CREATE TABLE `orders` (
  `orderid` char(32) NOT NULL COMMENT '����',
  `ordertime` datetime DEFAULT NULL COMMENT '�µ�ʱ��',
  `total` decimal(10,2) DEFAULT NULL COMMENT '�����ϼƼ۸�',
  `state` smallint(1) DEFAULT NULL COMMENT '����״̬��1.δ���� 2.�Ѹ��� 3.��ȡ������ 4.��ɽ���',
  `userid` char(32) DEFAULT NULL COMMENT '���������û�',
  `address` varchar(200) DEFAULT NULL COMMENT '������ַ',
  `show` tinyint(1) DEFAULT NULL COMMENT '�����ֶΣ�0ɾ����1δɾ��',
  PRIMARY KEY (`orderid`),
  KEY `userid` (`userid`),
  CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`userid`) REFERENCES `users` (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#������ϸ��
CREATE TABLE `orderitems` (
  `orderitemid` char(32) NOT NULL COMMENT '����',
  `count` int(4) NOT NULL COMMENT '��������',
  `subtotal` decimal(10,0) NOT NULL COMMENT 'С��',
  `orderid` char(32) NOT NULL COMMENT '��������',
  `basepackageid` char(32) DEFAULT NULL COMMENT '�����ײ�id��ʵ��Ϊ�����ϵ��������Ϊ��',
  `materialid` char(32) DEFAULT NULL COMMENT 'ԭ����id��ʵ��Ϊ�����ϵ��������Ϊ�գ�һ������id����ͬʱΪ��',
  `show` tinyint(1) DEFAULT NULL COMMENT '�����ֶΣ�0ɾ����1δɾ��',
  PRIMARY KEY (`orderitemid`),
  KEY `orderid` (`orderid`),
  CONSTRAINT `orderitems_ibfk_1` FOREIGN KEY (`orderid`) REFERENCES `orders` (`orderid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;