<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WRC
  Date: 2021/1/11
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="js/jquery-1.7.2.js"></script>
  </head>
  <body>
    <table border="1px solid red" cellpadding="0px" cellspacing="0px">
        <tr>
          <td>编号</td>
          <td>书名</td>
          <td>作者</td>
          <td>价格</td>
          <td>销量</td>
          <td>库存</td>
        </tr>
      <C:forEach items="${book.items}" var="book" varStatus="sta">
        <tr>
          <td>${sta.index+1}</td>
          <td>${book.name}</td>
          <td>${book.author}</td>
          <td>${book.price}</td>
          <td>${book.seles}</td>
          <td>${book.stock}</td>
        </tr>
      </C:forEach>
    </table>
    <%
      pageContext.setAttribute("num","666");
    %>
    <div id="page_nav">
      <C:if test="${requestScope.book.pageNo>1}">
      <a href="${requestScope.book.url}&pageNo=${1}">首页</a>
      <a href="${requestScope.book.url}&pageNo=${requestScope.book.pageNo-1}" id="top">上一页</a>
      </C:if>

        <C:choose>
          <%--小于五的情况下--%>
          <C:when test="${requestScope.book.pageTotal<=10}">
            <C:set var="begin" value="1"></C:set>
            <C:set var="end" value="${requestScope.book.pageTotal}"></C:set>
          </C:when>
              <%--大于5的情况下--%>
              <C:when test="${requestScope.book.pageTotal>10}">
                <C:choose>
                  <%--//1--%>
                  <C:when test="${requestScope.book.pageNo<=6}">
                    <C:set var="begin" value="1"></C:set>
                    <C:set var="end" value="10"></C:set>
                  </C:when>
                  <%--//2--%>
                  <C:when test="${requestScope.book.pageNo>requestScope.book.pageTotal-3}">
                    <C:set var="begin" value="${requestScope.book.pageTotal-9}"></C:set>
                    <C:set var="end" value="${requestScope.book.pageTotal}"></C:set>
                  </C:when>
                  <%--//3--%>
                  <C:otherwise>
                    <C:set var="begin" value="${requestScope.book.pageNo-5}"></C:set>
                    <C:set var="end" value="${requestScope.book.pageNo+4}"></C:set>
                  </C:otherwise>
                </C:choose>



          </C:when>
        </C:choose>
      <C:forEach begin="${begin}"  var="i" end="${end}">
        <C:if test="${i!=requestScope.book.pageNo}">
          <a href="${requestScope.book.url}&pageNo=${i}">${i}</a>
        </C:if>
        <C:if test="${i==requestScope.book.pageNo}">
          【${i}】
        </C:if>
      </C:forEach>



      <C:if test="${requestScope.book.pageNo<requestScope.book.pageTotal}">
      <a href="${requestScope.book.url}&pageNo=${requestScope.book.pageNo+1}">下一页</a>
      <a href="${requestScope.book.url}&pageNo=${requestScope.book.pageTotal}">末页</a>
      </C:if>
        共${requestScope.book.pageTotal}页，${requestScope.book.pageTotalCount}条记录 到第<input  tepe="text" value="${requestScope.book.pageNo}" id="num"/>页
        <input type="submit" value="确定" onclick="demo()">
    </div>
    <a href="book_edit.jsp?num=${requestScope.book.pageTotal}">添加图书</a>
    <form action="se" method="get">
      <input type="hidden" name="action1" value="price">
    最大<input type="text" name="min" value="${param.min}">
    <span>-</span>
    最小<input type="text" name="max" value="${param.max}">
    <input type="submit"value="提交">
    </form>
<%
  String z=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
  pageContext.setAttribute("z",z);
%>
  <script>
    function demo() {
        var num=$("#num").val();
        alert(num)
        location.href="${z}/se?zhi="+num;
    }

    
    function ti() {
        location.href="http://localhost:8080/06_book/se?action1=price";
    }
  </script>

  </body>
</html>
