<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WRC
  Date: 2021/1/18
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="re" method="post">
    账号:<input type="text" name="username"  value="${cookie.username.value}"><br>
    <input type="submit" value="提交">
  </form>
 <c:if test="${empty sessionScope.username}">
  <a href="s">登录</a>
  <a href="re">注册</a>
 </c:if>
  <c:if test="${not empty sessionScope.username}">
    <p>欢迎，${sessionScope.username}光临<span style="color: red">王氏集团</span></p>
      <a href="re?action=zhu">注销</a>
  </c:if>
  </body>
</html>
