package com.ivivisoft.strategy.example;

/**
 * Created by andy on 2017/5/14.
 */
public class OldCustomerStrategy implements Strategy {
    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("对于老客户，统一折扣5%");
        return goodsPrice * (1 - 0.05);
    }
}
