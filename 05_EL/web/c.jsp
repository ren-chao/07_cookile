<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


保存之前是${pageScope.a}
<c:set scope="page" var="a" value="哈哈"></c:set>
保存之前是${pageScope.a}
<hr>

<c:if test="${1==1}">
    <h1>正确的情况</h1>
</c:if>
<hr>
<% pageContext.setAttribute("num",180); %>
<c:choose>
    <c:when test="${pageScope.num>190}">
        <h1>很高</h1>
    </c:when>
    <c:when test="${pageScope.num>=180}">
        <h1>还行</h1>
    </c:when>
    <c:when test="${pageScope.num>170}">
        <h1>还行吧</h1>
    </c:when>
    <c:otherwise>
        <h1>小于160</h1>
    </c:otherwise>



</c:choose>




<c:forEach begin="1" var="item" end="10">
    <h1>${item}</h1><br/>

</c:forEach>

<%
  request.setAttribute("zhi",new String[]{"张三","李四","王五"});
    //request.setAttribute("arr",new String[]{""});

%>
<c:forEach items="${requestScope.zhi}" var="i">

    <h2>${ i }</h2>

</c:forEach>



</body>
</html>
