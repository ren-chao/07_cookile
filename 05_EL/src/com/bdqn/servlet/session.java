package com.bdqn.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chao
 * @create 2021-01-08 13:54
 */
public class session extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


            if (request.getParameter("username").equals("123") && request.getParameter("password").equals("123")){
                Cookie cookie = new Cookie("key", "value");
                cookie.setMaxAge(15);
                cookie.setPath("/");
                response.addCookie(new Cookie("username",request.getParameter("password")));
                response.addCookie(new Cookie("password",request.getParameter("password")));

            }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
