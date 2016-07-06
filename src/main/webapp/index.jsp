<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <script type="text/javascript">
   	  function sum(){
   		var a = document.getElementById("test1").value;
   		var b = document.getElementById("test2").value;
   		var c = a * b;
   		alert('两数相乘：'+ c);
   	  }
   </script>
</head>
<body>
参数1：<input type="text" id="test1"/><br/><br/>
参数2：<input type="text" id="test2"/>
<br/><br/>
<input type="button" onclick="sum()" value="相乘"/>
</body>
</html>