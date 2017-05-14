package com.ivivisoft.strategy.template;

/**
 * Created by andy on 2017/5/14.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface(){
        strategy.algorithmInterface();
    }
}
