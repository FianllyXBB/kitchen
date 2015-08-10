<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>套餐列表</title>
<%--
	访问链接:http://localhost:8080/kitchen/combo/selectAll.ms
	可一传参数：pagenumber第几页
				pagesize：一页显示数量
				ordercolumn：排序列
				ordermethod:升序降序
	如：http://localhost:8080/kitchen/combo/selectAll.ms?pagenumber=1&pagesize=10&ordercolumn=comboprice&ordermethod=desc
	参数在服务器端都有默认值
 --%>
<style type="text/css">
body,div{
	margin: 0;
	padding: 0;
}
#main{
	margin:0 auto;
	width: 1000px;
}
.comboxx{
	width: 200px;
	height: 250px;
	float: left;
	margin-left: 25px;
	margin-top: 30px;
}
img{
	width: 200px;
	height:150px;
}
.btn{
	float: right;
}
</style>
</head>
<body>
	<div id="main">
		<c:forEach items="${list }" var="item">
			<div class="comboxx">
				<img src="${item.comboimage }"/>
				<div class="xxxx">
					<label>套餐：${item.comboname }</label><br/>
					<label>价格：${item.comboprice }</label><br/>
					<label>制作：${item.combodescription }</label><br/>
					<label>总量：${item.combonum }</label><br/>
					<label>剩余：${item.comborenum }</label>
					<input type="button" value="buy" class="btn">
				</div>
			</div>
		</c:forEach>
	</div>
</body>
</html>