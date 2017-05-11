package com.hzy.designpattern.strategy.strategy;

/**
 * Created by huzhaoyu on 2017/5/11.
 */
public class Strategy3 implements BaseStrategy {
    private double enoughMoney = 0;
    private double returnMoney = 0;

    public Strategy3(double enoughMoney, double returnMoney) {
        this.enoughMoney = enoughMoney;
        this.returnMoney = returnMoney;
    }

    @Override
    public double actualSuperMoney(double money) {
        double totalReturnMoney;
        if (this.enoughMoney == 0) {
            totalReturnMoney = 0;
        } else {
            totalReturnMoney = (int)((money / this.enoughMoney)) * this.returnMoney;
        }

        if (money > totalReturnMoney) {
            return money - totalReturnMoney;
        } else {
            return 0;
        }
    }
}
