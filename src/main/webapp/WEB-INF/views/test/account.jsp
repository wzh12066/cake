<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="en">
<head>
 	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!-- Bootstrap core CSS -->
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
    
    <title>每日對帳</title>
</head>

<body>

  <br></br>
<div class="row">
			
			<div class="col-md-12">
				<table class="table"style="text-align:center;">
				  	<tr>
				  		<th>日期 </th><th>初始現金</th><th>應收現金</th><th>收款機現金</th><th>確定</th>
				  	</tr>
				  	<tr>
				  		<th>日期 </th><th>初始現金</th><th>應收現金</th><th>收款機現金</th><th><button type="button" class="btn btn-default">確定</button></th>
				  	</tr>	
				  	
				  	
				</table>
			</div>
	 </div> 
</body>
</html>