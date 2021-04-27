package cn.bdqn.dao;

/**
 * @author chao
 * @create 2021-03-29 16:54
 */
public class ea {
    private int id;
    private  String name;
    private  int fatherid;
    private  int type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFatherid() {
        return fatherid;
    }

    public void setFatherid(int fatherid) {
        this.fatherid = fatherid;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ea{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fatherid=" + fatherid +
                ", type=" + type +
                ", mbth='" + mbth + '\'' +
                '}';
    }

    public String getMbth() {
        return mbth;
    }

    public void setMbth(String mbth) {
        this.mbth = mbth;
    }

    private String mbth;




}
