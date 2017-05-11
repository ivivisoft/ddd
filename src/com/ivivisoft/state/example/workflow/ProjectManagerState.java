package com.ivivisoft.state.example.workflow;

import java.util.Scanner;

/**
 * Created by andy on 2017/5/11.
 */
public class ProjectManagerState implements LeaveRequestState {
    @Override
    public void doWork(StateMachine ctx) {
        LeaveRequestModel lrm = (LeaveRequestModel) ctx.getBusinessVO();
        System.out.println("项目经理审核中，请稍后。。。");
        //模拟用户处理界面，通过控制台来读取数据"
        System.out.println(lrm.getUser() + "申请从" + lrm.getBeginDate() + "开始请假" + lrm.getLeaveDays() + "天，请项目经理审核（1为同意，2为不同意）");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            int a = scanner.nextInt();
            String result = "不同意";
            if (a == 1) {
                result = "同意";
                if (lrm.getLeaveDays() > 3) {
                    ctx.setState(new DepManagerState());
                } else {
                    ctx.setState(new AuditOverState());
                }
            } else {
                ctx.setState(new AuditOverState());
            }
            lrm.setResult("项目经理审核的结果是：" + result);
            ctx.doWork();
        }
    }
}
