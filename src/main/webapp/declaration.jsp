<%--
  Created by IntelliJ IDEA.
  User: kirya
  Date: 14.02.2023
  Time: 21:20
  To change this template use File | Settings | File Templates.
--%>
<%!
    int multiplication(int x){
        return x * 10;
    }
%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Declaration</title>
</head>
<body>

<ul> <%
    for(int i=0; i <= 10; i++)
        out.println("<li>" + multiplication(i) + "</li>");
    %>
</ul>
</body>
</html>
