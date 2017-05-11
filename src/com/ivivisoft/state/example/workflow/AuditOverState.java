package com.ivivisoft.state.example.workflow;

/**
 * Created by andy on 2017/5/11.
 */
public class AuditOverState implements State {
    @Override
    public void doWork(StateMachine ctx) {
        LeaveRequestModel lrm = (LeaveRequestModel) ctx.getBusinessVO();
        //业务处理，把审理结果保存到数据库中
        System.out.println(lrm.getUser() + ",你的请假申请已经审核结束，结果是：" + lrm.getResult());
    }
}
