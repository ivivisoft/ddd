package com.ivivisoft.strategy.example;

/**
 * Created by andy on 2017/5/14.
 */
public class LargeCustomerStrategy implements Strategy {
    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("对于大客户，统一折扣10%");
        return goodsPrice * (1 - 0.1);
    }
}
