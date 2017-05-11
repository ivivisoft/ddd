package com.ivivisoft.state.example.workflow;

/**
 * Created by andy on 2017/5/11.
 */
public class Client {
    public static void main(String[] args) {
        LeaveRequestModel lrm = new LeaveRequestModel();
        lrm.setUser("小李");
        lrm.setBeginDate("2017-05-11");
        lrm.setLeaveDays(5);
        LeaveRequestContext request = new LeaveRequestContext();
        request.setBusinessVO(lrm);
        request.setState(new ProjectManagerState());
        request.doWork();
    }
}
