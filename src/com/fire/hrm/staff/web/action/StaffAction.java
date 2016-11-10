package com.fire.hrm.staff.web.action;

import com.fire.hrm.staff.domain.CrmStaff;
import com.fire.hrm.staff.service.CrmStaffService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.util.List;

/**
 * Created by admin on 2016/11/8.
 */
public class StaffAction extends ActionSupport implements ModelDriven<CrmStaff> {
    /**
     * 员工
     */
    private CrmStaff mCrmStaff = new CrmStaff();

    @Override
    public CrmStaff getModel() {
        return mCrmStaff;
    }

    private CrmStaffService mCrmStaffService;

    public void setCrmStaffService(CrmStaffService crmStaffService) {
        this.mCrmStaffService = crmStaffService;
    }

    //-------------------------------------------------------上面是公共的-------------------------------------------------------------

    /**
     * 登录的方法
     *
     * @return
     */
    public String login() {
        CrmStaff crmStaff = mCrmStaffService.login(mCrmStaff);
        if (crmStaff != null) {
            //登录成功
            //因为在登录成功之后,在后续所有的操作都需要用到用户对象
            //所以将用户对象放入到Session中
            //登录成功进行重定向,在xml文件中进行配置
            ActionContext.getContext().getSession().put("staff", crmStaff);
            return SUCCESS;
        }
        //说明用户名和密码不匹配
        this.addFieldError("", "用户名和密码不匹配");
        return "login";
    }

    /**
     * 跳转到主界面的方法
     *
     * @return
     */
    public String home() {
        return "home";
    }

    /**
    * 查询所有的员工
     *
     * @return
     */
    public String findAll() {
        List<CrmStaff> allCrmStaff = mCrmStaffService.findAllCrmStaff();
        return "findAll";
    }

}
