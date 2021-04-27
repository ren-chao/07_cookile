<%--
  Created by IntelliJ IDEA.
  User: WRC
  Date: 2020/12/26
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%          out.write("out1哈哈<br/>");

        out.flush();
        response.getWriter().write("天气不错<br/>");
        response.getWriter().write("对的<br/>");
        out.write("out2哈哈<br/>");
    %>



</body>
</html>
