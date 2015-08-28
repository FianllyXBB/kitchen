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
<link rel="stylesheet" href="../backcss/left.css">
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="../js/backjs/left.js"></script>
</head> 
<body>
<!-- Container -->
<ul id="accordion" class="accordion">
	<li>
		<div class="link">类别管理</div>
		<ul class="submenu">
			<li><a href="/kitchen/backCategory/categoryQuery.ms" target="right">全部类别</a></li>
			<li><a href="#">testing...</a></li>
			<li><a href="#">testing...</a></li>
			<li><a href="#">testing...</a></li>
		</ul>
	</li>
	<li>
		<div class="link">combo manager</div>
		<ul class="submenu">
			<li><a href="/kitchen/backmain/comboQuery.ms?pagesize=8" target="right">combo query</a></li>
			<li><a href="#">jQuery</a></li>
			<li><a href="#">Frameworks javascript</a></li>
		</ul>
	</li>
	<li>
		<div class="link">table manager</div>
		<ul class="submenu">
			<li><a href="#">basic combo</a></li>
			<li><a href="#">Dispositivos mobiles</a></li>
			<li><a href="#">Medios de escritorio</a></li>
			<li><a href="#">Otros dispositivos</a></li>
		</ul>
	</li>
	<li><div class="link">用户管理</div>
		<ul class="submenu">
			<li><a href="#">查看用户</a></li>
			<li><a href="#">testing...</a></li>
			<li><a href="#">testing...</a></li>
			<li><a href="#">testing...</a></li>
		</ul>
	</li>
</ul>
</body>
</html>