package cn.bdqn.dao;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chao
 * @create 2020-12-08 15:47
 */
public class hello2 extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("我动点手脚");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletConfig servletConfig=getServletConfig();
        String num=servletConfig.getServletName();
        String num1=servletConfig.getInitParameter("name");
        System.out.println("servlet的名称为"+num);
        System.out.println("servlet的初始化为"+num1);
        System.out.println("servlet的对象为为" + servletConfig.getServletContext());
        System.out.println("doget被访问了");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("dopost被访问了");
        ServletConfig servletConfig=getServletConfig();
        String num=servletConfig.getServletName();
        String num1=servletConfig.getInitParameter("name");
        System.out.println("servlet的名称为"+num);
        System.out.println("servlet的初始化为"+num1);
        System.out.println("servlet的对象为为" + servletConfig.getServletContext());


    }
}
