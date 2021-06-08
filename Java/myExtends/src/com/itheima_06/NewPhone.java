package com.itheima_06;

public class NewPhone extends Phone{
    public void call(String name){
        System.out.println("开启视频功能");
        super.call(name);
    }
}
