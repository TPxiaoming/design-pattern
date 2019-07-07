package com.xiaoming.day10.facade;

public class EmialMsgServiceImpl implements EmialMsgService{
    @Override
    public void sendMsg() {
        System.out.println("发送邮件消息");
    }
}
