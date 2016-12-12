<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>存貨管理</title>
<link href= "css/bootstrap.min.css"rel="stylesheet">
<script scr="js/bookstrap.min.js"></script>
</head>

<body>
<form class="text-center" action="" method="post" name="Shelves">

<div class="cotainer">
<div class="row">
<h1 class="alert text-center" >存貨管理_顯示</h1>
<div class="col-md-12 table-responsive">
<div class="col-xs-12">

<div class="col-xs-8">
<div class="col-xs-4">
<a href="InventoryManagement_check.jsp" class="btn btn-info" align="right">核對</a>
<a href="InventoryManagement_rank.jsp" class="btn btn-info" align="right">排名</a></div>
</div>
<div class="col-xs-4"><button class="btn btn-success" type="submit" align="right">商品管理</button></div>
</div>
<table class="table table-hover" style="table-layout:fixed">
<tr>
<th class="text-center">品名</th>
<th class="text-center">本日銷售數量</th>
<th class="text-center">本月銷售數量</th>
<th class="text-center">成本</th>
<th class="text-center">獲利</th>
<tr>

<tr>
<td>a蛋糕</td>

<td >
本日銷售數量
</td>

<td>
本月銷售數量
</td>

<td>
成本
</td>

<td>
獲利
</td>
</tr>


</table>
</div>
</div>
</div>
</form>
</body>
</html>