package com.itheima_03;
/*
    测试类

    	需求：对猫和狗进行训练，他们就可以跳高了，这里加入了跳高功能。请采用抽象类和接口来实现猫狗案例，并在测试类中进行测试

	思路：
		1.定义接口(Jumpping)
			成员方法：跳高();
		2.定义抽象动物类(Animal)
			成员变量：姓名，年龄;
			构造方法：无参，带参;
			成员方法：get/set方法，吃饭();
		3.定义具体猫类(Cat)，继承动物类，实现跳高接口
			构造方法：无参，带参;
			成员方法：重写吃饭(){…}，重写跳高方法(){…}
		4.定义具体狗类(Cat)，继承动物类，实现跳高接口
			构造方法：无参，带参;
			成员方法：重写吃饭(){…}，重写跳高方法(){…}
		5.定义测试类(AnimalDemo)，写代码测试
 */
public class AnimalDemo {
    public static void main(String[] args) {
        // 创建对象，调用方法
        Jumpping j = new Cat();
        j.jump();

        Animal a = new Cat();
        a.setName("Yuna");
        a.setAge(26);
        System.out.println(a.getName()+", "+a.getAge());
        a.eat();
//        a.jump();

        a = new Cat("erdun",26);
        System.out.println(a.getName()+", "+a.getAge());
        a.eat();

        Cat c = new Cat();
        c.setName("e");
        c.setAge(2);
        System.out.println(c.getName()+", "+c.getAge());
        c.eat();
        c.jump();


    }
}
