<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <title>產品管理</title>
</head>
<body>

	<%@include file="navbar.jspf" %>
	
    <div class="container theme-showcase" role="main">
    
      <div class="jumbotron" >    
        <h1>產品管理系統</h1>
        <p class="lead">本系統為輔仁大學資訊管理學系之範例程式</p>
      </div>
      <form action="login" method="post" role="form">
			<div class="form-group">
			<label>帳號:</label>
			<input type="text" name="username">
			<p class="help-block">使用者帳號</p>
			</div>
			<div class="form-group">
			<label>密碼:</label>
			<input type="password" name="password">
			<p class="help-block">使用者密碼</p>
			</div>
	  		<button type="submit" class="btn btn-default">登入(Test！)</button>
	  		
	  		<label class="label label-warning">${message}</label>
		</form>  

    </div><!-- /.container -->
	<!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>


</body>
</html>