<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" import="java.util.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
<script type="text/javascript">
		function checkIn(){
	
	//Date checkIn=new Date();
	//alert(new Date);
	alert(new Date);
	var  checkIn=new Date().format("yyyy-MM-dd HH:mm:ss");
	//document.write(Date());
	return checkIn;
}
		function getOff(){
			
			//Date checkIn=new Date();
			//alert(new Date);
			alert(new Date);
			var  getOff=new Date().format("yyyy-MM-dd HH:mm:ss");
			//document.write(Date());
			return getOff;
		}
</script>
<meta charset="UTF-8">
<title>Sample applications</title>
<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<title>員工打卡</title>
</head>

<body background="wallpaper">
	<%@include file="navbar.jspf"%>
	<ul>
		<br></br>
		<br></br>
		<div style="text-align: center;">
			<h4>員工姓名:
		
			<!-- 連接資料庫 -->
			<%
			%></h4>
			<br></br>
			<div class="row">
				<button type="bottom" name="checkIn" onclick="checkIn()" class="btn btn-primary btn-lg">上班打卡</button>
		
				<button type="button" name="getOff" onclick="getOff()" class="btn btn-default btn-lg">下班打卡</button>
	
			</div>
			<br></br>
			<h4>本月累計薪資:</h4>
			<button type="button" name="compute" onclick="compute()" class="btn btn-default btn-lg">計算</button>
			<script type="text/javascript">
			function compute(){
				alert('目前上班：'+"0工時");
				//document.write('今日上班：'+checkIn.getTime()-getOff.getTime()+"毫秒");
			}
			
			</script>
		</div>
	</ul>
</body>
</html>