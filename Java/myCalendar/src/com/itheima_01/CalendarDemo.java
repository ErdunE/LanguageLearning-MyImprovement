package com.itheima_01;

import java.util.Calendar;

/*
	Calendar 为某一时刻和一组日历字段之间的转换提供了一些方法，并为操作日历字段提供了一些方法
	Calendar 提供了一个类方法getInstance用于获取Calendar对象，其日历字段已使用当前日期和时间初始化：
		Calendar rightNow = Calendar.getInstrance();

*/
public class CalendarDemo {
    public static void main(String[] args) {
        // 获取对象
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int mouth = c.get(Calendar.MONTH)+1;
        int date = c.get(Calendar.DATE);

        System.out.println(year+"年"+mouth+"月"+date+"日");
    }
}
