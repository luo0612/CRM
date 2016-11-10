package com.fire.hrm.test;

import com.fire.hrm.department.domain.CrmDepartment;
import com.fire.hrm.department.service.CrmDepartmentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

/**
 * Created by admin on 2016/11/7.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
public class DepartmentTest {

    @Autowired
    private CrmDepartmentService mCRMDepartmentService;

    @Test
    public void testAdd() {
        UUID uuid = UUID.randomUUID();
        CrmDepartment crmDepartment = new CrmDepartment();
        crmDepartment.setDepId(uuid.toString());
        crmDepartment.setDepName("财务部");
        mCRMDepartmentService.addCRMDepartment(crmDepartment);
    }

}
