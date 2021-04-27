package cn.bdqn.demo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chao
 * @create 2020-12-21 15:04
 */
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          // request.getRequestDispatcher("/a/b/c.html").forward(request,response);
//            System.out.println("aa  ");
//                request.setCharacterEncoding("utf-8");
           // response.setContentType("text/html; charset=UTF-8");
//             System.out.println("客户端 ip 地址 => " + request.getRemoteHost());
//             PrintWriter writer = response.getWriter();
//            writer.write("哈哈哈，w是大傻子");
                //String num = response.getCharacterEncoding();
                //System.out.println(num);
                 System.out.println("servlet到此一游");
                 response.sendRedirect("http://www.baidu.com");
    }
}
