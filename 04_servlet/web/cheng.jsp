<%--
  Created by IntelliJ IDEA.
  User: WRC
  Date: 2020/12/26
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--System.out.print();--%>
<table align="center">
        <% for (int i=1;i<=9;i++){%>
<tr>
                   <% for (int j=1;j<=i;j++){%>
                <td><%=j+" * "+i+" = "+(j*i)+"\t"%>&nbsp;</td>

        <% }%>
</tr>
    <% }%>
</table>

</body>
</html>
