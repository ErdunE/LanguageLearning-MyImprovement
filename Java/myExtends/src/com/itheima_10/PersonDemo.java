package com.itheima_10;

import com.itheima_09.Teacher;

/*
    测试类
 */
public class PersonDemo {
    public static void main(String[] args) {
        // 创建老师类对象，进行测试
        com.itheima_09.Teacher t1 = new Teacher();
        t1.setName("eerdun");
        t1.setAge(26);
        System.out.println(t1.getName()+", "+t1.getAge());
        t1.teach();

        Teacher t2 = new Teacher("ziweihua",25);
        System.out.println(t2.getName()+", "+t2.getAge());
        t2.teach();
    }
}
