package com.itheima_01;
/*
    测试类
 */
public class StaticDemo {
    public static void main(String[] args) {

        Student.university = "University of Massachusetts Lowell";

        Student s1 = new Student();
        s1.name = "Erdun E";
        s1.age = 26;
//        s1.university = "University of Massachusetts Lowell";
        s1.show();

        Student s2 = new Student();
        s2.name = "Ziwei Hua";
        s2.age = 25;
//        s2.university = "University of Massachusetts Lowell";
        s2.show();
    }
}
