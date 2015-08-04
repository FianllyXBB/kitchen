<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>登陆注册</title>
	<!-- 新 Bootstrap 核心 CSS 文件 -->
	<link href="../styles/jquery-ui.min.css" rel="stylesheet" type="text/css" />
    <link href="../styles/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <link href="../styles/kit.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" language="javascript" src="../js/jquery-1.11.3.js" charset="utf-8"></script>
    <script type="text/javascript" language="javascript" src="../js/bootstrap.min.js" charset="utf-8"></script>
    <style type="text/css">
        
        .carousel{
          width: 100%;
        }
        .row img{
          width: 100%;
        }
        .templet{
          
        
        }
        .templet:hover{
          background-color: #eeeeee;
          border: 1px solid block;
        }
         
        #productrow >div:hover {
          
          border: 3px solid #dae0e5;
          -webkit-box-shadow: 0px 4px 8px 4px rgba(0, 0, 0, 0.2);
          -moz-box-shadow: 0px 4px 8px 4px rgba(0, 0, 0, 0.2);
          box-shadow:0px 4px 8px 4px rgba(0, 0, 0, 0.2);
         }
         #footer{
          padding-bottom: 15px;
         }
         #rgister{
          margin: 18px 0px 38px 0px;
         }
         #rgister form div{
          margin-bottom: 18px;
         }
         .form-group label{
         padding-right:0px;
         }
	       .row a{
	        color:#ec971f;
	        }
	        .registerr div{
	        text-align:center;
	        }
	        .registerr h5{
	        margin-top:4px;
	        }
    </style>
<script type="text/javascript">

  $(document).ready(function(){
	  
	  //主色调的选择
	   
	  
	  
      $("#productrow >div").addClass("templet");
      console.log($("#productrow div:first-child"));
      $(".nav form").addClass("hidden");
      
        
      $("#inputPhonenumber").bind("blur", function(){
    	  var inputPhonenumber=$("#inputPhonenumber").val();
    	
    	  if($("#inputPhonenumber").val() == ""){
    		  $("#confirmPhonenumber").text("手机号码不能为空"); 
    		  return ;
    	  }else if(/^1[0-9]{10}$/.test(inputPhonenumber)){
    		  $("#confirmPhonenumber").text("");
    		  return;
    	  }else{
    		  $("#confirmPhonenumber").text("手机号格式不正确"); 
    		  return ;
    	  }
    	  
    	  $.ajax({
    		  type:'post',
    	  	  url:'/kitchen/user/validateForm.ms',
    	  	  data:"phonenumber="+$("#inputPhonenumber").val(),
    	  	  success:function(data){
    	  		  if(data == "true"){
    	  			$("#confirmPhonenumber").text("");  
    	  		  }else{
    	  			$("#confirmPhonenumber").text("手机号码已被注册");
    	  		  }	  
    	  	  }
    	  });
      });
      
      $("#inputUsername").bind("blur", function(){
    	  var inputUsername=$("#inputUsername").val();
    	  if($("#inputUsername").val() == ""){
    		  $("#confirmUsername").text("用户名不能为空");
    		  return ;
    	  }else if(/^[A-Za-z0-9_\u554A-\u9C52]{3,20}$/.test(inputUsername)){
    		  $("#confirmUsername").html("");
    		  return;
    	  }else{
    		  $("#confirmUsername").html("用户名3-20位,字母数字下划线");
    		  return;
    	  }
    	  $.ajax({
    		  type:'post',
    	  	  url:'/kitchen/user/validateForm.ms',
    	  	  data:"username="+$("#inputUsername").val(),
    	  	  success:function(data){
    	  		  if(data == "true"){
    	  			$("#confirmUsername").text("");  
    	  		  }else{
    	  			$("#confirmUsername").text("用户名已被注册");
    	  		  }	  
    	  	  }
    	  });
      });
      $("#password").bind("blur",function(){
    	    var password=$("#password").val();
    		if(/^\S{6,32}$/.test(password)){
    			$("#password_w").html("");
    			
    		}else{
    			$("#password_w").html("6-32位字母数字下划线");
    		   
    		}
    		
      });
      $("#password_db").bind("blur",function(){
    	    var pwd=$("#password").val();
    	    var password=$("#password_db").val();
	  		if(pwd!=password){
	  			$("#password_db_w").html('2次密码不一致');
	  		
	  		}else{
	  			$("#password_db_w").html('');
	  		}
      });
});
 
  function _change() {
		var imgEle = document.getElementById("img");
		imgEle.src = "/kitchen/user/getImageCode.ms?a=" + new Date().getTime();
	}
  var filg = 0;
  var arr =new Array("#83c90a","#69be28","#3a9425","#0084da","#0084da","#60c018");
  function colorchange(){
	 
	  $(".navbar-default").css("background-color",arr[filg]);
	  filg++;
	  if(filg>=arr.length) filg=0; 
    }
  

  setInterval(colorchange,5000);

