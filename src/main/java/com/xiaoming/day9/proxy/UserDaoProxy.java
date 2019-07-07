package com.xiaoming.day9.proxy;


/**
 * @Author:         xiaoming
 * @CreateDate:     2019/7/7 16:12
 * @Description:    静态代理，需要生成代理对象
 */
public class UserDaoProxy implements IUserDao {

    private IUserDao userDao;
    public UserDaoProxy(IUserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void add() {
        System.out.println("开启事务");
        userDao.add();
        System.out.println("提交事务");
    }

    @Override
    public void save() {
        System.out.println("开启事务");
        userDao.save();
        System.out.println("提交事务");
    }
}
