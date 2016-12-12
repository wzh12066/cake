<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="en">
<head>
 	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!-- Bootstrap core CSS -->
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
    
    <title>上班打卡</title>
</head>
<body>
<div class="text-center">
  <h4>員工姓名:</h4>
  <p> 上班:${serverTime}</p>
  <form action="home" >
  <button class="btn btn-default" type="submit">登出</button>
  </form>
</div>
</body>
</html>