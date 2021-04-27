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
    <base href="localhost:8080/05_EL/a.jsp">
</head>
<body>
    <form action="s" method="post">

        账号:<input type="text" name="username" ><br>
        密码:<input type="password" name="password"><br>
            <input type="submit" value="提交">
    </form>
<%

    Cookie[] cookies=request.getCookies();
    for (int i =0; i <cookies.length-2 ; i++) {
        System.out.println(cookies[i].getValue());
    }

    if(cookies!=null){
        System.out.println(cookies[1].getValue());
        response.sendRedirect("b.jsp");
    }
%>
</body>
</html>
