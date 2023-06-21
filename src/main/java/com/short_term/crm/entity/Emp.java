package com.short_term.crm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 员工信息表
 * </p>
 *
 * @author 东软集团
 * @since 2023-06-19
 */
public class Emp implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "empno", type = IdType.AUTO)
    private Integer empno;

    private String ename;

    private String logid;

    private String logpwd;

    private String gender;

    private String job;

    private String tel;

    private String phone;

    private String remarks;

    private Integer roleid;

    private String area;

    private Integer status;

    private Integer deptno;

    private Integer mgr;

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }
    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }
    public String getLogid() {
        return logid;
    }

    public void setLogid(String logid) {
        this.logid = logid;
    }
    public String getLogpwd() {
        return logpwd;
    }

    public void setLogpwd(String logpwd) {
        this.logpwd = logpwd;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }
    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    @Override
    public String toString() {
        return "Emp{" +
            "empno=" + empno +
            ", ename=" + ename +
            ", logid=" + logid +
            ", logpwd=" + logpwd +
            ", gender=" + gender +
            ", job=" + job +
            ", tel=" + tel +
            ", phone=" + phone +
            ", remarks=" + remarks +
            ", roleid=" + roleid +
            ", area=" + area +
            ", status=" + status +
            ", deptno=" + deptno +
            ", mgr=" + mgr +
        "}";
    }
}
