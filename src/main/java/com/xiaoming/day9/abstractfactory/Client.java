package com.xiaoming.day9.abstractfactory;

public class Client {
    public static void main(String[] args) {
        CarFactory carFactory = new JiLiFactory();
        Chair chair = carFactory.createChair();
        Engine engine = carFactory.createEngine();
        chair.run();
        engine.run();

    }
}
