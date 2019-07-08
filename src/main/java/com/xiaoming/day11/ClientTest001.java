package com.xiaoming.day11;

public class ClientTest001 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //被克隆的对象
        Book book = new Book();
        book.setTitle("图书1");
        book.addImg("图片1");
        book.showBook();

        //开始克隆对象 以原型方法进行复制拷贝
        Book book2 = (Book) book.clone();
        book2.setTitle("图书2");
        book2.addImg("图片2");
        book2.showBook();

        //打印原型日志
        book.showBook();

    }
}
