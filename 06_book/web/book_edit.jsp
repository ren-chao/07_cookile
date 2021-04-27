<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>编辑图书</title>

	<%-- 静态包含 base标签、css样式、jQuery文件 --%>


	<style type="text/css">
	h1 {
		text-align: center;
		margin-top: 200px;
	}
	
	h1 a {
		color:red;
	}
	
	input {
		text-align: center;
	}
</style>
</head>
<body>

		<div id="header">
			<img class="logo_img" alt="" src="../../static/img/logo.gif" >
			<span class="wel_word">编辑图书</span>

			<%-- 静态包含 manager管理模块的菜单  --%>
			<%--<%--%>
				<%--pageContext.setAttribute("num","666");--%>
				<%--pageContext.setAttribute("num1","666");--%>
			<%--%>--%>
		</div>
		<%@ include file="can.jsp" %>
		<div id="main">
			<form action="add" method="get">
				<input type="hidden" name="pageNo" value="${param.num}">
                <h1>${pageScope.num1}</h1>
				<input type="hidden" name="action" value="${ empty param.id ? "add" : "update" }" />
				<input type="hidden" name="id" value="${ requestScope.book.id }" />
				<table>
					<tr>
						<td>名称</td>
						<td>价格</td>
						<td>作者</td>
						<td>销量</td>
						<td>库存</td>
						<td colspan="2">操作</td>
					</tr>
                    <%--this.id = id;--%>
                    <%--this.name = name;--%>
                    <%--this.author = author;--%>
                    <%--this.price = price;--%>
                    <%--this.sales = sales;--%>
                    <%--this.stock = stock;--%>
                    <%--this.imgpath = imgpath;--%>
					<tr>
						<td><input name="name" type="text" value="${requestScope.book.name}"/></td>
						<td><input name="price" type="text" value="${requestScope.book.price}"/></td>
						<td><input name="author" type="text" value="${requestScope.book.author}"/></td>
						<td><input name="seles" type="text" value="${requestScope.book.sales}"/></td>
						<td><input name="stock" type="text" value="${requestScope.book.stock}"/></td>
						<td><input type="submit" value="提交"/></td>
					</tr>	
				</table>
			</form>
		</div>

		<%--静态包含页脚内容--%>

</body>
</html>