package com.test.po;

public class Products {
    private Integer pid;

    private String pname;

    private String pnametitle;

    private Float price;

    private String aliimage;

    private Integer limitnum;

    private Integer cid;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public String getPnametitle() {
        return pnametitle;
    }

    public void setPnametitle(String pnametitle) {
        this.pnametitle = pnametitle == null ? null : pnametitle.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getAliimage() {
        return aliimage;
    }

    public void setAliimage(String aliimage) {
        this.aliimage = aliimage == null ? null : aliimage.trim();
    }

    public Integer getLimitnum() {
        return limitnum;
    }

    public void setLimitnum(Integer limitnum) {
        this.limitnum = limitnum;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
}