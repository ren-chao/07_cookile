package cn.bdqn.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author chao
 * @create 2021-02-26 17:09
 */
public class MyBatiUtils {
    public  static  SqlSessionFactory getSqlSessionFactory(){
        String resource = "mybatis-config.xml";
        try {
            InputStream inputStream= Resources.getResourceAsStream(resource);
            return new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
