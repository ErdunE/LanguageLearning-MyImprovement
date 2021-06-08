package com.itheima_06;

import java.util.Comparator;
import java.util.TreeSet;

/*
	存储学生对象并遍历，创建TreeSet集合使用带参构造方法
	要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
*/
public class TreeSetDemo {
    public static void main(String[] args) {
        // 创建集合对象
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getAge() - s2.getAge();
                int num2 = num==0 ? s1.getName().compareTo(s2.getName()):num;
                return num2;
            }
        });

        // 创建学生
        Student s1 = new Student("ErdunE",26);
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
            System.out.println(s.getName()+s.getAge());
        }
    }
}
