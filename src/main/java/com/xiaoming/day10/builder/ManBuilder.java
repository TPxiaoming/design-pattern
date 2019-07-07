package com.xiaoming.day10.builder;

/**
 * @Author:         xiaoming
 * @CreateDate:     2019/7/7 18:11
 * @Description:    构造人物 米国人
 */
public class ManBuilder implements PersonBuilder {

    private Person person;

    public ManBuilder(){
        person = new Person();
    }

    @Override
    public void builderHead() {
        person.setHead("米国人 头部 鼻子尖、长脸、蓝眼睛");
    }

    @Override
    public void builderBody() {
        person.setBody("米国人 长得比较高，块头大。");
    }

    @Override
    public void builderFoot() {
        person.setFoot("米国人 腿长...");
    }

    @Override
    public Person builderPerson(){
        return this.person;
    }
}
