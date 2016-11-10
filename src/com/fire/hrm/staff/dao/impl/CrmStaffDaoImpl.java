package com.fire.hrm.staff.dao.impl;

import com.fire.hrm.staff.dao.CrmStaffDao;
import com.fire.hrm.staff.domain.CrmStaff;
import com.fire.utils.MD5Utils;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by admin on 2016/11/8.
 */
public class CrmStaffDaoImpl extends HibernateDaoSupport implements CrmStaffDao {

    @Override
    public void addCrmStaff(CrmStaff crmStaff) {
        //添加员工
        getHibernateTemplate().save(crmStaff);
    }

    @SuppressWarnings("JpaQlInspection")
    @Override
    public CrmStaff findCrmStaff(CrmStaff crmStaff) {
        //查询员工
        //使用HQL语句
        //from CrmStaff where loginName=? and loginPwd = ?
        String hql = "FROM com.fire.hrm.staff.domain.CrmStaff WHERE loginName=? AND loginPwd=?";
        //TODO 对密码进行MD5加密
        String password = MD5Utils.md5(crmStaff.getLoginPwd());
        List<CrmStaff> list = (List<CrmStaff>) getHibernateTemplate().find(hql, crmStaff.getLoginName(), password);

        if (list.size() == 1) {
            //说明符合条件的员工
            return list.get(0);
        }
        //说明没有符合条件的员工
        return null;
    }

    @Override
    public List<CrmStaff> findAllCrmStaff() {
        //查询所有的员工
        String hql = "FROM com.fire.hrm.staff.domain.CrmStaff";
        List<CrmStaff> crmStaffs = (List<CrmStaff>) getHibernateTemplate().find(hql);
        return crmStaffs;
    }
}
