<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script src="http://apps.bdimg.com/libs/angular.js/1.3.9/angular.min.js"></script>
<link rel="stylesheet" href="../css/jquery-ui.css" />
<script src="../js/jquery-1.11.3.js"></script>
<script src="../js/jquery-ui.min.js"></script>
<link rel="stylesheet" href="../css/commons.css">
<script>
  $(function() {
    $( "#dialog" ).dialog({
    	modal: true
    });
    
  });
  </script>
</head>
<body>
<div data-ng-app="categoryTableApp" data-ng-controller="categoryTableController">

	 <table style="width: 50%;margin:100px auto;">
	 	<CAPTION>类别表</CAPTION>
	 	<thead><tr><th>序号</th><th>名称</th></tr></thead>
		<tr data-ng-repeat="item in pageData.pageData">
		<td>{{$index+1}}</td>
		<td>{{item.categoryname}}</td>
		</tr>
	</table> 
</div>

<div id="dialog" title="修改类别" style="width: 500px;">
  <span>类别名称：</span><input type="text"/>
</div>
	
<script type="text/javascript">
	var jsonApp = angular.module("categoryTableApp",[]);
	jsonApp.controller('categoryTableController', function($scope,$http){
		$http.get("/kitchen/backCategory/categoryQuery.json")
		.success(function(response){
			$scope.pageData=response.pageData;
		});
	});
</script>
</body>
</html>