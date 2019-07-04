package com.xiaoming.day8;
/**
 * @Author:         xiaoming
 * @CreateDate:     2019/7/3 23:10
 * @Description:    双重检验锁创建单例，弥补懒汉式。效率比较低
 */
public class SingletonDemo04 {

    private static SingletonDemo04 singleton;

    private SingletonDemo04(){

    }

    /**
     * 线程安全问题，多个线程访问该类，可能会创建多个对象，违背了单例
     * 所以加上 synchronized 保证线程安全，效率比较低
     * @return
     */
    public static  SingletonDemo04 getInstance(){
        if (singleton == null){
            synchronized (SingletonDemo04.class){
                if(singleton == null) {
                    singleton = new SingletonDemo04();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        SingletonDemo04 demo1 = SingletonDemo04.getInstance();
        SingletonDemo04 demo2 = SingletonDemo04.getInstance();
        //true
        System.out.println(demo1 == demo2);
    }
}
