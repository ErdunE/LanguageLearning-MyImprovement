package com.itheima_02;

import java.util.ArrayList;

/*
	需求：创建一个存储字符串的集合，存储3个字符串元素，实用程序实现在控制台遍历该集合

	思路：
		1.创建集合对象
		2.往集合中添加字符串对象
		3.遍历集合，首先要能够获得到集合中的每一个元素，这个通过get(int index)方法实现
		4.遍历集合，其次要能够获得集合的长度，这个通过size()方法实现
		5.遍历集合的通用格式

 */
public class ArrayListTest01 {
    public static void main(String[] args) {
        // 创建集合对象
        ArrayList<String> array = new ArrayList<String>();
        // 往集合中添加字符串对象
        array.add("额尔敦");
        array.add("花梓玮");
        array.add("曹澄海");

        // 遍历集合，首先要能够获得到集合中的每一个元素，这个通过get(int index)方法实现
        // 遍历集合，其次要能够获得集合的长度，这个通过size()方法实现
        // 遍历集合的通用格式
        for(int i = 0; i< array.size(); i++)
        {
            System.out.println(array.get(i));
        }




    }
}
