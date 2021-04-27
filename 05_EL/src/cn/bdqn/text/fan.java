package cn.bdqn.text;

import java.lang.reflect.Method;

/**
 * @author chao
 * @create 2021-01-10 11:53
 */
public class fan {
    public  void a(){
        System.out.println("a");
    }
    public  void b(){
        System.out.println("b");
    }

    public static void main(String[] args) {

    String zhi="a";
        try {
            Method declaredMethod = fan.class.getDeclaredMethod(zhi);
            System.out.println(declaredMethod);
            declaredMethod.invoke(new fan());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
