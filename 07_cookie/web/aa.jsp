<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WRC
  Date: 2021/1/21
  Time: 12:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${requestScope.zhi}" var="i">
            <c:if test="${i.type==1}">
                ${i.mbth}
                <c:forEach items="${requestScope.zhi}" var="j">
                        <c:if test="${i.type==j.fatherid}">
                            ${j.mbth}
                        </c:if>
                </c:forEach>
            </c:if>
    </c:forEach>
</body>
</html>
