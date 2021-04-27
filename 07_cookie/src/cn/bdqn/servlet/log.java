package cn.bdqn.servlet;

import cn.bdqn.dao.abc;
import cn.bdqn.dao.deng;
import cn.bdqn.dao.ea;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author chao
 * @create 2021-03-29 16:51
 */
public class log extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          String username=request.getParameter("username");
          String password=request.getParameter("password");
            deng de=new deng();
             abc admin = de.login(username, password);
            List<ea> zhi = de.zhi(admin.getId());
            request.setAttribute("zhi",zhi);
            request.getRequestDispatcher("aa.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request,response);
    }
}
