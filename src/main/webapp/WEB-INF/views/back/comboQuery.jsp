<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<title>后台套餐列表</title>

<style type="text/css">
body{
	margin: 0;
	padding: 0;
	text-align: center;
}
div{
	margin: 0;
	padding: 0;
	text-align: left;
}
#main{
	margin:0 auto;
	width: 1000px;
	height:750px;
	border: 1px solid gray;
}
#combolist{
	margin:0 auto;
	width: 1000px;
	height:650px;
	border: 1px solid blue;
}
#pagenum{
	margin:0 auto;
	text-align: center;
}
.comboxx{
	width: 200px;
	height: 275px;
	float: left;
	margin-left: 25px;
	margin-top: 40px;
}
.xxxx{
	width: 100%;
	padding-bottom:1px;
	position: relative;
}
img{
	width: 200px;
	height:150px;
}
.btn{
	height:30px;
	float: right;
}
#fullbg { 
	background-color:gray; 
	left:0; 
	opacity:0.5; 
	position:absolute; 
	top:0; 
	z-index:3; 
	filter:alpha(opacity=50); 
	-moz-opacity:0.5; 
	-khtml-opacity:0.5; 
} 

#dialog { 
	background-color:#fff; 
	border:1px solid blue; 
	height:600px; 
	left:50%; 
	position:absolute; 
	top:50px; 
	width:500px; 
	z-index:5; 
	border-radius:5px;
	margin-left:-250px; 
	display: none;
} 
#poptitle{
	width: 100%;
	height:50px;
	background-color:#476EC4;
	text-align:right;
}
.poptitlebtn{
	height: 49px;
	border-color: white;
	background-color:#476EC4; 
	color: white;
}
#dialogcontent{
	width: 100%;
	height:480px;
}
#dialogfoot{
	width: 100%;
	height:70px;
	border: 1px solid pink;
}
</style>
<script type="text/javascript"> 

function showBg() {
	$("#dialog").show();
	var bw = $(window).width();
	var bh = $(window).height(); 
	$("#fullbg").css({ 
		height:bh, 
		width:bw, 
		display:"block" 
	}); 
	$("#dialog").show(); 
} 
 
function closeBg() { 
	$("#fullbg,#dialog").hide(); 
} 
</script>
</head>
<body>
	<div id="main">
		<div id="combolist">
			<c:forEach items="${pageData.pageData }" var="item">
				<div class="comboxx">
					<img src="${item.comboimage }"/>
					<div class="xxxx">
						<label>套餐：${item.comboname }</label><br/>
						<label>价格：${item.comboprice }</label><br/>
						<label>制作：${item.combodescription }</label><br/>
						<label>总量：${item.combonum }</label><br/>
						<label>剩余：${item.comborenum }</label>
						<input type="button" value="change" class="btn" onclick="javascript:showBg();">
					</div>
				</div>
			</c:forEach>
		</div>
		<div id="pagenum">
			<nav>
	  			<ul class="pagination">
	  				<c:if test="${pageData.totalPageNum == 1 }">
	  					<li class="active"><a href="">1 <span class="sr-only">(current)</span></a></li>
	  				</c:if>
	  				<c:if test="${pagaData.totalPageNum > 1 and pageData.totalPageNum <= 14 }">
	  					<li class="disabled"><a href="#" data-aria-label="Previous"><span data-aria-hidden="true">&laquo;</span></a></li>
	  					<li class="active"><a href="/kitchen/backmain/comboQuery.ms?pagesize=8&pagenumber=1">1 <span class="sr-only">(current)</span></a></li>
	  					<c:forEach begin="2" end="${pageData.totalPageNum }">
	  						<li><a href="#">${varStatus.index } <span class="sr-only">(current)</span></a></li>
	  					</c:forEach>
	  					
	  				</c:if>
				    <li class="disabled"><a href="#" data-aria-label="Previous"><span data-aria-hidden="true">&laquo;</span></a></li>
				    <li class="active"><a href="/kitchen/backmain/comboQuery.ms?pagesize=8&pagenumber=1">1 <span class="sr-only">(current)</span></a></li>
				    <li><a href="/kitchen/backmain/comboQuery.ms?pagesize=8&pagenumber=2">2<span class="sr-only">(current)</span></a></li>
				    <li><a href="#">1 <span class="sr-only">(current)</span></a></li>
				    <li><a href="#">1 <span class="sr-only">(current)</span></a></li>
				    <li><a href="#">1 <span class="sr-only">(current)</span></a></li>
				    <li><a href="#" data-aria-label="Next"><span data-aria-hidden="true">&raquo;</span></a></li>
	  			</ul>
			</nav>	
		</div>
	</div>
	
	<div id="fullbg">
	</div> 
		
	<div id="dialog">
		<div id="poptitle"> 
			<button onclick="closeBg();" class="poptitlebtn">关闭</button>
		</div>
		<div id="dialogcontent">loading...</div>
		<div id="dialogfoot">
			<button type="button" class="btn btn-default">Left</button>
		</div>
	</div>
</body>
</html>