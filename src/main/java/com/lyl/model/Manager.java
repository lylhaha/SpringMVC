package com.lyl.model;

import java.io.Serializable;

public class Manager implements Serializable {
    private Integer managerid;

    private String managername;

    private String managerpassword;

    private static final long serialVersionUID = 1L;

    public Integer getManagerid() {
        return managerid;
    }

    public void setManagerid(Integer managerid) {
        this.managerid = managerid;
    }

    public String getManagername() {
        return managername;
    }

    public void setManagername(String managername) {
        this.managername = managername;
    }

    public String getManagerpassword() {
        return managerpassword;
    }

    public void setManagerpassword(String managerpassword) {
        this.managerpassword = managerpassword;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Manager other = (Manager) that;
        return (this.getManagerid() == null ? other.getManagerid() == null : this.getManagerid().equals(other.getManagerid()))
            && (this.getManagername() == null ? other.getManagername() == null : this.getManagername().equals(other.getManagername()))
            && (this.getManagerpassword() == null ? other.getManagerpassword() == null : this.getManagerpassword().equals(other.getManagerpassword()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getManagerid() == null) ? 0 : getManagerid().hashCode());
        result = prime * result + ((getManagername() == null) ? 0 : getManagername().hashCode());
        result = prime * result + ((getManagerpassword() == null) ? 0 : getManagerpassword().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", managerid=").append(managerid);
        sb.append(", managername=").append(managername);
        sb.append(", managerpassword=").append(managerpassword);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}