</script>
</head>
<body>
<!-- 导航条 -->
<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header" style="text-align:center;">
        <a class="navbar-brand pull-left" href="#">
           <img alt="Brand" src="../images/logo.jpg">
        </a>
        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <!--小于 768px input[type=search]-->
        <form id="o-navbar-form" class="navbar-form" role="search">
            <div class="form-group">
              <input type="text" class="form-control" placeholder="Search">
            </div>
            <button type="submit" class="btn btn-default">Submit</button>
        </form>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">首页<span class="sr-only">(current)</span></a></li>
        <li><a href="#">精美套餐</a></li>
        <li><a href="#">厨房</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">品种 <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">鸡肉</a></li>
            <li><a href="#">猪肉</a></li>
            <li><a href="#">鱼</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">牛肉</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">羊肉</a></li>
          </ul>
        </li>
      </ul>
      <form  id="t-navbar-form" class="navbar-form navbar-left" role="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
      </form>
      <ul class="nav navbar-nav navbar-right">
      	
      	<li><a href="#">52694419</a></li>
        <li><a href="#">注册</a></li>
        <li><a href="#">登陆</a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>

<!-- 登陆主界面-->
<div id="rgister">
  <div class="container">
    <div class="row">
      <div class="col-xs-12 col-md-9">
          <div class="row">
            <div class="col-sm-2 col-xs-3"></div>
            <div class="col-sm-7 col-xs-9">
	          <div class="row registerr">
	            <div class="col-xs-6 col-md-6">
	              <h5>注册会员</h5>
	              
	            </div>
	            <div class="col-xs-6 col-md-6">
	              
	              <a href="#" onclick="changeland();">已有账户，登陆</a>
	            </div>
	          </div>
            </div>
          </div>
          
          <div id="land">
            <form class="form-horizontal" action="/kitchen/user/registSubmit.ms" method="post">
                <div class="form-group">
                  <label for="inputEmail3" class="col-sm-2 col-xs-3 control-label">手机号：</label>
                  <div class="col-sm-7 col-xs-9">
				     <input id="inputPhonenumber" type="text" class="form-control"  value="${userVo.phonenumber }"  placeholder="手机号" name="phonenumber">
				     
				     <font color="red"><label id="confirmPhonenumber">${errors.phonenumberError }</label></font>
				  </div>
                  
                </div>
                <div class="form-group">
                  <label for="inputEmail3" class="col-sm-2 col-xs-3 control-label">用户名：</label>
                  <div class="col-sm-7 col-xs-9">
                     <input id="inputUsername" type="text" class="form-control"  value="${userVo.username }"  placeholder="用户名" name="username">
                    
                     <font color="red"><label id="confirmUsername">${errors.usernameError }</label></font>
                  </div>
                </div>
                <div class="form-group">
                  <label for="inputEmail3" class="col-sm-2 col-xs-3 control-label">密码：</label>
                  <div class="col-sm-7 col-xs-9">
                    <input id="password" type="password" class="form-control" value="${userVo.password }"  placeholder="密码" name="password">
                    
                    <font color="red"><label id="password_w">${errors.passwordError }</label></font>
                  </div> 
                </div>
                <div class="form-group">
                  <label for="inputEmail3" class="col-sm-2 col-xs-3 control-label">确认密码：</label>
                  <div class="col-sm-7 col-xs-9">
                    <input id="password_db" type="password" class="form-control" value="${userVo.password }"  placeholder="确认密码">
                    <font color="red"><label id="password_db_w">${errors.passwordError }</label></font>
                  </div>
                </div>
	             
	                <div class="form-group yanz">
	                    <label for="inputEmail3" class="col-sm-2 col-xs-3 control-label">验证码：</label>
		                <div class="col-sm-7 col-xs-9">
						       <input type="text" name="imageCode" size="3" />
						       <img id="img" src="/kitchen/user/getImageCode.ms" style="width: 72px; height: 37px" />
						       <a href="javascript:_change()">看不清，换一张</a><br>
						       <font color="red"><label>${errors.imageCodeError }</label></font>
				               <br/>
					    </div>
				    </div>
	                <div class="row zhuche">
	                    <label for="inputEmail3" class="col-sm-2 control-label"></label>
		                <div class="col-sm-7 col-xs-12">
						    <button type="submit" id="register"   class="btn btn-warning btn-block">注册</button>
					    </div>
				    </div>
	                
			
              </form>
                  
             <!-- 注册时候显示-->
               
              
          </div>
         
        </div>
        <div class="hidden-xs col-md-3">
           xxxxxx
        </div>
      </div>
      
    </div>
 
</div>
<!-- /登陆主界面-->

<!-- footer-->




<!-- 引入必要的jquery和bootstrap包-->
<!-- <script src='http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js'></script>
<script src='http://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js'></script> -->

<script type="text/javascript">
  
</script>
</body>


</html>
<script type="text/javascript">






</script>