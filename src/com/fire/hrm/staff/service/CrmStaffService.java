package com.fire.hrm.staff.service;

import com.fire.hrm.staff.domain.CrmStaff;

import java.util.List;

/**
 * Created by admin on 2016/11/8.
 */
public interface CrmStaffService {
    /**
     * 登录
     *
     * @param crmStaff
     */
    CrmStaff login(CrmStaff crmStaff);


    /**
     * 添加员工
     *
     * @param crmStaff
     */
    void addCrmStaff(CrmStaff crmStaff);

    /**
     * 查询所有的员工
     *
     * @return
     */
    List<CrmStaff> findAllCrmStaff();

    /**
     * 查询用户
     *
     * @param id
     * @return
     */
    CrmStaff findCrmStaff(String id);
}
