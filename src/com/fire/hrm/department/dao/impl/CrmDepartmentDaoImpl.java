package com.fire.hrm.department.dao.impl;

import com.fire.hrm.department.dao.CrmDepartmentDao;
import com.fire.hrm.department.domain.CrmDepartment;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

/**
 * Created by admin on 2016/11/7.
 * 部门DAO的实现类
 */
public class CrmDepartmentDaoImpl extends HibernateDaoSupport implements CrmDepartmentDao {

    @Override
    public void addCrmDepartment(CrmDepartment crmDepartment) {
        getHibernateTemplate().save(crmDepartment);
    }

    @Override
    public void deleteCrmDepartment(String depId) {
        getHibernateTemplate().delete("com.fire.hrm.department.domain.CRMDepartment", depId);
    }

    @Override
    public void updateCrmDepartment(CrmDepartment crmDepartment) {
        getHibernateTemplate().update(crmDepartment);
    }

    @Override
    public CrmDepartment findCrmDepartment(String depId) {
        CrmDepartment crmDepartment = getHibernateTemplate().get(CrmDepartment.class, depId);
        return crmDepartment;
    }
}
