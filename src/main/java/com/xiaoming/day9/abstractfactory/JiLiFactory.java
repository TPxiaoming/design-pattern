package com.xiaoming.day9.abstractfactory;

/**
 * @Author:         xiaoming
 * @CreateDate:     2019/7/7 14:11
 * @Description:    吉利汽车组装厂
 */
public class JiLiFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new EngineA();
    }

    @Override
    public Chair createChair() {
        return new ChairA();
    }
}
