<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="en">
<head>
 	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!-- Bootstrap core CSS -->
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
    
    <title>員工打卡</title>
</head>

<body>
 
   <br></br>
   <div style="text-align:center;">
     <h4 >員工姓名:</h4>
     <br></br>
	 <div class="row">
         <a href="work.jsp" class="btn btn-default btn-lg active" role="button" style="position:relative; left:20px; top: 0px; " >上班打卡</a>
         <a href="getoff.jsp" class="btn btn-default btn-lg active" role="button" style="position:relative; left:40px; top: 0px; " >下班打卡</a>
         
     </div>
     <br></br>
     <h4>本周累計薪資:</h4>
   </div>
	  
</body>
</html>