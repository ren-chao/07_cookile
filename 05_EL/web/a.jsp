<%--
  Created by IntelliJ IDEA.
  User: WRC
  Date: 2021/1/4
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setAttribute("req",request);

%>
${ req.scheme }
${pageContext.request.method}
<h1>我转发过来了</h1>
</body>
</html>
