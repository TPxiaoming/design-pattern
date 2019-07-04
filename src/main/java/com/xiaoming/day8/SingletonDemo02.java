package com.xiaoming.day8;
/**
 * @Author:         xiaoming
 * @CreateDate:     2019/7/3 23:10
 * @Description:    懒汉式  类初始化的时候不会创建该对象
 * 真正需要的时候才会加载（创建），天生线程不安全，需要解决线程安全问题，所以效率比较低
 */
public class SingletonDemo02 {

    private static SingletonDemo02 singleton;

    private  SingletonDemo02(){

    }

    /**
     * 线程安全问题，多个线程访问该类，可能会创建多个对象，违背了单例
     * 所以加上 synchronized 保证线程安全，效率比较低
     * @return
     */
    public static synchronized SingletonDemo02 getInstance(){
        if(singleton == null) {
            singleton = new SingletonDemo02();
        }
        return singleton;
    }

    public static void main(String[] args) {
        SingletonDemo02 demo1 = SingletonDemo02.getInstance();
        SingletonDemo02 demo2 = SingletonDemo02.getInstance();
        //true
        System.out.println(demo1 == demo2);
    }
}
