package com.short_term.crm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 东软集团
 * @since 2023-06-20
 */
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "productno", type = IdType.AUTO)
    private Integer productno;

    private String pno;

    private String pname;

    private String minicode;

    private String url;

    private Integer price;

    private String keyword;

    private Boolean onsale;

    private Integer dictno;

    public Integer getProductno() {
        return productno;
    }

    public void setProductno(Integer productno) {
        this.productno = productno;
    }
    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }
    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }
    public String getMinicode() {
        return minicode;
    }

    public void setMinicode(String minicode) {
        this.minicode = minicode;
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
    public Boolean getOnsale() {
        return onsale;
    }

    public void setOnsale(Boolean onsale) {
        this.onsale = onsale;
    }
    public Integer getDictno() {
        return dictno;
    }

    public void setDictno(Integer dictno) {
        this.dictno = dictno;
    }

    @Override
    public String toString() {
        return "Product{" +
            "productno=" + productno +
            ", pno=" + pno +
            ", pname=" + pname +
            ", minicode=" + minicode +
            ", url=" + url +
            ", price=" + price +
            ", keyword=" + keyword +
            ", onsale=" + onsale +
            ", dictno=" + dictno +
        "}";
    }
}
