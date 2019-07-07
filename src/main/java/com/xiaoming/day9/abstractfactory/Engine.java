package com.xiaoming.day9.abstractfactory;
/**
 * @Author:         xiaoming
 * @CreateDate:     2019/7/7 14:04
 * @Description:    发动机接口
 */
public interface Engine {

    void run();
}

/**
 * @Author:         xiaoming
 * @CreateDate:     2019/7/7 14:05
 * @Description:    发动机A
 */
class EngineA implements  Engine{

    @Override
    public void run() {
        System.out.println("发动机转速快");
    }
}

/**
 * @Author:         xiaoming
 * @CreateDate:     2019/7/7 14:07
 * @Description:    发动机B
 */
class EngineB implements Engine{

    @Override
    public void run() {
        System.out.println("发动机转速慢");
    }
}
