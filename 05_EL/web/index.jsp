<%@ page import="cn.bdqn.demo.Er" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: WRC
  Date: 2020/12/30
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String num=request.getScheme()+"://"
    +request.getServerName()+":"
    +request.getServerPort()
    +request.getContextPath()+"/";


%>
<%=num%><br>
<html>
  <head>
    <titled>下载图片</titled>
  </head>
  <body>
        <%
            Er er=new Er();
            er.setA("超哥很帅");
            er.setB(new String[]{"6","7"});
            List<String> list=new ArrayList<>();
            list.add("张三");
            list.add("李四");
            list.add("王五");
            er.setList(list);

            Map<String,Object> map=new HashMap<>();
            map.put("a1","春天");
            map.put("2","夏天");
            map.put("3","秋天");
            map.put("4","冬天");
            er.setMap(map);
            pageContext.setAttribute("e",er);
        %>
  输出er:${e}<br/>
  输出er的a${e.a}<br/>
  输出er的b${e.b[1]}<br/>
  输出er的list${e.list[0]}
  输出er的map${e.map.a1}
  输出耳的mao${e.map["3"]}


  </body>
</html>
