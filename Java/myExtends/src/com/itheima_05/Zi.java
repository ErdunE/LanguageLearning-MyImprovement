package com.itheima_05;

/*
	继承的格式
		格式：public class 子类名 extends 父类名{}
		范例：public class Zi extends Fu{}
 */
public class Zi extends Fu {
    public void method()
    {
        System.out.println("Zi中method方法被调用");
    }
    public void show()
    {
        super.show();
        System.out.println("Zi中show方法被调用");
    }
}
