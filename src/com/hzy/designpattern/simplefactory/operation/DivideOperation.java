package com.hzy.designpattern.simplefactory.operation;

/**
 * Created by huzhaoyu on 2017/5/11.
 */
public class DivideOperation extends Operation {
    @Override
    public double getResult() {
        try {
            return this.getNumberA() / this.getNumberB();
        } catch (ArithmeticException e) {
            return 0;
        }
    }
}
