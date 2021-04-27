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
      <%
          String num=request.getParameter("user");

              if (num.equals("a")) {
                  Cookie cookie = new Cookie("num", num);
                  cookie.setMaxAge(3000);
                  response.addCookie(cookie);
                  out.print(cookie.getName());
                 response.sendRedirect("we.jsp");
          }else {
              out.print(20);
              response.sendRedirect("index.jsp");
          }

      %>
  </body>
</html>
