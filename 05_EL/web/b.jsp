<%--
  Created by IntelliJ IDEA.
  User: WRC
  Date: 2021/1/4
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   ${ param.a }<br>
输出请求的参数${paramValues.b[0]}<br>
输出请求头user-agent${header['User-Agent']}<br>
   输出请求头user-agent${header.Connection}<br>
  输出${header['Accept-Language']}<br>
获取cookie${ cookie.JSESSIONID.name }<br>
   获取cookie${ cookie.JSESSIONID.value }<br>
    获取配置文件${initParam.namespace}
</body>
</html>
