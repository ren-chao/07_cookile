package com.bdqn.servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadBase;
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
 * @create 2021-01-05 15:36
 */
public class uploading extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        FileItemFactory file=new DiskFileItemFactory();
        ServletFileUpload ser=new ServletFileUpload(file);

        DiskFileItemFactory factory=new DiskFileItemFactory();
        factory.setSizeThreshold(1024);
        factory.setRepository(new File("E:\\A"));
        ServletFileUpload upload=new ServletFileUpload(factory);
        upload.setSizeMax(1024);


//        DiskFileItemFactory factory=new DiskFileItemFactory();
//        factory.setSizeThreshold(1024);//设置临时的缓冲文件大小为10
//        factory.setRepository(new File("E:\\abcd"));//设置临时文件的目录
//        ServletFileUpload upload=new ServletFileUpload(factory);
//        upload.setSizeMax(2048);//字节B

        try {
        if(ServletFileUpload.isMultipartContent(request)){


                List<FileItem> list=upload.parseRequest(request);
                for (FileItem fileItem : list) {
                    if (fileItem.isFormField()){
                        System.out.println("普通类型的名称是"+fileItem.getFieldName());
                        System.out.println("普通类型的值是"+fileItem.getString());
                    }else{
//                        if(fileItem.getName()!=null && !fileItem.getName().equals("")){
//                            System.out.println("不是普通"+fileItem.getSize());
//                            fileItem.write(new File("E:\\A\\"+fileItem.getName()));
//                        }
                     }
                }
                }else{
                     response.getWriter().print("你是使用多段格式请重试");
                 }
            }catch (FileUploadBase.SizeLimitExceededException e) {
                response.getWriter().println("上传文件大小超过限制！最大20KB");
                 System.out.println("666");
            } catch (Exception e) {
                e.printStackTrace();
            }




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
