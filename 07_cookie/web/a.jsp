<%--
  Created by IntelliJ IDEA.
  User: WRC
  Date: 2021/1/21
  Time: 12:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p haha="520"></p>
<a href="cookie?action=ce">点我</a>
<%--<a href="javascript:void(0)">asda</a>--%>
        <%--<script src="js/jquery-1.7.2.js"></script>--%>
    <%--<script>--%>
        <%--$("a").click(function () {--%>
            <%--alert($("p").attr("haha"));--%>
        <%--});--%>

    <%--</script>--%>
<h1>${header.Connection}</h1>
<h1>${header.Cookie]}</h1>
<h1>${headerValues["User-Agent"][1]}</h1>
</body>
</html>
