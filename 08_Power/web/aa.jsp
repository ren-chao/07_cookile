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
    <link rel="stylesheet" href="css/layui.css">
    <title>Title</title>
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">layui 管理布局</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <li class="layui-nav-item"><a href="">控制台</a></li>
            <li class="layui-nav-item"><a href="">商品管理</a></li>
            <li class="layui-nav-item"><a href="">用户</a></li>
            <li class="layui-nav-item">
                <a href="javascript:;">其它系统</a>
                <dl class="layui-nav-child">
                    <dd><a href="">邮件管理</a></dd>
                    <dd><a href="">消息管理</a></dd>
                    <dd><a href="">授权管理</a></dd>
                </dl>
            </li>
        </ul>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
                    贤心
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="">基本资料</a></dd>
                    <dd><a href="">安全设置</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="">退了</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree"  lay-filter="test">

                        <c:forEach items="${requestScope.zhi}" var="i">
                            <li class="layui-nav-item layui-nav-itemed">
                            <c:if test="${i.type==1}">
                                <a class="" href="javascript:;">${i.mbth}</a>

                        <dl class="layui-nav-child">
                                    <c:forEach items="${requestScope.zhi}" var="j">
                                        <c:if test="${i.id==j.fatherid}">
                                             <dd><a href="javascript:void(0)" onclick="demo('${j.function}',${j.id})">${j.name}</a></dd>
                                        </c:if>
                                    </c:forEach>
                        </dl>
                            </c:if>
                            </li>
                        </c:forEach>


                    <%--</dl>--%>
                <li class="layui-nav-item"><a href="">云市场</a></li>
                <li class="layui-nav-item"><a href="">发布商品</a></li>
            </ul>
        </div>
    </div>

    <div class="layui-body" id="di">
        <!-- 内容主体区域 -->
        <%--<div style="padding: 15px;" id="di"></div>--%>
        <c:forEach var="j" items="${chazhi}">
            ${j.mbth}
        </c:forEach>
    </div>
    <table id="demo" lay-filter="test"></table>
   <%-- <div class="layui-footer">
        <!-- 底部固定区域 -->
        © layui.com - 底部固定区域
    </div>--%>
</div>
<script src="lay/layui.js"></script>
<script src="js/jquery-1.7.2.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });


    function  demo(name,id) {
        var item={
            action:"cha",
            id:id
        }
        $(".layui-body").load(name +" .layui-body>*",item);
    }
</script>
<script src="js/userList.js"></script>
</body>
</html>