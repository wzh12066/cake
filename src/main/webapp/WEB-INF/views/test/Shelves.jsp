<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>蛋糕上架</title>
<link href= "css/bootstrap.min.css"rel="stylesheet">
<script scr="js/bookstrap.min.js"></script>
</head>
<body>
<form class="text-center" action="" method="post" name="Shelves">

<div class="cotainer">
<div class="row">
<h1 class="alert text-center" >蛋糕上架</h1>
<div class="col-md-12 table-responsive">
<div class="col-xs-12">
<div class="col-xs-8"></div>
<div class="col-xs-4"><button class="btn btn-success" type="submit" align="right">儲存</button></div>
</div>
<table class="table table-hover" style="table-layout:fixed">
<tr>
<th class="text-center">品名</th><div>
<th class="text-center">上架數量</th></div>
<th class="text-center">增加/減少</th></div>
<tr>

<tr>
<td>a蛋糕</td>
<td align="center">
<input type="text" class="form-control text-right" value="0" style="width:40px" name="ShelvesAmount">
</td>
<td >
<button class="btn btn-primary ">＋</button>
<button class="btn btn-danger">－</button>
</td>
</tr>


</table>
</div>
</div>
</div>
</form>
</body>
</html>