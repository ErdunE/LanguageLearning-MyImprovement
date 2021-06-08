package com.itheima_02;
/*
    测试类

    格式：外部类名.内部类名 对象名 = 外部类对象.内部类对象
	范例：Outer.Inner oi = new Outer().new Inner();
 */
public class InnerDemo {
    public static void main(String[] args) {
        // 创建内部类对象，并调用方法
//        Inner i = new Inner();

//        Outer.Inner oi = new Outer().new Inner();
//        oi.show();

        Outer i = new Outer();
        i.method();
    }
}
