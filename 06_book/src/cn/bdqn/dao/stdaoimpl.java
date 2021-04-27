package cn.bdqn.dao;

import cn.bdqn.entity.book;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author chao
 * @create 2021-01-11 15:30
 */
public class stdaoimpl extends BaseDao implements  stdao {
    @Override
    public int add(book bo) {
        String sql="INSERT INTO t_book(`name` , `author` , `price` , `sales` , `stock` , `img_path`)values(?,?,?,?,?,?) ";
        return update(sql,bo.getName(),bo.getAuthor(),bo.getPrice(),bo.getSeles(),bo.getStock(),"123");
    }

    @Override
    public int dele(int id) {
        return 0;
    }

    @Override
    public int pricecount(int min, int max) {
        String sql="SELECT COUNT(*)  FROM t_book WHERE  price BETWEEN   ? AND ?";
        Number number = (Number)this.queryForSingleValue(sql,min,max);
        return  number.intValue();
    }

    @Override
    public List<book> pricecountitem(int pa, int pag, int min, int max) {
        String sql="select `id` , `name` , `author` , `price` , `sales` , `stock` , `img_path` imgpath" +
                "  from t_book where price between ? and ? order by price limit ?,?";
        System.out.println(max+"+"+min+"+"+pa+"+"+pag);
        System.out.println(pa);
        return queryForList(book.class,sql,min,max,pa,pag);
    }

    @Override
    public int updat(book bo) {
        return 0;
    }

    @Override
    public int count() {
        String sql="select count(*) from t_book";
       Number number = (Number)this.queryForSingleValue(sql);
       return  number.intValue();
    }

    @Override
    public List<book> dang(int pa,int page) {
        Map<String,Object> map=new HashMap<>();
        map.put("pa",pa);
        map.put("page",page);
        SqlSessionFactory sqlSessionFactory = MyBatiUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<book> dang = sqlSession.getMapper(stdao.class).dang(pa,page);
        return dang;
    }

    @Override
    public book b(int id) {
        String sql="select `id` , `name` , `author` , `price` , `sales` , `stock` , `img_path` imgpath  from t_book where id=?";
        return queryForOne(book.class,sql,id);
    }

    @Override
    public List<book> b1() {
        String sql="select * from t_book";
        return queryForList(book.class,sql);
    }
}
