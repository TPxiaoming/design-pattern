package com.xiaoming.day10.adapter;

public class JP110VInterfaceImpl implements JP110VInterface {
    @Override
    public void connect() {
        System.out.println("日本110v电源开始工作");
    }
}
