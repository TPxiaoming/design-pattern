package com.xiaoming.day9;
/**
 * @Author:         xiaoming
 * @CreateDate:     2019/7/4 22:36
 * @Description:    客户
 */
public class Client {

    public static void main(String[] args) {
        Car car = CarFactory.createCar("比亚迪");
        car.run();
    }

}
