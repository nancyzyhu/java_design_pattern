package com.hzy.designpattern.strategy;

import com.hzy.designpattern.strategy.context.Context;

/**
 * Created by huzhaoyu on 2017/5/11.
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context("Âú70¼õ10");
        double result = context.getActualMoney(120);
        System.out.println(result);
    }
}
