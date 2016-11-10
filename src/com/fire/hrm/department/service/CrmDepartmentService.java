package com.fire.hrm.department.service;

import com.fire.hrm.department.domain.CrmDepartment;

import java.util.List;

/**
 * Created by admin on 2016/11/7.
 */
public interface CrmDepartmentService {
    /**
     * 添加部门
     *
     * @param crmDepartment
     */
    void addCRMDepartment(CrmDepartment crmDepartment);

    /**
     * 查询所有的部门
     *
     * @return
     */
    List<CrmDepartment> findAllCrmDepartment();

    /**
     * 更新部门
     *
     * @param crmDepartment
     */
    void updateCrmDepartment(CrmDepartment crmDepartment);
}
