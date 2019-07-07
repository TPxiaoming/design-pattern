package com.xiaoming.day9.proxy;

public class Client {
    public static void main(String[] args) {
        IUserDao userDao = new UserDaoImpl();
        UserDaoProxy userDaoProxy = new UserDaoProxy(userDao);
        userDaoProxy.add();
        userDaoProxy.save();
    }
}
