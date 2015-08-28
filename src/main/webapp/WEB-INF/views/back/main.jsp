<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="../backcss/main.css">
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<title>后台管理</title>
</head>
<body>	
	<DIV id="top"><LABEL>欢迎您：${userAo.username }</LABEL></DIV>
	<DIV id="main">
	<DIV id="left">
		<iframe src="/kitchen/backmain/left.ms" name="leftmenu" width="100%" height="100%"></iframe>
	</DIV>
	<DIV id="right">
		<iframe  name="right" width="100%" height="100%"></iframe>
	</DIV>
	</DIV>
</body>
</html>