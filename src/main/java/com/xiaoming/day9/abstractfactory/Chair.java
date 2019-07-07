package com.xiaoming.day9.abstractfactory;

/**
 * @Author:         xiaoming
 * @CreateDate:     2019/7/7 14:07
 * @Description:    座椅接口
 */
public interface Chair {
    void run();
}

/**
 * @Author:         xiaoming
 * @CreateDate:     2019/7/7 14:08
 * @Description:    座椅A
 */
class ChairA implements Chair{

    @Override
    public void run() {
        System.out.println("自动加热");
    }
}

/**
 * @Author:         xiaoming
 * @CreateDate:     2019/7/7 14:08
 * @Description:    座椅A、B
 */
class ChairB implements Chair{

    @Override
    public void run() {
        System.out.println("不能加热");
    }
}
