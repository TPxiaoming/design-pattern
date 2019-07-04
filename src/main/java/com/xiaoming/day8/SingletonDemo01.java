package com.xiaoming.day8;
/**
 * @Author:         xiaoming
 * @CreateDate:     2019/7/3 23:02
 * @Description:    饿汉式 类初始化的时候，就会创建对象，天生线程安全，调用效率比较高
 * 如果在不使用对象的时候，会浪费内存
 */
public class SingletonDemo01 {

    private static SingletonDemo01 singleton = new SingletonDemo01();

    /**
     * 1.将构造函数私有化
     */
    private SingletonDemo01(){

    }

    /**
     * 会有线程安全问题吗？为什么不会产生线程安全问题？
     * 多个线程读一个共享变量，没有写操作，不存在线程安全问题
     * @return
     */
    public static SingletonDemo01 getInstance(){
        return  singleton;
    }

    public static void main(String[] args) {
        SingletonDemo01 demo01 = getInstance();
        SingletonDemo01 demo02 = getInstance();
        System.out.println(demo01 == demo02);
    }
}
