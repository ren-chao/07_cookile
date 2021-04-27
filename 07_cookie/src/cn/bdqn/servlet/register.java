package cn.bdqn.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chao
 * @create 2021-01-19 17:07
 */
public class register extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if ("zhu".equals(request.getParameter("action"))) {
            request.getSession().invalidate();
            response.sendRedirect(request.getContextPath());
        } else {
            String username = request.getParameter("username");
            if ("123456".equals(username)) {
                request.getSession().setAttribute("username", username);
                response.sendRedirect("index.jsp");
            } else {
                response.sendRedirect("index.jsp");
            }
            // request.getRequestDispatcher("index.jsp").forward(request,response);
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request,response);
    }
}
