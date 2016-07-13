<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <title>Bootstrap 实例 - 默认的分页</title>
   <link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
   <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
   <script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
   <script src="http://apps.bdimg.com/libs/angular.js/1.4.6/angular.min.js"></script>
   <script type="text/javascript">
   	$(function(){
   		$("#testId").on('click',function(){
   			$.ajax({
   				url:'/mss/test/json',
   				type:'get',
   				dataType:'json',
   				data:{'name':'zeping'},
   				success:function(data){
   					alert('aa');
   				}
   			})
   		})
   	})
   	
   	
	
	/**$(function(){
		var appKey = $("#selectId option:selected").val();
		var pltCode = $("#selectId option:selected").text();
		var apps = angular.module('myApps', []);
		apps.controller('myCtrls', function($scope,$http) {
				$http({
						url:"/mss/test/onePltDatas",
						method:"post",
						params: {appKey:appKey,pltCode:pltCode} 
				}).success(function(response) {$scope.datas = response});
		    
		});
	})*/
	
	var app = angular.module('myApp', []);
		app.controller('myCtrl', function($scope,$http) {
				$http({
						url:"/mss/test/getPltCode",
						method:"post",
						params: {name:'angular',password:'333',age:1} 
				}).success(function(response) {$scope.names = response});
				
				$scope.selectData = function(){
					var appKey = $("#selectId option:selected").val();
					var pltCode = $("#selectId option:selected").text();
					var apps = angular.module('myApps', []);
						$http({
								url:"/mss/test/onePltDatas",
								method:"post",
								params: {appKey:appKey,platCode:pltCode} 
						}).success(function(response) {
							$scope.datas = response
							//$scope.counts = response.;
						});
				};
				
				/**$.scope.page = function(){
					var pageNo = $("#pageNo").val();
					var pageSize = $("#pageSize").val();
					
				};*/
		    
		});
	
   	
   </script>
</head>
<body>

<div class="container"  ng-app="myApp" ng-controller="myCtrl">
  <div class="form-group" style="width:13%">
    <label>平台：</label>
    <select class="form-control" id="selectId" ng-change="selectData(b)" ng-model="b">
    	<option ng-repeat="x in names" value="{{x.appKey}}">{{x.platCode}}</option>
    </select>
  </div>

<div>
      <table class="table table-bordered" >
        <thead>
          <tr>
            <th width="10%">appKey</th>
            <th width="10%">平台</th>
            <th width="10%">数据对象</th>
            <th width="25%">属性类型</th>
            <th width="25%">属性描述</th>
            <th width="10%">列名</th>
            <th width="10%">操作</th>
          </tr>
        </thead>
        <tbody>
          <tr ng-repeat="x in datas">
            <td ng-bind="x.appKey"></td>
            <td ng-bind="x.platCode"></td>
            <td ng-bind="x.dataObject"></td>
            <td ng-bind="x.attributeType"></td>
            <td ng-bind="x.attributeDesc"></td>
            <td ng-bind="x.columnName"></td>
            <td>删除</td>
          </tr>
        </tbody>
      </table>
</div>    
      	
      	<form id="formId">
      		<input type="hidden" name="pageNo" id="pageNo" value=""/>
      		<input type="hidden" name="pageSize" id="pageSize" value=""/>
      		<input type="hidden" name="appKey" id="appKey" value=""/>
      		<input type="hidden" name="platCode" id="platCode" value=""/>
      	</form>
        <ul class="pagination" style="margin:0px">
          <li ng-repeat="x in counts"><a href="javascript:void()">{{x}}</a></li>
		  <!-- <li><a href="#">&raquo;</a></li>  -->
		</ul>
</div>
</body>
</html>