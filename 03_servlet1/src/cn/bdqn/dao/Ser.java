package cn.bdqn.dao;

import org.junit.Test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author chao
 * @create 2020-12-12 12:03
 */
public class Ser extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("用户的值"+req.getParameter("user"));
//        System.out.println("密码的值"+req.getParameter("pwd"));
//        String []num=req.getParameterValues("xue");
//        System.out.println("用户的爱好"+ Arrays.asList(num));

    }

    @Override
    @Test
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        System.out.println("密码的值"+req.getParameter("pwd"));

        System.out.println("用户的值"+req.getParameter("user"));
        System.out.println("密码的值"+req.getParameter("pwd"));
        String []num=req.getParameterValues("xue");
        System.out.println("用户的爱好"+ Arrays.asList(num));


    }

}
