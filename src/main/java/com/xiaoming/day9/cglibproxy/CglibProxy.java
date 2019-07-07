package com.xiaoming.day9.cglibproxy;

import com.xiaoming.day9.proxy.UserDaoImpl;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {

    private Object target;

    public Object getInstance(Object target){
        this.target = target;
        //操作字节码 生成虚拟子类
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开启事务");
        Object invoke = methodProxy.invoke(target, objects);
        System.out.println("提交事务");
        return invoke;
    }



    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        UserDaoImpl userDao = (UserDaoImpl) cglibProxy.getInstance(new UserDaoImpl());
        userDao.add();

        //日志 控制层打印日志 AOP技术 环绕通知 方法之前和之后进行拦截参数打印

        //怎么判断一个类是否实现接口？ 通过反射技术

    }
}
