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

    Object a=session.getAttribute("user");
    out.print(a);
    if (a==null){
        response.sendRedirect("index.jsp");
    }
    session.invalidate();

%>
</body>
</html>
