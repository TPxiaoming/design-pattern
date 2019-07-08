package com.xiaoming.day11;

import java.util.ArrayList;
import java.util.List;

public class Book implements Cloneable{

    /**
     * 名称
     */
    private String title;

   private  ArrayList<String> listImg =  new ArrayList<String>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getListImg() {
        return listImg;
    }

    public void setListImg(ArrayList<String> listImg) {
        this.listImg = listImg;
    }

    public void showBook(){
        System.out.println("......start......");
        System.out.println("title:"+title);
        for (String image : listImg) {
            System.out.println("img name :" + image);
        }
        System.out.println("......end......");
    }

    void addImg(String imageName){
        listImg.add(imageName);
    }



    @Override
    protected Object clone() throws CloneNotSupportedException {
        //浅克隆 深克隆 默认是浅克隆
        Book book = (Book) super.clone();

        //深克隆
        book.listImg = (ArrayList<String>) this.listImg.clone();
        return book;
    }
}
