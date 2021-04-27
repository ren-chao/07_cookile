package cn.bdqn.demo;

import java.sql.Connection;

/**
 * @author chao
 * @create 2020-12-22 20:17
 */
public class test {
    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            Connection conn=lian.getconn();
            System.out.println(conn);
            //lian.close(conn);
        }

        test test=new test();
        test.a("哈哈哈");
    }

    int i=0;
    /**
     * 哈哈简单介绍
     * @param name 是个值
     * @return 哲是一个哈哈哈
     */
    public  void a(String name){

    }
}
