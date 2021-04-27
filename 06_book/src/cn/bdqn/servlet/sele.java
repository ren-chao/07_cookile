package cn.bdqn.servlet;

import cn.bdqn.dao.stdao;
import cn.bdqn.dao.stdaoimpl;
import cn.bdqn.dao.weutil;
import cn.bdqn.entity.page;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.print.Book;
import java.io.IOException;
import java.util.List;

/**
 * @author chao
 * @create 2021-01-13 13:47
 */
public class sele extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String actin=request.getParameter("action1");
        System.out.println("520"+actin);
        if("price".equals(actin)){
            chaprice(request,response);

        }else{
            cha(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    protected void cha(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        stdao st=new stdaoimpl();
        page page=new page();
        // int ye=weutil.paresInt(request.getParameter("shu"),page.getPAGE_SIZE());
        //设置当前页码
        int da;
        if(request.getParameter("pageNo")!=null & request.getParameter("pageNo")!=""){da=Integer.parseInt(request.getParameter("pageNo"));}else{da=1;}
        System.out.println("getparameter的值为"+request.getParameter("pageNo"));
        System.out.println("哈哈哈"+da);

        //设置每页数
        page.setPageSize(page.getPAGE_SIZE());
        //设置总记录数
        Integer count = st.count();
        page.setPageTotalCount(count);

        page.setPageTotal(count%page.getPageSize()>0?(count/page.getPageSize())+1:count/page.getPageSize());
        page.setPageNo(da);
        page.setItems(st.dang((page.getPageNo()-1)*1,page.getPageSize()));
        List<Book> items = page.getItems();
        //  System.out.println(page.getPageTotal());
        System.out.println("页数为"+page.getPageNo());
        page.setUrl("se?action1=cha");
        request.setAttribute("book",page);
        request.getRequestDispatcher("index.jsp").forward(request,response);


    }
    protected void chaprice(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        stdao st=new stdaoimpl();
        page page=new page();
        // int ye=weutil.paresInt(request.getParameter("shu"),page.getPAGE_SIZE());
        //设置当前页码
        int da;
        if(request.getParameter("pageNo")!=null){da=Integer.parseInt(request.getParameter("pageNo"));}else{da=1;}
        System.out.println("当前页是"+da);
        //设置每页数
        page.setPageSize(page.getPAGE_SIZE());
        //设置总记录数

        int max= weutil.paresInt(request.getParameter("max"),0);
        int min= weutil.paresInt(request.getParameter("min"),Integer.MAX_VALUE);
        Integer count = st.pricecount(min,max);
        page.setPageTotalCount(count);
        System.out.println("coutn"+count);
        page.setPageTotal(count%page.getPageSize()>0?(count/page.getPageSize())+1:count/page.getPageSize());
        page.setPageNo(da);
        System.out.println("当前页是1"+ page.getPageNo());
        //int pa, int pag, int min, int max
        System.out.println((page.getPageNo()-1)*page.getPageSize());
        page.setItems(st.pricecountitem((page.getPageNo()-1)*page.getPageSize(),page.getPageSize(),min,max));
        System.out.println("负数"+page.getPageNo());
        List<Book> items = page.getItems();
        StringBuffer str=new StringBuffer("se?action1=price");
        if (request.getParameter("min")!=null){
            str.append("&min=").append(request.getParameter("min"));
        }
        if(request.getParameter("max")!=null){
            str.append("&max=").append(request.getParameter("max"));
        }
        System.out.println(str);
        page.setUrl(str.toString());
            request.setAttribute("book",page);
            request.getRequestDispatcher("index.jsp").forward(request,response);


    }

}
