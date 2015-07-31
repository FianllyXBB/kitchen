<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>自定义厨房</title>
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
          margin-bottom: 38px;
         }
     /*页面新加*/
         .item_view{
          display: inline-block;
          width: 33%;
         }
         
         .food_a{
          overflow: hidden;
         }
         .food_img{
          height: 178px;
         }
         .list-unstyled div span{
          display: block;
         }
         .act_btns{

         }
         .price_rmb{

         }
         .price_rmb:before{
          content:"￥";
          color: #ff8a0b；
         }
         .clearfixed{
           clear: both;
         }
    </style>
<script type="text/javascript">

  $(document).ready(function(){
      $(".row section").addClass("clearfixed");
      $("#productrow >div").addClass("templet");
      console.log($("#productrow div:first-child"));
      $(".nav form").addClass("hidden");
});
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

<!-- 自定义主界面-->
<div id="usedefine">
  <div class="container">
    <div class="row">
      <div class="col-xs-12 col-md-9">
    <section>
      <h2 class="menu_title rst-menu-title" title="自选做法">自选做法</h2>
    </section>
    <section>
      <h2 class="menu_title rst-menu-title" title="荤菜类">荤菜类</h2>
      <ul class="list-unstyled">
        <li class="item_view">
         <a href="#" class="food_a" >
          <img src="../images/10.jpg" class="food_img">
         </a>
         <div>
            <div class="pull-left">
             <span>培根肉</span>
             <span>xxxxx</span>
             <span>月售188份</span>
           </div>
           <div class="act_btns pull-right">
              <a href="#">
                <span class="price_rmb">16</span>
              </a>
           </div>
         </div>
        </li>
        <!-- 第二个-->
        <li class="item_view">
         <a href="#" class="food_a" >
          <img src="../images/10.jpg" class="food_img">
         </a>
         <div>
            <div class="pull-left">
             <span>培根肉</span>
             <span>xxxxx</span>
             <span>月售188份</span>
           </div>
           <div class="act_btns pull-right">
              <a href="#">
                <span class="price_rmb">16</span>
              </a>
           </div>
         </div>
        </li>
        <!-- 第三个-->
        <li class="item_view">
         <a href="#" class="food_a" >
          <img src="../images/10.jpg" class="food_img">
         </a>
         <div>
            <div class="pull-left">
             <span>培根肉</span>
             <span>xxxxx</span>
             <span>月售188份</span>
           </div>
           <div class="act_btns pull-right">
              <a href="#">
                <span class="price_rmb">16</span>
              </a>
           </div>
         </div>
        </li>
         <!-- 第四个-->
         <li class="item_view">
         <a href="#" class="food_a" >
          <img src="../images/10.jpg" class="food_img">
         </a>
         <div>
            <div class="pull-left">
             <span>培根肉</span>
             <span>xxxxx</span>
             <span>月售188份</span>
           </div>
           <div class="act_btns pull-right">
              <a href="#">
                <span class="price_rmb">16</span>
              </a>
           </div>
         </div>
        </li>
      </ul>
    </section>
    <section>
      <h2 class="menu_title rst-menu-title" title="蔬菜类">蔬菜类</h2>
       <ul class="list-unstyled">
        <li class="item_view">
         <a href="#" class="food_a" >
          <img src="../images/11.jpg" class="food_img">
         </a>
         <div>
            <div class="pull-left">
             <span>培根肉</span>
             <span>xxxxx</span>
             <span>月售188份</span>
           </div>
           <div class="act_btns pull-right">
              <a href="#">
                <span class="price_rmb">16</span>
              </a>
           </div>
         </div>
        </li>
        <!-- 第二个-->
        <li class="item_view">
         <a href="#" class="food_a" >
          <img src="../images/12.jpg" class="food_img">
         </a>
         <div>
            <div class="pull-left">
             <span>培根肉</span>
             <span>xxxxx</span>
             <span>月售188份</span>
           </div>
           <div class="act_btns pull-right">
              <a href="#">
                <span class="price_rmb">16</span>
              </a>
           </div>
         </div>
        </li>
        <!-- 第三个-->
        <li class="item_view">
         <a href="#" class="food_a" >
          <img src="../images/13.jpg" class="food_img">
         </a>
         <div>
            <div class="pull-left">
             <span>培根肉</span>
             <span>xxxxx</span>
             <span>月售188份</span>
           </div>
           <div class="act_btns pull-right">
              <a href="#">
                <span class="price_rmb">16</span>
              </a>
           </div>
         </div>
        </li>
         <!-- 第四个-->
         <li class="item_view">
         <a href="#" class="food_a" >
          <img src="../images/13.jpg" class="food_img">
         </a>
         <div>
            <div class="pull-left">
             <span>培根肉</span>
             <span>xxxxx</span>
             <span>月售188份</span>
           </div>
           <div class="act_btns pull-right">
              <a href="#">
                <span class="price_rmb">16</span>
              </a>
           </div>
         </div>
        </li>
      </ul>
    </section>
  </div>
  <!-- 侧面提示-->
  <div class="hidden-xs col-md-3">
    xxx
  </div><!-- /侧面提示-->
    </div>
  </div>
</div>
<!-- /自定义主界面-->

<!-- footer-->
<footer id="footer" >
  <div class="container navbar-default">
    <div class="row text-center">
      <!-- footer1-->
      <div class="col-xs-12 col-md-3 col-sm-6 ">
         <h4>我们如何工作</h4>
         <ul class="list-unstyled">
          <li>我们的服务</li>
          <li>我们的产品</li>
         </ul>
      </div><!-- footer1-->
      <!-- footer2-->
      <div class="col-xs-12 col-md-3 col-sm-6 ">
        <h4>关于我们</h4>
         <ul class="list-unstyled">
          <li>三顾茅庐</li>
          <li>联系我们</li>
          <li>官方微博</li>
          <li>官方微信</li>
         </ul>
      </div><!-- footer2-->
      <!-- footer3-->
      <div class="col-xs-12 col-md-3 col-sm-6">
        <h4>我们的市场</h4>
         <ul class="list-unstyled">
          <li>上海</li>
          <li>北京</li>
          <li>深圳</li>
          <li>广东</li>
         </ul>
      </div><!-- footer3-->
       <!-- footer4-->
      <div class="col-xs-12 col-md-3 col-sm-6">
        <h4>售后服务</h4>
         <ul class="list-unstyled">
          <li>服务条款</li>
          <li>隐私声明</li>
          <li>投诉</li>
          <li>宝贵建议</li>
         </ul>
      </div><!-- footer4-->
    </div>
  </div>
</footer>



<!-- 引入必要的jquery和bootstrap包-->
<!-- <script src='http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js'></script>
<script src='http://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js'></script> -->

<script type="text/javascript">
  
</script>
</body>


</html>