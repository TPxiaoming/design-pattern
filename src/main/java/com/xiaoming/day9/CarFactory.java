package com.xiaoming.day9;


import org.apache.commons.lang3.StringUtils;

/**
 * @Author:         xiaoming
 * @CreateDate:     2019/7/4 22:37
 * @Description:    汽车厂 （4s）店
 */
public class CarFactory {

    public static Car createCar(String name){
        //判断name是否为空
        if (StringUtils.isEmpty(name)){
            return null;
        }
        if ("比亚迪".equals(name)){
            return new BydCar();
        }
        if ("吉利".equals(name)){
            return new JiLiCar();
        }
        //改代码之后，可以不用重启服务器。动态使用缓存或者数据库+反射。 类型Id、类型名称、类型class地址
        if ("奥迪".equals(name)){
            return new BydCar();
        }
        if ("特斯拉".equals(name)){
            return new JiLiCar();
        }

        //其他或者未找到
        return null;
    }
}
