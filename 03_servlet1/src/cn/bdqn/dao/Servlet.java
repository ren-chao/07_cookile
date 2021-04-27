package cn.bdqn.dao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chao
 * @create 2020-12-12 9:03
 */
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request.getMethod());
        System.out.println("客户端 ip 地址 => " + request.getRemoteHost());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println(request.getMethod());
//        System.out.println("客户端 ip 地址 => " + request.getRemoteHost());
//        System.out.println("客户端 ip 地址 => " + request.getRequestURL());
//        System.out.println("Hello苏志军");
        System.out.println("获取请求的资源路径"+request.getRequestURI());
        System.out.println("获取请求的绝对路径"+request.getRequestURL());
        System.out.println("获取客户端的ip地址"+request.getRemoteHost());
        System.out.println("获取请求头"+request.getHeader("Accept"));
        System.out.println("获取请的参数"+request.getParameter("name"));
    }
}
