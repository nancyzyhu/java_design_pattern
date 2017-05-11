package com.hzy.designpattern.simplefactory;

import com.hzy.designpattern.simplefactory.operation.*;

/**
 * Created by huzhaoyu on 2017/5/11.
 * factory class: create concrete operation by operate
 * when you want to add a new operation in system,
 * you need add new operation class which extends from Operation class
 * and add new case statement in createOperation method in SimpleFactory class
 */
public class SimpleFactory {
    public static Operation createOperation(String operate) {
        Operation operation;
        switch (operate) {
            case "+":
                operation = new AddOperation();
                break;
            case "-":
                operation = new SubtractOperation();
                break;
            case "*":
                operation = new MultiplyOperation();
                break;
            case "/":
                operation = new DivideOperation();
                break;
            default:
                operation = null;
                break;
        }
        return operation;
    }
}
