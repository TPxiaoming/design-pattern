package com.xiaoming.day11.strategy;

public class Strategy001 {
    public static void main(String[] args) {

    }

    /**
     * 三种会员 铂金会员 黄金会员 普通会员
     */
    public void getPrice(String level){
        Long price = null;
        if ("铂金会员".equals(level)) {
            price = Long.valueOf(100 * 100);
        } else if ("黄金会员".equals(level)){
            price = Long.valueOf(100 * 150);
        } else if ("普通会员".equals(level)) {
            price = Long.valueOf(100 * 200);
        }
    }
}
