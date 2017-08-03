package com.my.designdemo.strategy;

import com.my.designdemo.Constant;

/**
 * Author：mengyuan
 * Date  : 2017/8/3下午4:22
 * E-Mail:mengyuanzz@126.com
 * Desc  :
 */

public class PriceCaculateController {

    /**
     * 根据出行方式，选择距离的计算方法
     */
    public static float cacluatePrice(int km, int typeMode) {
        switch (typeMode) {
            case Constant.TYPE_BUS:
                return caculateBusPrice(km);
            case Constant.TYPE_SUBWAY:
                return caculateSubwayPrice(km);
            case Constant.TYPE_TAX:
                return caculateTaxPrice(km);
        }
        return 0;
    }

    /**
     * 计算出租车价格
     * 小于3Km，定价9元，大于3km，每1km + 1元
     *
     */
    private static float caculateTaxPrice(int km) {
        if (km <= 0) {
            return 0;
        }
        if (km <= 3) {
            return 9;
        }
        return 9 + (km - 3);
    }

    /**
     * 计算公交车价格
     * 小于5Km，定价2元，小于10km，定价3元，其余4元
     */
    private static float caculateBusPrice(int km) {
        if (km <= 0) {
            return 0;
        }
        if (km <= 5) {
            return 2;
        }
        if (km <= 10) {
            return 3;
        }
        return 4;
    }
    /**
     * 计算地铁价格
     * 小于5Km，定价3元，小于10km，定价4元，小于15Km，定价5元，其余6元
     */
    private static float caculateSubwayPrice(int km) {
        if (km <= 0) {
            return 0;
        }
        if (km <= 5) {
            return 3;
        }
        if (km <= 10) {
            return 4;
        }
        if (km <= 15) {
            return 5;
        }
        return 6;
    }
}
