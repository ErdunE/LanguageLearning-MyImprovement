package com.itheima_08;

import com.itheima_08.Student;

/*
    学生测试类
 */
public class StudentDemo {
    public static void main(String[] args) {
        // 创建对象
        Student s1 = new Student();
        s1.shows();

        Student s2 = new Student("林青霞");
        s2.shows();

        Student s3 = new Student(30);
        s3.shows();

        Student s4 = new Student("林青霞",30);
        s4.shows();
    }
}
