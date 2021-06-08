package com.itheima_05;

public class BasketballCoach extends Coach{
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练交如何运球和上篮");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃羊肉和羊奶");
    }
}
