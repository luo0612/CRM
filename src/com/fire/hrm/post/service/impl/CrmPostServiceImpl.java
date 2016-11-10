package com.fire.hrm.post.service.impl;

import com.fire.hrm.post.dao.CrmPostDao;
import com.fire.hrm.post.domain.CrmPost;
import com.fire.hrm.post.service.CrmPostService;

/**
 * Created by admin on 2016/11/10.
 */
public class CrmPostServiceImpl implements CrmPostService {
    private CrmPostDao mCrmPostDao;

    public void setCrmPostDao(CrmPostDao crmPostDao) {
        mCrmPostDao = crmPostDao;
    }

    @Override
    public void addCrmPost(CrmPost crmPost) {
        mCrmPostDao.addCrmPost(crmPost);
    }
}
