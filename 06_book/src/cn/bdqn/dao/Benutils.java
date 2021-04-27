package cn.bdqn.dao;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @author chao
 * @create 2021-01-15 9:38
 */
public class Benutils {
    public  static <T>  T pr(Map map,T t){
        try {
           BeanUtils.populate(t,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return  t;
    }


}
