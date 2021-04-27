package cn.dqqn.dao;

import com.alibaba.fastjson.JSON;
import util.PrintUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @author chao
 * @create 2021-03-29 16:51
 */
@WebServlet("/l")
public class log extends Abservlet {



    public void se(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      /*  String username=request.getParameter("username");
        String password=request.getParameter("password");
        deng de=new deng();
        abc admin = de.login(username, password);
        List<ea> zhi = de.zhi(admin.getId());
        if (admin.getId()>0){
            request.setAttribute("zhi",zhi);
            request.setAttribute("id1",admin.getId());
            request.getRequestDispatcher("aa.jsp").forward(request,response);
        }else{
            response.sendRedirect("index.jsp");
        }*/
        /*System.out.println(request.getParameter("action"));*/

       /* response.sendRedirect("userlist.jsp");*/
       ea e=new ea();
       e.setId(6);

        PrintWriter out =response.getWriter();
        String s = JSON.toJSONString(e);
        out.print(s);
    }

    public void cha(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        deng de=new deng();
        String id = request.getParameter("id");
        int id1=Integer.parseInt(id);
        List<ea> chazhi = de.chazhi(id1);
        System.out.println(chazhi);
        request.setAttribute("chazhi",chazhi);
        request.getRequestDispatcher("aa.jsp").forward(request,response);
    }


    public void biao(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        deng de=new deng();
        List<ea> listea = de.listea();
        layui layui=new layui();
        layui.setCode(0);
        layui.setCount(listea.size());
        layui.setMsg("");
        layui.setData(listea);
        PrintUtil.write(layui, response);
    }

}
