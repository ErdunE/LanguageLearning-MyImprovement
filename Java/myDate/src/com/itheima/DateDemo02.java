package com.itheima;

import java.util.Date;

/*
	public long getTime(): 获取的日期对象是从1970年1月1日 00：00：00到现在的毫秒值
	public long setTime(long time): 设置时间，给的是毫秒值
 */
public class DateDemo02 {
    public static void main(String[] args) {
        // 创建日期对象
        Date d = new Date();

        // public long getTime(): 获取的日期对象是从1970年1月1日 00：00：00到现在的毫秒值
        System.out.println(d.getTime()*1.0/1000/60/60/24/365+"年");
        System.out.println(d);
        // long time = System.currentTimeMills();
        // d.setTime(time);

    }
}
