package cn.bdqn.dao;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author chao
 * @create 2020-12-08 14:52
 */
public class Hello implements Servlet {
    public Hello() {
        System.out.println("构造方法");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("只行初始化方法");
        String num=servletConfig.getServletName();
        String num1=servletConfig.getInitParameter("name");
        System.out.println("servlet的名称为"+num);
        System.out.println("servlet的初始化为"+num1);
        System.out.println("servlet的对象为为" + servletConfig.getServletContext());
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
       // System.out.println("servlet被访问了");
        HttpServletRequest httpServletRequest=(HttpServletRequest) servletRequest;
        String num=httpServletRequest.getMethod();
       if (num.equals("GET")){
           System.out.println("get被访问了");
       }else if (num.equals("POST")){
           System.out.println("post被访问了");
       }
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("销毁方法");
    }
}
