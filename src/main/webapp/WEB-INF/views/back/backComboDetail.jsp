<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<style type="text/css">
table{
	width: 100%;
	border-collapse: collapse; 
	-ms-word-break: break-all;
	word-warp: break-word;
	border:1px solid #b0cedd;
	font-size: 16px;
}
td,th{
	height: 35px;
	border:#b0cedd 1px solid;
	padding-left: 2px;
}
</style>
</head>
<body>
<form id="modifyForm" name="modifyForm" target="_self" method="post">
	<input type="text" name="comboid" value="${backComboAo.comboid }" hidden="true"/>
	<table>
		<tr>
			<td><span>名称：</span></td>
			<td><input type="text" name="comboname" value="${backComboAo.comboprice }"/></td>
		</tr>
	</table>
	<input type="submit" id="submit" style="display:none;"/>
</form>
</body>
</html>