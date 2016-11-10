package com.fire.hrm.staff.dao;

import com.fire.hrm.staff.domain.CrmStaff;

import java.util.List;

/**
 * Created by admin on 2016/11/8.
 */
public interface CrmStaffDao {

    /**
     * 添加员工
     *
     * @param crmStaff
     */
    void addCrmStaff(CrmStaff crmStaff);

    /**
     * 查询用户
     *
     * @param crmStaff
     */
    CrmStaff findCrmStaff(CrmStaff crmStaff);

    /**
     * 查询所有的员工
     *
     * @return
     */
    List<CrmStaff> findAllCrmStaff();
}
