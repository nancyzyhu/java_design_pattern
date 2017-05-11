package com.hzy.designpattern.simplefactory.operation;

/**
 * Created by huzhaoyu on 2017/5/11.
 */
public class AddOperation extends Operation {
    @Override
    public double getResult() {
        return this.getNumberA() + this.getNumberB();
    }
}
