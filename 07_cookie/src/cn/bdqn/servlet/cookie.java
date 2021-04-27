package cn.bdqn.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chao
 * @create 2021-01-18 17:13
 */
public class cookie extends baseservlet {
    protected void createcookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie=new Cookie("key1","value1");
        resp.getWriter().write("cookie创建成功");
        resp.addCookie(cookie); // 告诉客户端保存数据
        Cookie cookie2=new Cookie("key2","value2");
        resp.addCookie(cookie2); // 告诉客户端保存数据
    }
    protected void getcookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        for (Cookie cookie : cookies) {
            System.out.println(cookie.getName()+"="+cookie.getValue());
        }
    }
    protected void pathcookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie=new Cookie("path1","path1");
        cookie.setPath( req.getContextPath() );
        resp.addCookie(cookie);
        //
        Cookie cookie2=new Cookie("path2","path2");
        cookie2.setPath(req.getContextPath()+"/abc");
        resp.addCookie(cookie2);
        resp.getWriter().write("创建了一个带有path的路径");
    }
    protected void iscookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("我爱出生地");
       if ("123456".equals(req.getParameter("username")) && "123456".equals(req.getParameter("password"))){
            Cookie cookie=new Cookie("username","123456");
            cookie.setMaxAge(20);
            resp.addCookie(cookie);
            resp.sendRedirect("g.jsp");
        }else{
           System.out.println("失败");
           req.setAttribute("pan","验证失败");
           resp.sendRedirect("g.jsp?zhi=a");
        }

    }
    protected void delcookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie key5 = cookieutils.getc("key5", req.getCookies());
        if (key5 != null){
            key5.setMaxAge(0);
            resp.addCookie(key5);
            resp.getWriter().write("key4 的 Cookie 已经被删除");
        }
    }
    protected void ce(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getRequestURI());
        System.out.println(req.getRequestURL());
        //req.getRequestDispatcher("/a.jsp").forward(req,resp);
        resp.sendRedirect(req.getContextPath()+"/a.jsp");
        System.out.println(req.getHeader("Referer"));
    }

    protected void timecookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie=new Cookie("key5","value5");
        cookie.setMaxAge(60*60);
        resp.addCookie(cookie);
    }
    protected void updatecookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Cookie cookie=new Cookie("key2","newvalue2");
//        resp.addCookie(cookie);
//        resp.getWriter().write("已经更改了");
        Cookie[] cookies = req.getCookies();
        Cookie key1 = cookieutils.getc("key1", cookies);
        if (key1==null){
            System.out.println("666");
        }
        if (key1 != null){
            System.out.println(key1.getName());
            key1.setValue("sjkdfj");
            resp.addCookie(key1);
            resp.getWriter().write("已经更改了");

        }
    }

}
