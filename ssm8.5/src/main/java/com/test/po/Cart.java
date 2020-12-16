package com.test.po;

public class Cart {
    private Integer cartid;

    private Integer pid;

    private String pname;

    private Integer count;

    private String aliimage;

    private Integer uid;

    private Float price;

    private Integer limitum;

    private String checked;

    public Integer getCartid() {
        return cartid;
    }

    public void setCartid(Integer cartid) {
        this.cartid = cartid;
    }

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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getAliimage() {
        return aliimage;
    }

    public void setAliimage(String aliimage) {
        this.aliimage = aliimage == null ? null : aliimage.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getLimitum() {
        return limitum;
    }

    public void setLimitum(Integer limitum) {
        this.limitum = limitum;
    }

    public String getChecked() {
        return checked;
    }

    public void setChecked(String checked) {
        this.checked = checked == null ? null : checked.trim();
    }
}