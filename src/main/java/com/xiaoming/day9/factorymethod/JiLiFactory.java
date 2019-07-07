package com.xiaoming.day9.factorymethod;
/**
 * @Author:         xiaoming
 * @CreateDate:     2019/7/7 13:50
 * @Description:    吉利汽车厂（4s店）
 */
public class JiLiFactory implements CarFactory{
    @Override
    public Car createCar(String name) {
        return new JiLiCar();
    }
}
