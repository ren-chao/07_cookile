<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WRC
  Date: 2021/1/8
  Time: 13:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%--<base href="localhost:8080/05_EL/a.jsp">--%>
    <base href="http://localhost:8080/07_cookie/g.jsp">
</head>
<a>
<script src="js/jquery-1.7.2.js"></script>
    <form action="cookie?action=iscookie" method="post">

        账号:<input type="text" name="username"  value="${cookie.username.value}"><br>
        密码:<input type="password" name="password"><br>
            <input type="submit" value="提交" onclick="demo()">
    </form>
<p>${param.zhi}</p>
    <a href="g.jsp"/>条</a>
<c:if test="${!empty cookie.username.value}">
   <jsp:forward page="pan?name=${cookie.username.value}"></jsp:forward>
</c:if>
<script>
    //location.href="http://localhost:8080/07_cookie/g.jsp";
</script>
</body>
</html>
