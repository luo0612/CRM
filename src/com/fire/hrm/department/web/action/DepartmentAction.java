package com.fire.hrm.department.web.action;

import com.fire.hrm.department.domain.CrmDepartment;
import com.fire.hrm.department.service.CrmDepartmentService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

import java.util.List;

/**
 * Created by admin on 2016/11/10.
 */
public class DepartmentAction extends ActionSupport implements ModelDriven<CrmDepartment> {
    private CrmDepartment mCrmDepartment = new CrmDepartment();

    @Override
    public CrmDepartment getModel() {
        return mCrmDepartment;
    }

    private CrmDepartmentService mCrmDepartmentService;

    public void setCrmDepartmentService(CrmDepartmentService crmDepartmentService) {
        mCrmDepartmentService = crmDepartmentService;
    }

    public String findAll() {
        List<CrmDepartment> allCrmDepartment = mCrmDepartmentService.findAllCrmDepartment();
        //1.获取所有的部门
        ActionContext.getContext().getValueStack().set("allCrmDepartment", allCrmDepartment);
        return "findAll";
    }

    public String editDepartment() {
        return "editDepartment";
    }

    public String updateDepartment() {
        mCrmDepartmentService.updateCrmDepartment(mCrmDepartment);
        return findAll();
    }

    /**
     * 验证修改部门
     */
    public void validateUpdateDepartment() {
        String depName = mCrmDepartment.getDepName();
        if (depName == null || depName.trim().isEmpty()) {
            ValueStack valueStack = ActionContext.getContext().getValueStack();
            valueStack.push(mCrmDepartment);
            this.addFieldError("", "部门不能为空");
        }

    }
}
