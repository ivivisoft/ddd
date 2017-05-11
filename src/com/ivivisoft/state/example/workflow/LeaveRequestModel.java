package com.ivivisoft.state.example.workflow;

import lombok.Data;

/**
 * Created by andy on 2017/5/11.
 */
@Data
public class LeaveRequestModel {
    private String user;
    private String beginDate;
    private int leaveDays;
    //审核结果
    private String result;

}
