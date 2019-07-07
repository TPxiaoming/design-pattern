package com.xiaoming.day9.factorymethod;

/**
 * @Author:         xiaoming
 * @CreateDate:     2019/7/4 22:36
 * @Description:    客户
 */
public class Client {

    public static void main(String[] args) {
       CarFactory carFactory = new BydFactory();
        Car byd = carFactory.createCar(null);
        byd.run();

        CarFactory jiLiFactory = new JiLiFactory();
        Car jili = jiLiFactory.createCar(null);
        jili.run();
    }

}
