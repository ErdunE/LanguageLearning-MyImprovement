package com.itheima_04;
/*
	前提：
		存在一个类或者接口
		这里的类可以是具体类也可以是抽象类

	格式：
		new 类名或者接口名(){
			重写方法;
		};

 */
public class Outer {

    public void method(){
//        new Inner(){
//            @Override
//            public void show() {
//                System.out.println("匿名内部类");
//            }
//        };

//        new Inner(){
//            @Override
//            public void show() {
//                System.out.println("匿名内部类");
//            }
//        }.show();

        Inner i = new Inner(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };

        i.show();
    }
}
