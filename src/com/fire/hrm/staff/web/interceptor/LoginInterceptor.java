package com.fire.hrm.staff.web.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

/**
 * Created by admin on 2016/11/9.
 * 登录拦截器
 * 作用:<br/>
 * 1.当用户不通过登录表单进行登录访问主界面时,需要判断用户是否登录<br/>
 * 登录:直接访问主界面<br/>
 * 没有登录:跳转到登录界面
 */
public class LoginInterceptor extends MethodFilterInterceptor {
    @Override
    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
        Object staff = ActionContext.getContext().getSession().get("staff");
        if (staff == null) {
            //说明用户没有进行登录
            //1.获取当前运行的Action,此时Action已经在值栈中
            Object action = actionInvocation.getAction();
            //2.判断Action是否是ActionSupport
            if (action instanceof ActionSupport) {
                //2.增加提示信息
                ((ActionSupport) action).addFieldError("", "请登录");
            }
            return "login";
        }
        //说明用户已经登录
        return actionInvocation.invoke();
    }
}
