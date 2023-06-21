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
 * @since 2023-06-19
 */
public class Dept implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "deptno", type = IdType.AUTO)
    private Integer deptno;

    private String dname;

    private String loc;

    private Integer nbl;

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }
    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
    public Integer getNbl() {
        return nbl;
    }

    public void setNbl(Integer nbl) {
        this.nbl = nbl;
    }

    @Override
    public String toString() {
        return "Dept{" +
            "deptno=" + deptno +
            ", dname=" + dname +
            ", loc=" + loc +
            ", nbl=" + nbl +
        "}";
    }
}
