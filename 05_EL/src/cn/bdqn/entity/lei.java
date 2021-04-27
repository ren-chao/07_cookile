package cn.bdqn.entity;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @author chao
 * @create 2021-01-11 13:55
 */
public class lei {
    public  static  <T> T zhu(Map map,T ben){


        try {
            BeanUtils.populate(ben,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return  ben;

    }


}
