<%--
  Created by IntelliJ IDEA.
  User: WRC
  Date: 2021/1/5
  Time: 12:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        pageContext.getResponse().getWriter().println("我爱你美丽的姑娘");


    %>
    获取 Cookie 的名称：${ cookie.JSESSIONID.name } <br>
    获取 Cookie 的名称：${ cookie.JSESSIONID.value } <br>
    ${pageContext.request.scheme}
</body>
</html>
