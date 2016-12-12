<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>收款</title>
<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body background="img/wallpaper.jpg">
	<%@include file="navbar.jspf"%>
	<br></br>
	<br></br>

	<h2 align="center">蛋糕管理系統</h2>
	<UL>
		<table class="table">
			<tr>
				<th>名字</th>
				<th>價錢</th>
				<th>銷售量</th>

			</tr>
			<c:forEach items="${productList}" var="product">
				<tr>
					<td>${product.cake_name}</td>
					<td>${product.price}</td>
					<td>${product.sell_num}</td>

					<form method="get" action="sellNum">
						<td><input type="number" name="qty" min="0" /></td>
						<td><input type="hidden" class="form-control" id="cake_name"
							name="cake_name" value="${product.cake_name}">
							<button type="submit" class="btn btn-primary">購買</button></td>
					</form>

				</tr>
			</c:forEach>
		</table>
	</UL>
</body>
</html>
