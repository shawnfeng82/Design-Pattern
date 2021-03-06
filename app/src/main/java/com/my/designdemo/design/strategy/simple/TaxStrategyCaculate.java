package com.my.designdemo.design.strategy.simple;

/**
 * Author：mengyuan
 * Date  : 2017/8/3下午5:36
 * E-Mail:mengyuanzz@126.com
 * Desc  :
 */

public class TaxStrategyCaculate implements StrategyCaculate {
    @Override
    public float caculatePrice(int km) {
        if (km <= 0) {
            return 0;
        }
        if (km <= 3) {
            return 9;
        }
        return 9 + (km - 3);
    }
}
