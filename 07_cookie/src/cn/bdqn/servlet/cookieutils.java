package cn.bdqn.servlet;

import javax.servlet.http.Cookie;

/**
 * @author chao
 * @create 2021-01-18 21:17
 */
public class cookieutils {

    public static Cookie getc(String name,Cookie[] cookies){
        if (name == null ||  cookies==null || cookies.length==0){
            return null;
        }

        for (Cookie cookie : cookies) {
            if (name.equals(cookie.getName())){
                return  cookie;
            }
        }

        return null;
    }
}
