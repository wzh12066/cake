<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>蛋糕管理</title>
</head>
<body>
	<%@include file="navbar.jspf"%>
	<div class="container theme-showcase" role="main">

		<div class="jumbotron">
			<h1>蛋糕管理系統</h1>
		</div>
		<div class="container">
			<div class="row">
				<br>
				<div class="col-md-12">
					<div style="text-align: right;">
						<a class="btn btn-primary" href="insertCake">新增</a>
					</div>
					<br>
					<br />
					<table class="table">
						<tr>
							<th>名稱</th>
							<th>成本</th>
							<th>價格</th>
							<th>製作量</th>
							<th>編輯</th>
						</tr>
						<c:forEach items="${cakeList}" var="cake">
							<tr>
								<td>${cake.cakeName}</td>
								<td>${cake.cakeCost}</td>
								<td>${cake.cakePrice}</td>
								<td>${cake.pruductQuantity}</td>
								<td><a class="btn btn-default"
									href="updateCake?cakeName=${cake.cakeName}">修改</a> <a
									class="btn btn-sm btn-danger deleteBtn" href="#"
									data-toggle="modal" data-target="#deleteModal"
									data-id="${cake.cakeName}">刪除</a></td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>
		</div>
		<div class="modal fade bs-example-modal-sm" id="deleteModal"
			tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
			aria-hidden="true">
			<div class="modal-dialog modal-sm">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h4 class="modal-title" id="myModalLabel">刪除</h4>
					</div>
					<div class="modal-body">
						<p>確認刪除後，相關之訊息也將刪除</p>
					</div>
					<div class="modal-footer">
						<form id="deleteForm" action="deletecake" method="post">
							<input type="hidden" name="id" id="deleteID">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">取消</button>
							<button type="submit" class="btn btn-danger">確認刪除</button>
						</form>
					</div>
				</div>
			</div>
		</div>


	</div>
	<!-- /.container -->

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script>
		$(function() {
			$(".deleteBtn").click(function() {
				//alert($(this).attr("data-id"));
				$("#deleteID").val($(this).attr("data-id"));
			});
		});
	</script>


</body>
</html>
