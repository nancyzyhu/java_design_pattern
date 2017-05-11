package com.hzy.designpattern.simplefactory.operation;

/**
 * Created by huzhaoyu on 2017/5/11.
 * base class of operation(add,subtract,,multiply,divide)
 */
public abstract class Operation {
    private double numberA;
    private double numberB;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public abstract double getResult();
}
