package cn.bdqn.dao;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chao
 * @create 2020-12-09 13:55
 */
public class contextServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("520");
        System.out.println(request.getParameter("action"));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
               ServletContext context=getServletConfig().getServletContext();
                System.out.println("context的值为"+context.getInitParameter("namespace"));
                System.out.println("当前文件的工程路径为"+context.getContextPath());
             System.out.println("当前文件的全部工程路径为"+context.getRealPath("/"));
        System.out.println("当前文件的全部工程路径为"+context.getRealPath("/css/1.css"));
        System.out.println("重定向后的参数值"+request.getParameter("action"));
        System.out.println("获取参数");
    }
}
