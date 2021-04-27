<%--
  Created by IntelliJ IDEA.
  User: WRC
  Date: 2020/12/8
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    session.setMaxInactiveInterval(5);
    Object a=session.getAttribute("user");
    out.print(a);
    if (a==null){
        response.sendRedirect("index.jsp");
    }
%>
<h1>欢迎<%=a%></h1>
<h1>欢迎<%=application.getAttribute("count")%></h1>
<a href="ce3.jsp">退出</a>
</body>
</html>
