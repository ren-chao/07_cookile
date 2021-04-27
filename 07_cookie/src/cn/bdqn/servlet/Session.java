package cn.bdqn.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author chao
 * @create 2021-01-19 11:52
 */
public class Session extends baseservlet {
    protected void setattribute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      request.getSession().setAttribute("session1","valuesession1");
      response.getWriter().write("值已经保存了");
    }
    protected void getattribute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Object session1 = request.getSession().getAttribute("session1");
        response.getWriter().write("存储的数据为"+session1);
    }
    protected void createsession(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String id = session.getId();
        boolean aNew = session.isNew();
        response.getWriter().write("session的id为"+id+"<br />");
        response.getWriter().write("session是第一次创建的吗"+aNew+"<br />");
    }

    protected void defaulttime(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int maxInactiveInterval = request.getSession().getMaxInactiveInterval();
        response.getWriter().write(""+maxInactiveInterval);
        System.out.println(maxInactiveInterval);
    }
    protected void defaulttime1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().setMaxInactiveInterval(3);
        System.out.println("session3秒后消失");
    }
    protected void defaulttime2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().invalidate();
        System.out.println("session消失");
    }
    protected void cookiesession(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        response.getWriter().write("session的ID为"+session.getId());
        System.out.println(request.getContextPath());
        response.sendRedirect(request.getContextPath());
    }
}
