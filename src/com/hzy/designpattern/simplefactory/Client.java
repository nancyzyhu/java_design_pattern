package com.hzy.designpattern.simplefactory;

import com.hzy.designpattern.simplefactory.operation.Operation;

/**
 * Created by huzhaoyu on 2017/5/11.
 */
public class Client {
    public static void main(String[] args) {
        Operation operation = SimpleFactory.createOperation("+");
        if (operation != null) {
            operation.setNumberA(15.2);
            operation.setNumberB(18.2);
            System.out.println(operation.getResult());
        }
    }
}
