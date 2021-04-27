package cn.bdqn.demo;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * @author chao
 * @create 2021-01-09 10:24
 */
public class basstest  {
    public static void main(String[] args) {
        String  num="今天天气很好";
         BASE64Encoder base64Encoder=new BASE64Encoder();
        try {
            String encodedString = base64Encoder.encode(num.getBytes("UTF-8"));
            System.out.println(encodedString);

            BASE64Decoder base64Decoder=new BASE64Decoder();
            byte[] bytes = base64Decoder.decodeBuffer(encodedString);
            System.out.println(bytes);
            String zhi=new String(bytes,"UTF-8");
            System.out.println(zhi);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
