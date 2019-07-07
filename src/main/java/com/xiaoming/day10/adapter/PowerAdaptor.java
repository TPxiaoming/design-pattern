package com.xiaoming.day10.adapter;
/**
 * @Author:         xiaoming
 * @CreateDate:     2019/7/7 22:06
 * @Description:    电源适配器
 */
public class PowerAdaptor implements JP110VInterface{

    private CN220VInterface cn220VInterface;

    public PowerAdaptor(CN220VInterface cn220VInterface){
        this.cn220VInterface = cn220VInterface;
    }

    @Override
    public void connect() {
        cn220VInterface.connect();
    }
}
