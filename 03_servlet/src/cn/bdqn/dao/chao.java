package cn.bdqn.dao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chao
 * @create 2020-12-09 16:31
 */

public class chao extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println(request.getMethod());
//        System.out.println(20);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(80);
        //response.sendRedirect(request.getContextPath()+"/ren?action=668");
        //response.sendRedirect("/ren?action=668");
        request.getRequestDispatcher("/ren").forward(request,response);
    }
}
