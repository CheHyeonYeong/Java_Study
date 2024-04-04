<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>01.scriptlet02.jsp</title>
</head>
<body>

    <%
        //break를 사용하여 구구단 4단을 만들어보세요

        int  i = 1;
        while(true){
            out.println("4 x "+i +" = "+4*i+"<br>");
    %>
    <hr />
    <%
            //out.println("==========================<br>"); 
            i++;
            if(i==9) break;
            
        }
    %>
    <hr />

    1. 체크박스 20개를 for문을 이용하여 세로로 생성
    


</body>
</html>
