layui.use(['layer','laydate'],function () {
    var lay = layui.layer;
    $("#bu").on("click", function () {
        /*lay.msg("666我的宝贝")*layer*/
        /*layer layer.open({
             type: 1,
             content: $("#bu") //这里content是一个普通的String
         });*/

        /*  layer.open({
              type: 2,
              skin:'layui-layer-lan',
              title:"标题文本",
              content: 'index2.jsp' ,//这里content是一个URL，
              // 如果你不想让iframe出现滚动条，你还可以content: ['http://sentsin.com', 'no']
              content:['index2.jsp','no'],
             /!* area:'auto'*!/
             /!* offset: 'rt'*!/

          });*/
        /* lay.alert('酷毙了', {icon: 5});*/
        /* lay.msg('不开心。。', {icon: 3});*/
        /* lay.load(0)加载层*/


        layer.open({
            type: 1,
            skin: 'layui-layer-lan',
            title: "标题文本",
            content: 'index2.jsp',//这里content是一个URL，
             btn: ['按钮一', '按钮二', '按钮三'],
            closeBtn:1,//关闭按钮的样式  也就是x
            btnAlign: 'c',
           /* shade: [0.8, '#258'],*/
            shade: 0,
            shadeClose:false,
            time:5000,
            id:"",
            anim: 4,
            isOutAnim:true,
            fixed:true,
            resizing: function(layero){
                console.log(layero);
            }

            ,yes: function(index, layero){
            //按钮【按钮一】的回调
               lay.msg(1)
                alert(index)
        }
        ,btn2: function(index, layero){
            //按钮【按钮二】的回调
                lay.msg(2)
                alert(index)
                alert(layero.val("666"))
            return false //开启该代码可禁止点击该按钮关闭
        }
    ,btn3: function(index, layero){
            //按钮【按钮三】的回调
                lay.msg(3)
            //return false 开启该代码可禁止点击该按钮关闭
        }
    ,cancel: function(){
            //右上角关闭回调
                lay.msg("滚逼了")
            //return false 开启该代码可禁止点击该按钮关闭
        }
        })

    })
})