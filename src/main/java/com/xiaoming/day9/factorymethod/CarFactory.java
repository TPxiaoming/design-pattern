package com.xiaoming.day9.factorymethod;


import org.apache.commons.lang3.StringUtils;

/**
 * @Author:         xiaoming
 * @CreateDate:     2019/7/4 22:37
 * @Description:    汽车厂 （4s）店
 */
public interface CarFactory {

    Car createCar(String name);
}
