<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" href="../backcss/jquery-ui.css" />
<script src="../js/jquery-1.11.3.js"></script>
<script src="../js/jquery-ui.min.js"></script>
<script src="../js/backjs/table.js"></script>
<link rel="stylesheet" href="../backcss/commons.css">
</head>
<style type="text/css">
#addButton{
	width: 75px;
    height: 30px;
	background-image: url("../images/back/button-style.png");
	background-color: transparent;
	border: none;
	background-position: -3px -2px;
	cursor: pointer;
}
#deleteButton{
	width: 75px;
    height: 30px;
	background-image: url("../images/back/button-style.png");
	background-color: transparent;
	border: none;
	background-position: -78px -2px;
	cursor: pointer;
}
</style>
<body>
<div>
	<div style="width: 50%;margin:0 auto;text-align: right;">
		<button id="addButton" data-val="/kitchen/backCategory/beforeCategoryAdd.ms" onclick="add(this,400,400)"></button>
		<button id="deleteButton" data-val="" onclick=""></button>
	</div>
	<table style="width: 50%;margin:0 auto;">
		<caption>类别表</caption>
		<thead><tr><th>序号</th><th>名称</th><th>操作</th></tr></thead>
		<c:forEach items="${pageData.pageData }" var="item" varStatus="status">	
			<tr>
			<td>${status.index + 1}</td>
			<td>${item.categoryname}</td>
			<td><a class="openDialog" style="cursor: pointer;" data-val="/kitchen/backCategory/beforeUpdateCategory.ms?categoryid=${item.categoryid}" onclick="modify(this,400,400)">修改</a></td>
			</tr>
		</c:forEach>
	</table> 	
</div>
<div id="dialog-form" title="类别修改">
 	<script type="text/javascript">
	var ie = navigator.appVersion.indexOf('MSIE') != -1;
	if(ie)
	{
		document.write('<iframe name="DialogFrame" frameborder="0" scrolling="yes" id="DialogFrame" width="100%" height="100%"></iframe>');
	}
	else
	{
		document.write('<iframe name="DialogFrame" frameborder="0" scrolling="auto" id="DialogFrame" width="100%" height="100%"></iframe>');
	}
	</script>
</div>
<div id="dialog-form-Add" title="增加分类">
 	<script type="text/javascript">
	var ie = navigator.appVersion.indexOf('MSIE') != -1;
	if(ie)
	{
		document.write('<iframe name="DialogFrameAdd" frameborder="0" scrolling="yes" id="DialogFrameAdd" width="100%" height="100%"></iframe>');
	}
	else
	{
		document.write('<iframe name="DialogFrameAdd" frameborder="0" scrolling="auto" id="DialogFrameAdd" width="100%" height="100%"></iframe>');
	}
	</script>
</div>
<div id="dialog-Tip" title="操作提示" >
</div>
</body>
</html>