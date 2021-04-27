package cn.bdqn.text;

import cn.bdqn.dao.stdao;
import cn.bdqn.dao.stdaoimpl;
import cn.bdqn.entity.book;

import java.util.List;

/**
 * @author chao
 * @create 2021-01-11 15:15
 */
public class conn {
    public static void main(String[] args) {
        stdao stdao=new stdaoimpl();
        //int id, String name, String author, BigDecimal price, int sales, int stock, String imgpath
        //stdao.add(new book(1,"1","1",new BigDecimal(30),1,1,"1"));
//        for (book book : stdao.b1()) {
//            System.out.println(book);
//        }
     /*   System.out.println("666");
        for (book book : stdao.pricecountitem(1, 4, 20, 80)) {
            System.out.println(book);
        }*/

       /* SqlSessionFactory sqlSessionFactory =   MyBatiUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<book> books = sqlSession.getMapper(stdao.class).b1();
        System.out.println(books);*/
        List<book> dang = stdao.dang(1, 2);
        System.out.println(dang);
    }
}
