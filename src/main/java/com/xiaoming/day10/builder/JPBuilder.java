package com.xiaoming.day10.builder;


/**
 * @Author:         xiaoming
 * @CreateDate:     2019/7/7 18:16
 * @Description:    构建小鬼子
 */
public class JPBuilder implements PersonBuilder {

    private Person person;

    public JPBuilder(){
        person = new Person();
    }

    @Override
    public void builderHead() {
        person.setHead("小鬼子 圆脸");
    }

    @Override
    public void builderBody() {
        person.setBody("小鬼子 比较矮");
    }

    @Override
    public void builderFoot() {
        person.setFoot("小鬼子 腿短");
    }

    @Override
    public Person builderPerson(){
        return this.person;
    }
}
