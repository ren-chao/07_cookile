<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="cn.bdqn.demo.Student" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: WRC
  Date: 2021/1/5
  Time: 14:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--foreach--%>
<%
    Map<String,Object> map=new HashMap<String, Object>();
    for (int i = 1; i <=10 ; i++) {
        map.put("key"+i,new Student(i,"username"+i,"password"+i,"age"+i,"address"+i));
    }
    request.setAttribute("list",map);
%>
    <table cellspacing="0" cellpadding="0" border="1px solid">
        <tr>
            <td>编号</td>
            <td>昵称</td>
            <td>密码</td>
            <td>年龄</td>
            <td>地址</td>
        </tr>
        <c:forEach items="${list}" var="map" begin="0" end="5" varStatus="status">
            <tr>
                <td>${map.value.id}</td>
                <td>${map.value.username}</td>
                <td>${map.value.password}</td>
                <td>${map.value.age}</td>
                <td>${status.end}</td>
            </tr>
        </c:forEach>
        <tr>

            <td>哈哈哈</td>
        </tr>
        <c:forEach items="${list}" var="map1" begin="7"  end="6" varStatus="status">
            <tr>
                <td>${map1.value.id}</td>
                <td>${map1.value.username}</td>
                <td>${map1.value.password}</td>
                <td>${map1.value.age}</td>
                <td>${status.end}</td>
            </tr>
        </c:forEach>

    </table>

</body>
</html>
