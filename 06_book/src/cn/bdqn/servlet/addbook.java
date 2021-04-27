package cn.bdqn.servlet;

import cn.bdqn.dao.stdao;
import cn.bdqn.dao.stdaoimpl;
import cn.bdqn.entity.book;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * @author chao
 * @create 2021-01-15 9:34
 */
public class addbook extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("charset=utf-8");
       // book bo=Benutils.pr(request.getParameterMap(),new book());
            book book=new book();
         book.setName(request.getParameter("name"));
         book.setPrice(new BigDecimal(request.getParameter("price")));
         book.setAuthor(request.getParameter("author"));
         int num=Integer.parseInt(request.getParameter("seles"));
         book.setSeles(num);
         book.setStock(Integer.parseInt(request.getParameter("stock")));
         stdao st=new stdaoimpl();
            st.add(book);
        response.sendRedirect("se?zhi="+Integer.parseInt(request.getParameter("pageNo")+1));

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request,response);
    }




}
