package cn.bdqn.demo;

import java.util.List;
import java.util.Map;

/**
 * @author chao
 * @create 2020-12-30 15:22
 */
public class Er {

    private   String a;
    private  String[]b;
    private List<String> list;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String[] getB() {
        return b;
    }

    public void setB(String[] b) {
        this.b = b;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, Object> getMap() {

        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    private Map<String,Object> map;
}
