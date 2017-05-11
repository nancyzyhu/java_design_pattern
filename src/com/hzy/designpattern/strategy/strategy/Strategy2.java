package com.hzy.designpattern.strategy.strategy;

/**
 * Created by huzhaoyu on 2017/5/11.
 */
public class Strategy2 implements BaseStrategy {
    private double rate = 1;

    public Strategy2(double rate) {
        this.rate = rate;
    }

    @Override
    public double actualSuperMoney(double money) {
        return this.rate * money;
    }
}
