package com.xiaoming.day10.facade;

public class Test {

    public static void main(String[] args) {
       /* EmialMsgServiceImpl emialMsgService = new EmialMsgServiceImpl();
        SmsMsgServiceImpl smsMsgService = new SmsMsgServiceImpl();
        WeChatMsgServiceImpl weChatMsgService = new WeChatMsgServiceImpl();
        emialMsgService.sendMsg();
        smsMsgService.sendMsg();
        weChatMsgService.sendMsg();*/
       new Computer().sendMsg();
    }
}
