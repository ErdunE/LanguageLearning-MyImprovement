package com.itheima_03;
/*
    抽象类
 */
public abstract class Animal {
    private String name;
    private int age = 20;
    private final String city = "北京";

    public Animal(){}

    public Animal(int age){
        this.age = age;
    }

    public void show(){
        age = 40;
        System.out.println(age);
//        city = "shanghai";
        System.out.println(city);
    }

    public abstract void eat();
}