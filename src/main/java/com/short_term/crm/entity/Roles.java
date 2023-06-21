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
public class Roles implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "roleno", type = IdType.AUTO)
    private Integer roleno;

    private String info;

    private String rname;

    private Boolean nbl;

    public Integer getRoleno() {
        return roleno;
    }

    public void setRoleno(Integer roleno) {
        this.roleno = roleno;
    }
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }
    public Boolean getNbl() {
        return nbl;
    }

    public void setNbl(Boolean nbl) {
        this.nbl = nbl;
    }

    @Override
    public String toString() {
        return "Roles{" +
            "roleno=" + roleno +
            ", info=" + info +
            ", rname=" + rname +
            ", nbl=" + nbl +
        "}";
    }
}
