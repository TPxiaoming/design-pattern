package com.xiaoming.day10.facade;

/**
 * @Author:         xiaoming
 * @CreateDate:     2019/7/7 22:25
 * @Description:    门面
 */
public class Computer {
    EmialMsgServiceImpl emialMsgService;
    SmsMsgServiceImpl smsMsgService;
    WeChatMsgServiceImpl weChatMsgService;

    public Computer(){
        emialMsgService = new EmialMsgServiceImpl();
       smsMsgService = new SmsMsgServiceImpl();
        weChatMsgService = new WeChatMsgServiceImpl();
    }

    public void sendMsg(){
        emialMsgService.sendMsg();
        smsMsgService.sendMsg();
        weChatMsgService.sendMsg();
    }
}
