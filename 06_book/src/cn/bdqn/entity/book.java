package cn.bdqn.entity;

import java.math.BigDecimal;

/**
 * @author chao
 * @create 2021-01-11 15:25
 */
public class book {

    private int id;
    private String name;
    private String author;

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getSeles() {
        return sales;
    }

    public void setSeles(int seles) {
        this.sales = seles;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    private BigDecimal price;
    private  int sales;
    private  int stock;
    private  String imgpath;

    @Override
    public String toString() {
        return "book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", sales=" + sales +
                ", stock=" + stock +
                ", imgpath='" + imgpath + '\'' +
                '}';
    }

    public book(int id, String name, String author, BigDecimal price, int sales, int stock, String imgpath) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
        this.sales = sales;
        this.stock = stock;
        this.imgpath = imgpath;
    }

    public book() {

    }
}
