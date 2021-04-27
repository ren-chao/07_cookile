package cn.bdqn.test;

/**
 * @author chao
 * @create 2021-03-27 22:38
 */
public class ExceptionTest {

    public static void main(String[] args) {
        /*F*//*ile file = new File("hello.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/

/*
        Connection connection = dbutil.getConnection();
        System.out.println(connection);*/


      /*  deng de=new deng();
        *//*abc admin = de.login("admin", "123456");
        System.out.println(admin.getId());*//*
        List<ea> z = de.zhi(10);
        System.out.println(z);
        for(ea i:z){
            System.out.println(i);
        }*/
        diao d=new diao();
        try {
            d.num(-10);
        } catch (cn.bdqn.test.yi yi) {
            System.out.println(yi.getMessage());
        }
    }
}
