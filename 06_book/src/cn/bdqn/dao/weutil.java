package cn.bdqn.dao;

import org.junit.Test;

/**
 * @author chao
 * @create 2021-01-13 14:59
 */
public class weutil {
    public  static  Integer paresInt(String name,int mo){

        int i = 0;
        try {
            i = Integer.parseInt(name);
            return i;
        } catch (Exception e) {
            //e.printStackTrace();
        }
        return mo;
    }

@Test
    public    void a(){
        weutil.paresInt("0",1);
    }
}
