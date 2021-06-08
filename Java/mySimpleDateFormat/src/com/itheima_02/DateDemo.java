package com.itheima_02;

import java.text.ParseException;
import java.util.Date;

/*
    测试类

	需求：定义一个日期工具类(DateUtils)，包含两个方法：把日期转换为指定格式的字符串；把字符串解析为指定格式的日期，然后定义一个测试类(DateDemo)，测试日期工具类的方法

	思路：
		1.定义日期工具类(DateUtils)
		2.定义一个方法dateToString，用于把日期转换为指定格式的字符串
			返回值类型: String
			参数: Date date, String format
		3.定义一个方法stringToDate, 用于字符串解析为指定格式的日期
			返回值类型: Date
			参数：String s, String format
		4.定义测试类DateDemo, 调用日期工具类中的方法
 */
public class DateDemo {
    public static void main(String[] args) throws ParseException {
        // 创建日期对象
        Date d = new Date();
        String s1 = DateUtils.dateToString(d,"yyyy年mm月dd日 hh:mm:ss");
        System.out.println(s1);

        String s = "2021-09-08";
        Date d1 = DateUtils.stringToDate(s,"yyyy-mm-ss");
        System.out.println(d1);

    }
}
