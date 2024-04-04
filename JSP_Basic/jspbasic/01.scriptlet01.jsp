<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP Example</title>
</head>
<body>

    <%
    int a = 20;
    if(a>=10){
            out.println("안녕하세요<br>");
            out.println("<b> 반가워요</b>");
    }
    %>
    <h1>Hello, World!</h1>
    <p>This is a simple JSP example.</p>
</body>
</html>
