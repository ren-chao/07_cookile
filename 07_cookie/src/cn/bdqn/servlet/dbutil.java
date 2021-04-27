package cn.bdqn.servlet;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author chao
 * @create 2021-01-11 14:57
 */
public class dbutil {

    static {

        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static Connection getConnection(){
        Connection connection=null;
        try {
             connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/easybuy","root","123456");
            System.out.println(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return  connection;
    }


}
