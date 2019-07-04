package com.xiaoming.day8;

/**
 * @Author: xiaoming
 * @CreateDate: 2019/7/4 21:54
 * @Description: 使用静态内部类创建单例模式
 */
public class SingletonDemo05 {
    private SingletonDemo05() {
        System.out.println("初始化。。。");
    }

    public static class SingletonClassInstance {
        private static final SingletonDemo05 singleton = new SingletonDemo05();
    }

    public static SingletonDemo05 getInstance(){
        return SingletonClassInstance.singleton;
    }

    public static void main(String[] args) {
        SingletonDemo05 demo1 = SingletonDemo05.getInstance();
        SingletonDemo05 demo2 = SingletonDemo05.getInstance();
        System.out.println(demo1 == demo2);
    }
}
