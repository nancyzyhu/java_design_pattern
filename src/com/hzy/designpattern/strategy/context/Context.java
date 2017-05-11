package com.hzy.designpattern.strategy.context;

import com.hzy.designpattern.strategy.strategy.BaseStrategy;
import com.hzy.designpattern.strategy.strategy.Strategy1;
import com.hzy.designpattern.strategy.strategy.Strategy2;
import com.hzy.designpattern.strategy.strategy.Strategy3;

/**
 * Created by huzhaoyu on 2017/5/11.
 */
public class Context {
    private BaseStrategy strategy;

    public Context(String type) {
        switch (type) {
            case "Õı³£ÕÛ¿Û":
                strategy = new Strategy1();
                break;
            case "´ò°ËÕÛ":
                strategy = new Strategy2(0.8);
                break;
            case "´òÎåÕÛ":
                strategy = new Strategy2(0.5);
                break;
            case "Âú300¼õ50":
                strategy = new Strategy3(300, 50);
            case "Âú70¼õ10":
                strategy = new Strategy3(70, 10);
                break;
            default:
                strategy = null;
                break;
        }
    }

    public double getActualMoney(double money) {
        if (this.strategy != null) {
            return this.strategy.actualSuperMoney(money);
        }
        return 0;
    }
}
