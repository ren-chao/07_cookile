<%--
  Created by IntelliJ IDEA.
  User: WRC
  Date: 2020/12/8
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%><%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <form  action="chao" method="get">
    <p>账号:<input type="text" name="user"></p>
    <p>密码:<input type="password" name="pwd"></p>
    <p><input type="submit" name="user" value="提交"></p>
  </form>
  <h1>${empty requestScope.book ?"ok":"no"}</h1>
  <h1>${empty requestScope.book}</h1>
  </body>
</html>
