package com.xiaoming.day10.adapter;

public class CN220VInterfaceImpl implements CN220VInterface{
    @Override
    public void connect() {
        System.out.println("中国220v电源开始工作");
    }
}
