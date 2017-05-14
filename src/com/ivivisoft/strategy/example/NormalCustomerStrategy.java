package com.ivivisoft.strategy.example;

/**
 * Created by andy on 2017/5/14.
 */
public class NormalCustomerStrategy implements Strategy {
    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("对于新客户或者普通客户，没有折扣");
        return goodsPrice;
    }
}
