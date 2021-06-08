package com.itheima_09;

import java.util.LinkedList;

/*
	LinkedList 集合的特有功能
		public void addFirst(E e):在该列表开头插入指定的元素
		public void addLast(E e):将指定的元素追加到此列表的末尾

		public E getFirst():返回此列表中的第一个元素
		public E getLast():返回此列表中的最后一个元素

		public E removeFirst(): 从此列表中删除并返回第一个元素
		public E removeLast(): 从此列表中删除并返回最后一个元素

*/
public class LinkedListDemo {
    public static void main(String[] args) {
        // 创建集合对象
        LinkedList<String> list = new LinkedList<String>();

        // 添加元素
        list.add("hello");
        list.add("world");
        list.add("java");
        System.out.println(list);

        // public void addFirst(E e):在该列表开头插入指定的元素
        // public void addLast(E e):将指定的元素追加到此列表的末尾
        list.addFirst("erdune");
        list.addLast("erdune");
        System.out.println(list);

        // public E getFirst():返回此列表中的第一个元素
        // public E getLast():返回此列表中的最后一个元素
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        // public E removeFirst(): 从此列表中删除并返回第一个元素
        // public E removeLast(): 从此列表中删除并返回最后一个元素
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}
