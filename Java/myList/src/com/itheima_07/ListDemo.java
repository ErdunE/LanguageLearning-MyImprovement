package com.itheima_07;

import java.util.ArrayList;
import java.util.LinkedList;

/*
	List集合常用子类：ArrayList，LinkedList
		ArrayList：底层数据结构是数组，查询快，增删慢
		LinkedList：底层数据结构是链表，查询慢，增删快

	练习：
		分别使用ArrayList和LinkedList完成存储字符串并遍历
*/
public class ListDemo {
    public static void main(String[] args) {
        // 创建集合对象
        ArrayList<String> array = new ArrayList<String>();
        array.add("hello");
        array.add("world");
        array.add("java");

        // 遍历
        for(String s : array)
        {
            System.out.println(s);
        }
        for(int i = 0 ; i < array.size() ; i++)
        {
            String s = array.get(i);
            System.out.println(s);
        }

        System.out.println("---------");

        LinkedList<String> list = new LinkedList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");

        for(String s : list)
        {
            System.out.println(s);
        }
        for(int i = 0 ; i<list.size() ;i++)
        {
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
