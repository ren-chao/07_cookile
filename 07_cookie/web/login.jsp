<%--
  Created by IntelliJ IDEA.
  User: WRC
  Date: 2021/1/19
  Time: 20:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form action="yan" method="post">
    账号:<input type="text" name="username"  value="${cookie.username.value}"><br>
    密码:<input type="password" name="password"><br>
    验证码<input type="text" name="yan" id="">
    <img src="kap.jpg" id="yan"/><br /><a href="javascript:void(0)" onclick="demo()">点我更换</a>
    <input type="submit" value="提交">
</form>
<script src="js/jquery-1.7.2.js"></script>
<script>
        function  demo() {
            $("img").attr("src","kap.jpg");
        }
        $("#yan").click(function () {
            this.src="kap.jpg?da" + new Date();
        })
    
</script>
</body>
</html>
