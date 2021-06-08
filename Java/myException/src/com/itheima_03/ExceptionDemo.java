package com.itheima_03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
	throws 异常类名
	这个格式是跟在方法的括号后面的
*/
public class ExceptionDemo {
    public static void main(String[] args) throws ParseException {
        System.out.println("开始");
        method();
        method2();
        System.out.println("结束");
    }

    // 运行时异常
    public static void method() throws ArrayIndexOutOfBoundsException{
        int[] arr = {1, 2, 3};
        System.out.println(arr[3]);
    }

    // 编译时异常
    public static void method2() throws ParseException {
        String s = "2048-11-11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        Date d = sdf.parse(s);
        System.out.println(d);
    }
}
