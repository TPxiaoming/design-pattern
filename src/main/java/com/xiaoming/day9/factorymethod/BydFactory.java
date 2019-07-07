package com.xiaoming.day9.factorymethod;
/**
 * @Author:         xiaoming
 * @CreateDate:     2019/7/7 13:51
 * @Description:    比亚迪工厂（45店）
 */
public class BydFactory implements CarFactory{
    @Override
    public Car createCar(String name) {
        return new BydCar();
    }
}
