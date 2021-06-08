package com.itheima_02;
/*
    学生测试类
 */
public class StudentDemo {
    public static void main(String[] args) {
        // 创建对象
        Student s = new Student();
        System.out.println(s);

        // 使用对象
        System.out.println(s.name + "," + s.age);

        s.name = "额尔敦";
        s.age = 24;

        System.out.println(s.name + "," + s.age);

        // 使用成员方法
        s.study();
        s.doHomeWork();
    }
}
