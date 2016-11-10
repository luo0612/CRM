package com.fire.hrm.department.dao;

import com.fire.hrm.department.domain.CrmDepartment;

/**
 * Created by admin on 2016/11/7.
 */
public interface CrmDepartmentDao {
    /**
     * 添加部门
     *
     * @param crmDepartment
     */
    void addCrmDepartment(CrmDepartment crmDepartment);

    /**
     * 删除部门
     */
    void deleteCrmDepartment(String depId);

    /**
     * 修改部门
     *
     * @param crmDepartment
     */
    void updateCrmDepartment(CrmDepartment crmDepartment);

    /**
     * 查找部门
     */
    CrmDepartment findCrmDepartment(String depId);
}
