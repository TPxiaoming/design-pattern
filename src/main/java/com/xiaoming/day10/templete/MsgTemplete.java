package com.xiaoming.day10.templete;

/**
 * @Author:         xiaoming
 * @CreateDate:     2019/7/7 21:38
 * @Description:    短信模板
 */
public abstract class MsgTemplete {
    public void sendMsg(){
        //1.开始日志报文
        addHeadLog();
        
        //2.调用具体不同运营商发送
        httpRequest();
        
        //3.结束日志保温
        addFootLog();
    }

    private void addFootLog() {
        System.out.println("调用运营商结束日志");
    }

    public abstract void httpRequest();

    private void addHeadLog() {
        System.out.println("调用运营商开始日志...");
    }
}
