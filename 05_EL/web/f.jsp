<%--
  Created by IntelliJ IDEA.
  User: WRC
  Date: 2021/1/8
  Time: 9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    out.print("哈哈");
    out.flush();
    response.getWriter().write("不哈哈");

%>
<%--<jsp:forward page="/a.jsp"></jsp:forward>--%>
<%

    request.getRequestDispatcher("/a.jsp").forward(request, response);

%>

</body>
</html>
