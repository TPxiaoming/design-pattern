package com.xiaoming.day9.proxy;

public class UserDaoImpl implements IUserDao{
    @Override
    public void add() {
        System.out.println("...add方法...");
    }

    @Override
    public void save() {
        System.out.println("...save方法...");
    }
}
