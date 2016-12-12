<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>首頁</title>
<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body background="img/wallpaper.jpg">
	<%@include file="WEB-INF/views/navbar.jspf"%>
	<br></br>
	<br></br>
	<h2 align="center">蛋糕管理系統</h2>
	<UL>
		<!-- <LI><a href="article">article</a>
		<LI><a href="product">product management</a>
		<LI><a href="home">home</a>
		<LI><a href="account">account</a>
		<LI><a href="getoff">getoff</a>
		<LI><a href="InventoryManagement_check">InventoryManagement_check</a>
		<LI><a href="InventoryManagement_rank">InventoryManagement_rank</a>
		<LI><a href="InventoryManagement_show">InventoryManagement_show</a>
		<LI><a href="Manager_Home">Manager_Home</a>
		<LI><a href="Shelves">Shelves</a>
		<LI><a href="work">work</a>
	  	<LI><a href="CheckIn">checkIn</a>   -->
		<form action="login" method="post" id="loginForm"
			class="form-horizontal" role="form">

			<div class="form-group">
				<label class="control-label col-sm-2">使用者帳號:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="accountID"
						name="accountID" placeholder="Enter account" style="width: 360px;">
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2">使用者密碼:</label>
				<div class="col-sm-10">
					<input type="password" class="form-control" id="password"
						name="password" placeholder="Enter password" style="width: 360px;">
				</div>
			</div>

			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">登錄</button>
				</div>
			</div>
			<label class="label label-warning">${message}</label>
		</form>

	</UL>
</body>
</html>
