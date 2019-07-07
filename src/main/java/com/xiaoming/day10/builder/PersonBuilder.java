package com.xiaoming.day10.builder;

/**
 * @Author:         xiaoming
 * @CreateDate:     2019/7/7 18:07
 * @Description:    人体构建器  在使用设计模式的时候一定要学会使用抽象类或者接口
 */
public interface PersonBuilder {

    /**
     * 构建头部
     */
    void builderHead();

    /**
     * 构建身体
     */
    void builderBody();

    /**
     * 构建脚
     */
    void builderFoot();

    /**
     * 组装各个部件
     * @return
     */
    Person builderPerson();
}
