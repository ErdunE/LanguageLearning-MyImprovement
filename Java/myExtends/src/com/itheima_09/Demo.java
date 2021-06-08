package com.itheima_09;
/*
    测试类

	需求：定义老师类和学生类，然后写代码测试；最后找到老师类和学生类中的共性内容，抽取出一个父类，用继承的方式改写代码，并进行测试

	思路：
		1.定义老师类（姓名，年龄，教书（））
		2.定义学生类（姓名，年龄，学习（））
		3.定义测试类，写代码测试
		4.共性抽取父类，定义人类（姓名，年龄）
		5.定义老师类，集成人类，并给出自己特有的方法：教学（）
		6.定义学生类，集成人类，并给出自己特有的方法：学习（）
		7.定义测试类，写代码测试
 */
public class Demo {
    public static void main(String[] args) {
        // 创建老师类对象，进行测试
        Teacher t1 = new Teacher();
        t1.setName("eerdun");
        t1.setAge(26);
        System.out.println(t1.getName()+", "+t1.getAge());
        t1.teach();

        Teacher t2 = new Teacher("ziweihua",25);
        System.out.println(t2.getName()+", "+t2.getAge());
        t2.teach();



    }
}
