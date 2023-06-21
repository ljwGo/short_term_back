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
public class Sysinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "sysno", type = IdType.AUTO)
    private Integer sysno;

    private String title;

    private String path;

    private Integer presysno;

    private Integer roleno;

    private Integer odb;

    public Integer getSysno() {
        return sysno;
    }

    public void setSysno(Integer sysno) {
        this.sysno = sysno;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    public Integer getPresysno() {
        return presysno;
    }

    public void setPresysno(Integer presysno) {
        this.presysno = presysno;
    }
    public Integer getRoleno() {
        return roleno;
    }

    public void setRoleno(Integer roleno) {
        this.roleno = roleno;
    }
    public Integer getOdb() {
        return odb;
    }

    public void setOdb(Integer odb) {
        this.odb = odb;
    }

    @Override
    public String toString() {
        return "Sysinfo{" +
            "sysno=" + sysno +
            ", title=" + title +
            ", path=" + path +
            ", presysno=" + presysno +
            ", roleno=" + roleno +
            ", odb=" + odb +
        "}";
    }
}
