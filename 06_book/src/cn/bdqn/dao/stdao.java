package cn.bdqn.dao;

import cn.bdqn.entity.book;
import org.apache.ibatis.annotations.Param;
import org.junit.Test;

import java.awt.print.Book;
import java.util.List;

/**
 * @author chao
 * @create 2021-01-11 15:24
 */
public interface stdao {
    /**
     *
     * @param book  需要添加的对象
     * @return 添加
     */
    public  int add(book bo);
    public int dele(int id);
    public int updat(book bo);
    public  book b(int id);
    public List<book> b1();
    public  int count();
    public  List<book> dang(@Param("pa") int pa, @Param("page") int pag);
    public  int pricecount(int max,int min);
    public  List<book> pricecountitem(int pa,int pag,int max,int min);

}
