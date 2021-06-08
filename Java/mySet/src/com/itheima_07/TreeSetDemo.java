package com.itheima_07;

import java.util.Comparator;
import java.util.TreeSet;

/*
	需求：用TreeSet集合存储多个学生信息(姓名，语文成绩，数学成绩)，并遍历该集合
	要求：按照总分从高到低出现

	思路：
		1.定义学生类
		2.创建TreeSet集合对象，通过比较器排序进行排序
		3.创建学生对象
		4.把学生对象添加到集合
		5.遍历集合
*/
public class TreeSetDemo {
    public static void main(String[] args) {
        // 创建TreeSet集合对象
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s2.getSum()-s1.getSum();
                int num2 = num == 0 ? s1.getChinese()-s2.getChinese() : num;
                int num3 = num2 == 0 ? s1.getMath()-s2.getMath() : num2;
                return num3;
            }
        });

        // 创建学生对象
        Student s1 = new Student("Erdun E",90,95);
        Student s2 = new Student("Ziwei Hua",86,98);
        Student s3 = new Student("Chenghai Cao",95,85);
        Student s4 = new Student("Yuna",97,79);
        Student s5 = new Student("Zhipeng Sun",85,92);

        // 把学生添加到集合
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        // 遍历集合
        for(Student s : ts)
        {
            System.out.println(s.getName()+", "+s.getChinese()+", "+s.getMath()+", "+s.getSum());
        }
    }
}
