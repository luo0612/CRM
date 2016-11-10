package com.fire.hrm.staff.service.impl;

import com.fire.hrm.staff.dao.CrmStaffDao;
import com.fire.hrm.staff.domain.CrmStaff;
import com.fire.hrm.staff.service.CrmStaffService;

import java.util.List;

/**
 * Created by admin on 2016/11/8.
 */
public class CrmStaffServiceImpl implements CrmStaffService {

    private CrmStaffDao mCrmStaffDao;

    public void setCrmStaffDao(CrmStaffDao crmStaffDao) {
        mCrmStaffDao = crmStaffDao;
    }

    @Override
    public CrmStaff login(CrmStaff crmStaff) {
        CrmStaff staff = mCrmStaffDao.findCrmStaff(crmStaff);
        return staff;
    }

    @Override
    public void addCrmStaff(CrmStaff crmStaff) {
        mCrmStaffDao.addCrmStaff(crmStaff);
    }

    @Override
    public List<CrmStaff> findAllCrmStaff() {
        List<CrmStaff> allCrmStaff = mCrmStaffDao.findAllCrmStaff();
        return allCrmStaff;
    }
}
