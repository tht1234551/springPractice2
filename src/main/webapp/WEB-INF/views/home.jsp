<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/include/tagLib.jsp" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

</body>
</html>

<script>

$(document).ready(function () {
	console.log("document ready!");
	mapperTest();
	
})

function mapperTest() {
	$.ajax({
		url : "${contextPath}" + "/mapperTest" + ".json",
		type : "GET",
		dataType: "json",
		
	}).done(function (result) {
		console.log(result);
    }).fail(function (e) {
    	console.log(e);
    });
}


</script>