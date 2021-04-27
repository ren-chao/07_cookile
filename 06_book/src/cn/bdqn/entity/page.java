package cn.bdqn.entity;

import java.util.List;

/**
 * @author chao
 * @create 2021-01-13 14:55
 */
public class page<T> {
    private final  int PAGE_SIZE=4;
    private Integer pageNo; // 总页码
     private Integer pageTotal; // 当前页显示数量
    private Integer pageSize = PAGE_SIZE; // 总记录数
    private Integer pageTotalCount; // 当前页数据
    private List<T> items;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public  String url;
    public int getPAGE_SIZE() {
        return PAGE_SIZE;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        if (pageNo<0){
            pageNo=1;
        }

//        if (pageNo>pageTotal){
//            pageNo=pageTotal;
//        }
        System.out.println("我进来了");
        this.pageNo = pageNo;

    }

    public Integer getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageTotalCount() {
        return pageTotalCount;
    }

    public void setPageTotalCount(Integer pageTotalCount) {
        this.pageTotalCount = pageTotalCount;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }
}
