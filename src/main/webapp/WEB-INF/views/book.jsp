<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
   <%@ page language="java" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
function show(){
	//alert("---------");
	
	$("#bu").attr("disabled","disabled");
	//....省略.....
	if(item.msginfo=="数据已成功生成!"){
		$("#bu").attr("disabled","");
	}
	

}
function date2str(x, y) {
	   var z = {
	      y: x.getFullYear(),
	      M: x.getMonth() + 1,
	      d: x.getDate(),
	      h: x.getHours(),
	      m: x.getMinutes(),
	      s: x.getSeconds()
	   };
	   return y.replace(/(y+|M+|d+|h+|m+|s+)/g, function(v) {
	      return ((v.length > 1 ? "0" : "") + eval('z.' + v.slice(-1))).slice(-(v.length > 2 ? v.length : 2))
	   });
	}
		alert(new Date(), "yyyy-MM-d hh:mm:ss");
	
</script>
<script type="text/javascript">
		function checkIn(){
	
	//Date checkIn=new Date();
	//alert(new Date);
	alert(new Date)
	var  checkIn=new Date().format("yyyy-MM-dd HH:mm:ss")
	//document.write(Date());
	return checkIn;
}
		function getOff(){
			
			//Date checkIn=new Date();
			//alert(new Date);
				var  getOff=new Date().format("yyyy-MM-dd HH:mm:ss")
			alert(new Date)
		
			//document.write(Date());
			return getOff;
		}
</script>
<script type="text/javascript">
			function compute(){
				alert('今日上班：'+"毫秒")
				var mm=checkIn.getTime()-getOff.getTime()
				
				document.write('今日上班：'+checkIn.getTime()-getOff.getTime()+"毫秒");
			}
			
			</script>
<title>Redirecting..</title>
</head>
<body>
waiting..
<input type="button" id="bu" name="bu" onclick="show()" href="#" value="按钮"/>
<%
System.out.println("checkin"+request.getParameter("first"));


System.out.println("getOff"+request.getParameter("second"));

%>
</body>
</html>


