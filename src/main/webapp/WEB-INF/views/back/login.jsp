<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<title>后台登录</title>
<STYLE type="text/css">
.panel{
	margin:0 auto;
	width: 700px;
	margin-top: 100px;
}
.panel-body{
	height: 500px;
}
#loginForm{
    margin:0 auto;
	width: 500px;
	margin-top: 50px;
}
.error{
	color: red;
}
</STYLE>
<SCRIPT type="text/javascript">
$(document).ready(function(){
	$("#loginbtn").click(function(){
		//$("#loginform").submit();
		$.ajax({
			cache: true,
			type: "POST",
			url:"/kitchen/backlogin/loginSubmit.ms",
			dataType: "json",
			data:$('#loginform').serialize(),// 你的formid
		    error: function(request) {
		        alert("Connection error");
		    },
		    success: function(data) {
			    $("#usernameError").html(data.usernameError);
			    $("#passwordError").html(data.passwordError);
			    $("#loginError").html(data.loginError);
			    if(data.loginSuccess == "true"){
			    	window.location.replace("http://localhost:8080/kitchen/backlogin/main.ms");
			    }
		    }
		});
	});
	
	$("inputUsername").bind("blur", function(){
		
	});
});
</SCRIPT>
</head>
<body>

<div class="panel panel-success">
  <div class="panel-heading ">
    <h3 class="panel-title">后台登录</h3>
  </div>
  <div class="panel-body">
  	<DIV id="loginForm">
    	<FORM id="loginform" action="/kitchen/backlogin/loginSubmit.ms" method="post">
    		<div class="input-group">
    			<span class="input-group-addon" id="basic-username">用户名：</span>
				<input id="inputUsername" type="text" class="form-control" placeholder="Username" aria-describedby="basic-username" name="username" >				
			</div><span id="usernameError" class="error">${errors.usernameError }</span>
			<BR /><BR />
			<div class="input-group">
				<span class="input-group-addon" id="basic-password">密&nbsp;&nbsp;&nbsp;码：</span>
				<INPUT type="password" class="form-control" placeholder="Password" name="password" aria-describedby="basic-password"/>
			</div><span id="passwordError" class="error">${errors.passwordError }</span>
			<BR /><BR />
		    <button id="loginbtn" type="button" class="btn btn-default">登录</button>
		</FORM>
	</DIV>
  </div>
  <div class="panel-footer"><span id="loginError" class="error">${errors.loginError } </span></div>
</div>
</body>
</html>