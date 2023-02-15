<%--
  Created by IntelliJ IDEA.
  User: kirya
  Date: 15.02.2023
  Time: 19:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User info</title>
</head>
<body>
<h2>Привет <%=request.getParameter("name")%> <%=request.getParameter("lastName")%>!</h2>
</body>
</html>
