<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
 <meta charset="UTF-8">
 <title>update cake</title>
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/jquery.validate.css" rel="stylesheet">
</head>
<body>
	<%@include file="navbar.jspf" %>
	<div class="container theme-showcase" role="main">
    
      <div class="jumbotron" >    
        <h1>蛋糕管理系統</h1>
      </div>
	<div class="container">
		<div class="row">
			<br>
			<div class="col-md-3"></div>
			<div class="col-md-6">
				<form method="post" action="updateCake" id="updateForm">
					

					<div class="form-group">
						<label>名稱:</label>
						<input type="text" name="cakeName" placeholder="輸入蛋糕名稱" value="${cake.cakeName}" required>
						<p class="help-block">蛋糕名稱</p>
					</div>
					<div class="form-group">
						<label>成本:</label>
						<input type="number" name="cakeCost" placeholder="0"  value="${cake.cakeCost}" required>
						<p class="help-block">單個蛋糕成本</p>
					</div>
					<div class="form-group">
						<label>價格:</label>
						<input type="number" name="cakePrice" placeholder="0" value="${cake.cakePrice}" required>
						<p class="help-block">單個蛋糕價格</p>
					</div>
					<div class="form-group">
						<label>:</label>
						<input type="number" name="pruductQuantity" placeholder="0" value="${cake.pruductQuantity}" required>
						<p class="help-block">pruductQuantity</p>
					</div>
					<button type="submit" class="btn btn-primary">修改</button>
				</form>
			</div>
			<div class="col-md-3"></div>
		</div>
	</div>
	</div><!-- /.container -->
	<!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.validate.js"></script>
	<script src="js/additional-methods.js"></script>
	<script src="js/messages_zh_TW.js"></script>
	<script>
	$("#updateForm").validate();
	</script>
</body>
</html>