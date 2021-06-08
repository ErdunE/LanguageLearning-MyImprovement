package com.itheima_09;
/*
	创建对象并为其他成员变量赋值的两种方式
		1：无参构造方法创建对象后使用setXxx()赋值
		2：使用带参构造方法直接创建带有属性值的对象
 */
public class StudentDemo {
    public static void main(String[] args) {
        // 无参构造方法创建对象后使用setXxx()赋值
        Student s1 = new Student();
        s1.setName("Erdun");
        s1.setAge(24);
        s1.shows();

        // 使用带参构造方法直接创建带有属性值的对象
        Student s2 = new Student("Erdun",24);
        s2.shows();

    }
}
