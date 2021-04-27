<%--
  Created by IntelliJ IDEA.
  User: WRC
  Date: 2021/1/9
  Time: 9:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="js/jquery-1.7.2.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="div"></div>
<a herf="javascript:void" onclick="demo()">点我一下</a>
<input type="text" id="text">
<input type="submit" value="提交" id="ti">
<script>
    demo();
    var i;
    function  demo() {
        var rand = parseInt(Math.random()*3);
        var img=["<img src='img/2.jpg' class='2' width='50px>","<img src='img/3.jpg' class='3' width='50px'>","<img src='img/1.jpg' class='1' width='50px'>"];
        $("div").html(img[rand]);
        i=$("img").attr('class');
    }


    $("#ti").click(function () {
        if(i==$("#text").val()){

            alert("成功")
        }else{

            alert("失败")
        }
    })


</script>
</body>
</html>
