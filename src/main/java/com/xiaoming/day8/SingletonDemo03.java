package com.xiaoming.day8;

/**
 * @Author: xiaoming
 * @CreateDate: 2019/7/4 21:12
 * @Description: 使用枚举创建单例模式
 */
public class SingletonDemo03 {
    private SingletonDemo03() {

    }

    public static SingletonDemo03 getInstance(){
        return SingletonDemoEnum.INSTANCE.getSingleton();
    }

    /**
     * 枚举本身就是单例的
     */
    static enum SingletonDemoEnum {
        INSTANCE;
        private SingletonDemo03 singleton;

        private SingletonDemoEnum() {
            singleton = new SingletonDemo03();
        }

        public SingletonDemo03 getSingleton() {
            return this.singleton;
        }
    }

    public static void main(String[] args) {
        SingletonDemo03 demo01 = SingletonDemo03.getInstance();
        SingletonDemo03 demo02 = SingletonDemo03.getInstance();
        System.out.println(demo01 == demo02);
    }

}
