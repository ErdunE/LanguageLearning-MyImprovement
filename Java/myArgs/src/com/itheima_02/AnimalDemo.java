package com.itheima_02;
/*
    测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        // 创建操作对象,并调用方法
        AnimalOperator ao = new AnimalOperator();
        Animal a = new Cat();
        a.eat();

        Animal a2 = ao.getAnimal();
        a2.eat();
    }
}
