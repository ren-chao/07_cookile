package cn.dqqn.dao;

import java.util.List;

/**
 * @author chao
 * @create 2021-03-29 16:33
 */
public class deng extends  BaseDao {
    public  abc login(String name,String pwd){
        String sql="SELECT id FROM `easybuy_user` WHERE loginName=? AND `password`=?";
        return queryForOne(abc.class,sql,name,pwd);
    }

    public List<ea> zhi(Integer id){
        String sql="SELECT * FROM ls_menu WHERE id IN(SELECT menuid FROM role WHERE userid=?)";
        return queryForList(ea.class,sql,id);
    }

    public  List<ea> chazhi(Integer id){
        String sql="SELECT * FROM ls_menu WHERE TYPE=3 AND  fatherid=? ";
        return  queryForList(ea.class,sql,id);
    }

    public  List<ea> listea(){
        String sql="SELECT * FROM ls_menu";
        return  queryForList(ea.class,sql);
    }
}
