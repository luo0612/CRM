package com.fire.hrm.post.dao.impl;

import com.fire.hrm.post.dao.CrmPostDao;
import com.fire.hrm.post.domain.CrmPost;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

/**
 * Created by admin on 2016/11/10.
 */
public class CrmPostDaoImpl extends HibernateDaoSupport implements CrmPostDao {
    @Override
    public void addCrmPost(CrmPost crmPost) {
        getHibernateTemplate().save(crmPost);
    }
}
