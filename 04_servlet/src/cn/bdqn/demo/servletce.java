package cn.bdqn.demo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chao
 * @create 2020-12-30 11:27
 */
public class servletce extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int key = Integer.parseInt(request.getParameter("key"));
        int i=1;
    if(key<=3 && key>=1){

    request.setAttribute("num",key);
    i=key;
    System.out.println(i);
    }else {
    i=1;
    request.setAttribute("num",i);
    System.out.println(i);
}
        request.getRequestDispatcher("c.jsp").forward(request,response);
    }
}
