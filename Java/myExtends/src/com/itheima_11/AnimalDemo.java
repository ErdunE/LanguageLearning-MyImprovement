package com.itheima_11;
/*
	需求：请采用继承的思想实现猫和狗的案例，并在测试类中进行测试

	思路：
		1.定义动物类
			成员变量：姓名，年龄
			构造方法：无参，带参
			成员方法：get/set方法
		2.定义猫类
			构造方法：无参，带参
			成员方法：抓老鼠()
		3.定义狗类
			构造方法：无参，带参
			成员方法：看门()
		4.定义测试类(AnimalDemo)，写代码测试
 */
public class AnimalDemo {
    public static void main(String[] args) {
        // 创建猫类对象，并进行测试
        Cat c1 = new Cat();
        c1.setName("加菲猫");
        c1.setAge(5);
        System.out.println(c1.getName()+", "+c1.getAge());
        c1.catchMouse();

        Cat c2 = new Cat("加菲猫",5);
        System.out.println(c2.getName()+", "+c2.getAge());
        c2.catchMouse();
    }
}
