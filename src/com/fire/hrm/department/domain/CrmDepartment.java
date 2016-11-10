package com.fire.hrm.department.domain;

import com.fire.hrm.post.domain.CrmPost;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by admin on 2016/11/7.
 * 部门表
 */
public class CrmDepartment implements Serializable {
    private String depId;
    private String depName;
    private Set<CrmPost> posts;

    public Set<CrmPost> getPosts() {
        return posts;
    }

    public void setPosts(Set<CrmPost> posts) {
        this.posts = posts;
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }
}
