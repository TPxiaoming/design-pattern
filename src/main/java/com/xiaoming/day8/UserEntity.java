package com.xiaoming.day8;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class UserEntity {
    private String userName;

    public UserEntity(){
        System.out.println("对象初始化。。。");
//        throw new RuntimeException();
    }

    public UserEntity(String name){
        System.out.println("name : " + name);
        this.userName = name;
    }


    /**
     * 在构造函数中，如果发生异常，对象会创建成功吗？
     * 不会
     * @param args
     */
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //1.初始化的操作  无参构造函数
//        UserEntity entity = new UserEntity();
//        entity.userName = "小明";
//        System.out.println(entity.userName);

        //2.使用 JAVA 的反射机制创建对象  参数：类的完整路径
        Class<?> forName = Class.forName("com.xiaoming.day8.UserEntity");
        //3.使用反射机制创建对象
      /*  UserEntity userEntity = (UserEntity) forName.newInstance();
        userEntity.userName = "反射对象";
        System.out.println(userEntity.userName);*/

        //4.使用反射机制 获取类的信息
        /*Method[] methods = forName.getMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].getName());
        }
*/
        //5.获取类的属性
      /*  Field[] fields = forName.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }*/

        Constructor<?> constructor = forName.getConstructor(String.class);
//        constructor.setAccessible(true);
        UserEntity userEntity = (UserEntity) constructor.newInstance("xiaoming");
        System.out.println(userEntity.userName);
    }
}
