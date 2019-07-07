package com.xiaoming.day9.abstractfactory;

/**
 * @Author:         xiaoming
 * @CreateDate:     2019/7/7 14:09
 * @Description:    汽车组装厂
 */
public interface CarFactory {

    /**
     * 生产发动机
     * @return
     */
    Engine createEngine();

    /**
     * 生产汽车座椅
     * @return
     */
    Chair createChair();

}
