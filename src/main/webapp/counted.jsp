<%--
  Created by IntelliJ IDEA.
  User: kirya
  Date: 14.02.2023
  Time: 21:54
  To change this template use File | Settings | File Templates.
--%>
<%--В качестве параметра в строке запроса введите любое число.
На странице JSP увеличьте это число на 10 и выведите результат. --%>
<%!
  int counted(int x){
    return x + 10;
  }
%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Counted</title>
</head>
<body>
<% String number =request.getParameter("number");%>
<% int num = Integer.parseInt(number);
    out.println("<h2>Result parameter = " + counted(num) +"</h2>");
%>
</body>
</html>
