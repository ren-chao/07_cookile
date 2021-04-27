package cn.bdqn.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chao
 * @create 2021-02-19 14:21
 */
public class Config extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletConfig servletConfig;

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("这个别名是"+servletConfig.getServletName());
        System.out.println("初始化参数 username 的值是"+ servletConfig.getInitParameter("namespace"));
    }
}
