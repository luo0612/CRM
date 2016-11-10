package com.fire.hrm.department.service.impl;

import com.fire.hrm.department.dao.CrmDepartmentDao;
import com.fire.hrm.department.domain.CrmDepartment;
import com.fire.hrm.department.service.CrmDepartmentService;

/**
 * Created by admin on 2016/11/7.
 */
public class CrmDepartmentServiceImpl implements CrmDepartmentService {

    private CrmDepartmentDao crmDepartmentDao;

    public void setCrmDepartmentDao(CrmDepartmentDao crmDepartmentDao) {
        this.crmDepartmentDao = crmDepartmentDao;
    }

    @Override
    public void addCRMDepartment(CrmDepartment crmDepartment) {
        crmDepartmentDao.addCrmDepartment(crmDepartment);
    }


}
