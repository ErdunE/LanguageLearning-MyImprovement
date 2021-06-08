package com.itheima_02;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    // this -- s1
    // o -- s2

    public boolean equals(Object o) {
        // 比较地址是否相同，如果相同，直接返回true
        if (this == o) return true;

        // 判断参数是否为null
        // 判断两个对象是否来自于同一个类
        // 有一种情况满足就返回false
        if (o == null || getClass() != o.getClass()) return false;

        // 向下转型
        Student student = (Student) o;

        // 比较年龄和姓名是否相同
        return age == student.age && Objects.equals(name, student.name);
    }

}
