package com.lyl.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Integer userid;

    private String username;

    private String userpassword;

    private String useremail;

    private String usernickname;

    private Date userbirthday;

    private Integer sex;

    private Integer userpoints;

    private String userremark;

    private static final long serialVersionUID = 1L;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getUsernickname() {
        return usernickname;
    }

    public void setUsernickname(String usernickname) {
        this.usernickname = usernickname;
    }

    public Date getUserbirthday() {
        return userbirthday;
    }

    public void setUserbirthday(Date userbirthday) {
        this.userbirthday = userbirthday;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getUserpoints() {
        return userpoints;
    }

    public void setUserpoints(Integer userpoints) {
        this.userpoints = userpoints;
    }

    public String getUserremark() {
        return userremark;
    }

    public void setUserremark(String userremark) {
        this.userremark = userremark;
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
        User other = (User) that;
        return (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getUserpassword() == null ? other.getUserpassword() == null : this.getUserpassword().equals(other.getUserpassword()))
            && (this.getUseremail() == null ? other.getUseremail() == null : this.getUseremail().equals(other.getUseremail()))
            && (this.getUsernickname() == null ? other.getUsernickname() == null : this.getUsernickname().equals(other.getUsernickname()))
            && (this.getUserbirthday() == null ? other.getUserbirthday() == null : this.getUserbirthday().equals(other.getUserbirthday()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getUserpoints() == null ? other.getUserpoints() == null : this.getUserpoints().equals(other.getUserpoints()))
            && (this.getUserremark() == null ? other.getUserremark() == null : this.getUserremark().equals(other.getUserremark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getUserpassword() == null) ? 0 : getUserpassword().hashCode());
        result = prime * result + ((getUseremail() == null) ? 0 : getUseremail().hashCode());
        result = prime * result + ((getUsernickname() == null) ? 0 : getUsernickname().hashCode());
        result = prime * result + ((getUserbirthday() == null) ? 0 : getUserbirthday().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getUserpoints() == null) ? 0 : getUserpoints().hashCode());
        result = prime * result + ((getUserremark() == null) ? 0 : getUserremark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", username=").append(username);
        sb.append(", userpassword=").append(userpassword);
        sb.append(", useremail=").append(useremail);
        sb.append(", usernickname=").append(usernickname);
        sb.append(", userbirthday=").append(userbirthday);
        sb.append(", sex=").append(sex);
        sb.append(", userpoints=").append(userpoints);
        sb.append(", userremark=").append(userremark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}