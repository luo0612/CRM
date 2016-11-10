package com.fire.hrm.test;

import com.fire.hrm.post.domain.CrmPost;
import com.fire.hrm.post.service.CrmPostService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

/**
 * Created by admin on 2016/11/10.
 * 职务测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
public class PostTest {
    @Autowired
    private CrmPostService mCrmPostService;

    @Test
    public void testAddCrmPost() {
        CrmPost crmPost = new CrmPost();
        crmPost.setPostId(UUID.randomUUID().toString());
        crmPost.setPostName("android工程师");
        mCrmPostService.addCrmPost(crmPost);
    }
}
