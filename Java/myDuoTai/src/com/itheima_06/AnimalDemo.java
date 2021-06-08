package com.itheima_06;
/*
    测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        // 创建猫类对象进行测试
        Animal a = new Cat();
        a.setName("Yuna");
        a.setAge(26);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        a = new Cat("加菲猫",5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
    }
}
