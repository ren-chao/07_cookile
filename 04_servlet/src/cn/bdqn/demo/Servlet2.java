package cn.bdqn.demo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chao
 * @create 2020-12-21 15:04
 */
public class Servlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html; charset=UTF-8");
//        response.getWriter().write("今天天气不错");
        ServletContext ser =getServletConfig().getServletContext();
        System.out.println(ser.getRealPath("/"));
       // request.getRequestDispatcher("/c.jsp").forward(request,response);
        response.sendRedirect("/c.jsp");
    }
}
