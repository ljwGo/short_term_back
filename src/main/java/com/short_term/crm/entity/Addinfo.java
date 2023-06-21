package com.short_term.crm.entity;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 * @author 东软集团
 * @since 2023-06-19
 */
public class Addinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String addrno;

    private String aname;

    private String preaddrno;

    public List<Addinfo> getChildren() {
        return children;
    }

    public void setChildren(List<Addinfo> children) {
        this.children = children;
    }

    private List<Addinfo> children;

    public String getAddrno() {
        return addrno;
    }

    public void setAddrno(String addrno) {
        this.addrno = addrno;
    }
    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }
    public String getPreaddrno() {
        return preaddrno;
    }

    public void setPreaddrno(String preaddrno) {
        this.preaddrno = preaddrno;
    }

    @Override
    public String toString() {
        return "Addinfo{" +
            "addrno=" + addrno +
            ", aname=" + aname +
            ", preaddrno=" + preaddrno +
        "}";
    }
}
