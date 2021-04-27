<%--
  Created by IntelliJ IDEA.
  User: WRC
  Date: 2020/12/8
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String name=request.getParameter("user");
    String pwd=request.getParameter("pwd");

if (name!=null){
    if(name.equals("a") && pwd.equals("123")){

        Integer a=(Integer)application.getAttribute("count");
        if(a==null){
            application.setAttribute("count",1);
        }else{
            application.setAttribute("count",(a+1));

        }
        session.setAttribute("user",name);
        response.sendRedirect("ce2.jsp");
    }else{
        response.sendRedirect("index.jsp");
    }

}



%>
</body>
</html>
