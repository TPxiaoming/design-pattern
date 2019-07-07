package com.xiaoming.day10.facade;

public class WeChatMsgServiceImpl implements WeChatMsgService {
    @Override
    public void sendMsg() {
        System.out.println("微信推送");
    }
}
