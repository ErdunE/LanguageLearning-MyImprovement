package com.itheima_01;
/*
	JVM的默认处理方案
*/
public class ExceptionDemo02 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    public static void method(){
        int[] arr = {1,2,3};
        // System.out.println(arr[1]);
        System.out.println(arr[3]);
        // 开始
        //    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        //   	at com.itheima_01.ExceptionDemo02.method(ExceptionDemo02.java:15)
        //    	at com.itheima_01.ExceptionDemo02.main(ExceptionDemo02.java:8)
    }
}
