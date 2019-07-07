package com.xiaoming.day10.facade;

public class SmsMsgServiceImpl implements SmsMsgService {
    @Override
    public void sendMsg() {
        System.out.println("发送短信");
    }
}
