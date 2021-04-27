<%--
  Created by IntelliJ IDEA.
  User: WRC
  Date: 2021/3/30
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="l?action=se" method="post">
    账号:<input type="text" name="username" id="username"><br>
    密码:<input type="password" name="password"><br>
    <input type="button" value="登录">
  </form>
  <button onclick="demo()">点我一下</button>
  </body>

<script>
function  demo() {
    var xhl=new XMLHttpRequest();
    xhl.open("POST","http://localhost:8080/08_Power/l?action=se");
    xhl.send('name=100,age=123');
    xhl.responseType='json';

    xhl.onreadystatechange=function (ev) {
        if(xhl.readyState === 4 ){
           /* console.log(xhl.readyState)
            console.log(xhl.response)*/
           console.log(xhl.response)
         /*  var data=JSON.parse(xhl.response);*/
       /*    console.log(data)*/
          /*  $("#username").val(xhl.response)*/
       /*   document.getElementById("#username").valueOf(xhl.response)*/
        }

    }
}

  

</script>
</html>
