package com.xiaoming.day10.templete;

public class ClientTemplete {

    public static void main(String[] args) {
        MsgTemplete yiDong = new YiDong();
        yiDong.sendMsg();

        MsgTemplete lianTong = new LianTong();
        lianTong.sendMsg();
    }
}
