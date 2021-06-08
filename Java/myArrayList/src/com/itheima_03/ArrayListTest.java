package com.itheima_03;

import java.util.ArrayList;
import java.util.Scanner;

/*
	需求：创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
		学生的姓名和年龄来自键盘录入

	思路：
		1.定义学生类，为了键盘录入数据方便，把学生类中的成员变量都定义为String类型
		2.创建集合对象
		3.键盘录入学生对象所需要的数据
		4.创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
		5.往集合中添加学生对象
		6.遍历集合，采用通用遍历格式实现
 */
public class ArrayListTest {
    public static void main(String[] args) {
        // 创建集合对象
        ArrayList<Student> array = new ArrayList<Student>();

//        // 键盘录入学生对象所需要的数据
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入学生姓名：");
//        String studentName = sc.nextLine();
//        System.out.println("请输入学生年龄：");
//        String studentAge = sc.nextLine();
//
//        // 创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
//        Student s = new Student();
//        s.setName(studentName);
//        s.setAge(studentAge);
//
//        // 往集合中添加学生对象
//        array.add(s);

        // 为了提高代码复用率，创建方法
        addStudent(array);
        addStudent(array);
        addStudent(array);

        // 遍历集合，采用通用遍历格式实现
        for(int i = 0 ; i < array.size() ; i++)
        {
            Student s = array.get(i);
            System.out.println(s.getName() + "," + s.getAge());

        }
    }

    public static void addStudent(ArrayList<Student> array)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String studentName = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String studentAge = sc.nextLine();

        // 创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student s = new Student();
        s.setName(studentName);
        s.setAge(studentAge);

        // 往集合中添加学生对象
        array.add(s);
    }
}
