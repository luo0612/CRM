package com.fire.hrm.test;

import com.fire.hrm.staff.domain.CrmStaff;
import com.fire.hrm.staff.service.CrmStaffService;
import com.fire.utils.MD5Utils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.UUID;

/**
 * Created by admin on 2016/11/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
public class StaffTest {
    @Autowired
    private CrmStaffService mCrmStaffService;

    @Test
    public void testAddCrmStaff() {
        CrmStaff staff = new CrmStaff();
        staff.setStaffId(UUID.randomUUID().toString());
        staff.setGender("男");
        staff.setLoginName("fire");
        staff.setLoginPwd("123");
        staff.setStaffName("root");
        staff.setOnDutyDate(new Date());

        mCrmStaffService.addCrmStaff(staff);
    }

    @Test
    public void testMD5() {
        String s = MD5Utils.md5("123");
        System.out.println(s);
    }
}
