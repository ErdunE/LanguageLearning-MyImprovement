package com.itheima_06;
/*
    测试类
 */
public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.call("eerdun");
        System.out.println("--------");
        NewPhone p1 = new NewPhone();
        p1.call("Erdun");
    }
}
