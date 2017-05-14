package com.ivivisoft.strategy.example;

/**
 * Created by andy on 2017/5/14.
 */
public class Price {
    private Strategy strategy;

    public Price(Strategy strategy) {
        this.strategy = strategy;
    }

    public double quote(double goodsPrice) {
        return this.strategy.calcPrice(goodsPrice);
    }
}
