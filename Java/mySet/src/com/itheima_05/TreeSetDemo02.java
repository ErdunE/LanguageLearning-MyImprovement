package com.itheima_05;

import java.util.TreeSet;

/*
	存储学生对象并遍历，创建集合使用无参构造方法
	要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
*/
public class TreeSetDemo02 {
    public static void main(String[] args) {
        // 创建集合对象
        TreeSet<Student> ts = new TreeSet<Student>();

        // 添加元素
        Student s1 = new Student("erdune",26);
        Student s2 = new Student("ziweihua",25);
        Student s3 = new Student("chenghaicao",24);
        Student s4 = new Student("Yuna",26);

        // 把学生添加到集合
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        // 遍历集合
        for(Student s : ts){
            System.out.println(s.getName()+", "+s.getAge());
        }
    }
}
