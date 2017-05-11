package com.ivivisoft.state.example.workflow;

import lombok.Data;

/**
 * Created by andy on 2017/5/11.
 * 公开状态处理机
 */
@Data
public class StateMachine {
    private State state = null;
    private Object businessVO = null;
    public void doWork(){
        this.state.doWork(this);
    }
}
