package com.itheima_06;

import com.itheima_05.Student;

/*
    学生测试类
 */
public class StudentDemo {
    public static void main(String[] args) {
        // 创建对象
        com.itheima_05.Student s = new Student();

        // 使用set方法给成员变量赋值
        s.setName("额尔敦");
        s.setAge(24);

        s.show();

        // 使用get方法获得成员变量赋值
        System.out.println(s.getName() + "---" + s.getAge());
        System.out.println(s.getName() + "," + s.getAge());

    }
}
