package com.xiaoming.day10.adapter;
/**
 * @Author:         xiaoming
 * @CreateDate:     2019/7/7 22:03
 * @Description:    电饭煲
 */
public class ElectricCooker {

    private JP110VInterface jp110VInterface;

    public ElectricCooker(JP110VInterface jp110VInterface){
        this.jp110VInterface = jp110VInterface;
    }

    public void cook(){
        jp110VInterface.connect();
        System.out.println("开始做饭");
    }
}
