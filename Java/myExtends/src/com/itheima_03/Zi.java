package com.itheima_03;


public class Zi extends Fu {
    public int age = 20;

    public void show()
    {
        int age = 30;
        System.out.println(age);
        // 我现在要访问本类的成员变量age，怎么办？
        System.out.println(this.age);
        // 我现在要访问父类的成员变量age，怎么办？
        System.out.println(super.age);
    }
}
