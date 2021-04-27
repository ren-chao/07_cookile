package cn.bdqn.servlet;

import com.google.code.kaptcha.Constants;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chao
 * @create 2021-01-19 20:06
 */
public class yan extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.setCharacterEncoding("utf-8");
            response.setContentType("text/html;charset=utf-8");
            String attribute =(String)request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
            request.getSession().removeAttribute(Constants.KAPTCHA_SESSION_KEY);
            if ((attribute != null) && attribute.equalsIgnoreCase(request.getParameter("yan"))){
                System.out.println("成功");
                response.getWriter().write("欢迎王董");
            }else {
                System.out.println("失败");
            }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
