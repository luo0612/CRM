package com.fire.hrm.post.domain;

import com.fire.hrm.department.domain.CrmDepartment;
import com.fire.hrm.staff.domain.CrmStaff;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by admin on 2016/11/7.
 * 职务表
 */
public class CrmPost {
    private String postId;
    private String postName;
    private CrmDepartment department;
    private Set<CrmStaff> staffs = new HashSet<>();

    public CrmDepartment getDepartment() {
        return department;
    }

    public void setDepartment(CrmDepartment department) {
        this.department = department;
    }

    public Set<CrmStaff> getStaffs() {
        return staffs;
    }

    public void setStaffs(Set<CrmStaff> staffs) {
        this.staffs = staffs;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }


}
