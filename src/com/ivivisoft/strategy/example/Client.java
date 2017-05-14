package com.ivivisoft.strategy.example;

/**
 * Created by andy on 2017/5/14.
 */
public class Client {
    public static void main(String[] args) {
        Strategy strategy = new LargeCustomerStrategy();
        Price ctx = new Price(strategy);
        double quote = ctx.quote(1000);
        System.out.println("向客户报价：" + quote);
    }
}
