package com.fire.hrm.staff.domain;

import com.fire.hrm.post.domain.CrmPost;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by admin on 2016/11/7.
 */
public class CrmStaff {

    private String staffId;
    private String loginName;
    private String loginPwd;
    private String staffName;
    private String gender;
    private Date onDutyDate;

    private Set<CrmPost> posts = new HashSet<>();

    public Set<CrmPost> getPosts() {
        return posts;
    }

    public void setPosts(Set<CrmPost> posts) {
        this.posts = posts;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getOnDutyDate() {
        return onDutyDate;
    }

    public void setOnDutyDate(Date onDutyDate) {
        this.onDutyDate = onDutyDate;
    }


}
