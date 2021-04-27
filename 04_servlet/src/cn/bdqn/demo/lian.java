package cn.bdqn.demo;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;


/**
 * @author chao
 * @create 2020-12-22 17:27
 */
public class lian {


    private static DruidDataSource dataSource=null;



    static {
        Properties pro=new Properties();
        InputStream re = lian.class.getClassLoader().getResourceAsStream("jdbc.properties");
        try {
            pro.load(re);
             dataSource =(DruidDataSource)DruidDataSourceFactory.createDataSource(pro);
            System.out.println(dataSource.getConnection());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static Connection getconn(){
        Connection conn=null;
        try {
            conn=dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  conn;
    }


    public  static void   close(Connection conn){
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(lian.getconn());
    }

}
