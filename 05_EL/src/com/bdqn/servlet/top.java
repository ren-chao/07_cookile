package com.bdqn.servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author chao
 * @create 2021-01-12 8:46
 */
public class top extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("charset=utf-8");
        if (ServletFileUpload.isMultipartContent(request)){
            FileItemFactory file=new DiskFileItemFactory();
            ServletFileUpload servletFileUpload=new ServletFileUpload(file);
            try {
                List<FileItem> list = servletFileUpload.parseRequest(request);
                for (FileItem fileItem : list) {
                    if(fileItem.isFormField()){
                        System.out.println("普通");
                    }else{
                        fileItem.write(new File("E:\\"+fileItem.getName()));
                    }



                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
