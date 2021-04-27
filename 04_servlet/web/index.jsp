<%--
  Created by IntelliJ IDEA.
  User: WRC
  Date: 2020/12/21
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isErrorPage="true"
%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  $END$

    <%!
        private  String name;
        private  int id;

    %>

    <%!
      class a{
          public  void  cha(){

          }

      }

    %>
    <%
        int i=1;
        if(i==1){%>
            <h1>超哥很帅</h1>

      <%  }else{%>
        <h1>真的很帅</h1>
        <%}%>

    <td><c:if></c:if></td>

  pageContext的值为:<%=pageContext.getAttribute("key")%><br/>
  request的值为:<%=request.getAttribute("key")%><br/>
  session的值为:<%=session.getAttribute("key")%><br/>
  application的值为:<%=application.getAttribute("key")%><br/>
  <%--<%@include file="/s.jsp"%>--%>
  <%--<%@ include file="/s.jsp"%>--%>
  <%--<jsp:include page="/s.jsp">--%>
      <%--<jsp:param name="username" value="666"></jsp:param>--%>
      <%----%>
  <%--</jsp:include>--%>
  <jsp:forward page="s.jsp"/>
  </body>
</html>
