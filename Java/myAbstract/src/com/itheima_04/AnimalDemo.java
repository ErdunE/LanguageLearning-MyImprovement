package com.itheima_04;
/*
    测试类

	需求：请采用抽象类的思想实现猫和狗的案例，并在测试类中进行测试

	思路：
		1.定义动物类(Animal)
			成员变量：姓名，年龄
			构造方法：无参，带参
			成员方法：set/get方法，吃饭();
		2.定义猫类(Cat)
			构造方法：无参，带参
			成员方法：重写吃饭(){…};
		3.定义狗类(Dog)
			构造方法：无参，带参
			成员方法：重写吃饭(){…};
		4.定义测试类(AnimalDemo)，写代码测试
 */
public class AnimalDemo {
    public static void main(String[] args) {
        // 创建对象，按照多态的方式
        Animal a = new Cat();
        a.setName("Yuna");
        a.setAge(26);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        System.out.println("--------");

        a = new Cat("加菲猫",5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
    }
}
