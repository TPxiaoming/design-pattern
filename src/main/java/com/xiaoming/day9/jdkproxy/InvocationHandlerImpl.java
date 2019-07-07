package com.xiaoming.day9.jdkproxy;

import com.xiaoming.day9.proxy.IUserDao;
import com.xiaoming.day9.proxy.UserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author:         xiaoming
 * @CreateDate:     2019/7/7 16:35
 * @Description:    每次生成动态代理对象时，实现了 InvocationHandler 接口的调用处理器对象
 */
public class InvocationHandlerImpl implements InvocationHandler {

    /**
     * 目标代理对象
     */
    private Object target;

    public InvocationHandlerImpl(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("jdk动态代理--开启事务");
        Object invoke = method.invoke(target, args);
        System.out.println("jdk动态代理--提交事务");
        return invoke;
    }

    public static void main(String[] args) {
        IUserDao userDao = new UserDaoImpl();
        InvocationHandlerImpl invocationHandler = new InvocationHandlerImpl(userDao);
        //获取类加载器
        ClassLoader classLoader = userDao.getClass().getClassLoader();
        //获取当前实现的接口
        Class<?>[] interfaces = userDao.getClass().getInterfaces();

        //调用动态代理实例
        IUserDao iUserDao = (IUserDao) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
        iUserDao.add();


    }
}
