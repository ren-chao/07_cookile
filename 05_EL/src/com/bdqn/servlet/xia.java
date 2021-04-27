package com.bdqn.servlet;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author chao
 * @create 2021-01-08 16:22
 */
public class xia extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num="2.jpg";
        ServletContext servletContext = getServletContext();
        String mimeType = servletContext.getMimeType("/img/" + num);
        response.setContentType(mimeType);
        String header = request.getHeader("User-Agent");
        System.out.println(header);
        if(header.contains("Safari")){
            System.out.println("成功");
        }else{
            System.out.println("失败");
        }
       // response.setHeader("Content-Disposition","attachment; filename="+ URLEncoder.encode("美丽的女孩.jpg","UTF-8"));
        InputStream resourceAsStream = servletContext.getResourceAsStream("/img/" + num);
        System.out.println(resourceAsStream);
        OutputStream outputStream=response.getOutputStream();
        IOUtils.copy(resourceAsStream,outputStream);

    }
}
