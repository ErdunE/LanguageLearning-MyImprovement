package com.itheima_01;

import java.util.ArrayList;

/*
	ArrayList常用方法：
		public boolean remove(Object): 删除指定的元素，返回删除是否成功
		public E remove(int index):删除指定索引处的元素，返回被删除的元素
		public E set(int index,E element):修改指定索引处的元素，返回被修改的元素
		public E get(int index):返回指定索引处的元素
		public int size():返回集合中的元素的个数
 */
public class ArrayListDemo02 {
    public static void main(String[] args) {
        // 创造集合
        ArrayList<String> array = new ArrayList<String>();

        // 添加元素
        array.add("hello");
        array.add("world");
        array.add("java");

        // public boolean remove(Object): 删除指定的元素，返回删除是否成功
        System.out.println(array.remove("world"));
        System.out.println(array.remove("javaee"));

        // public E remove(int index):删除指定索引处的元素，返回被删除的元素
        System.out.println(array.remove(1));
        // System.out.println(array.remove(3));
        // IndexOutOfBoundsException 索引越界

        // public E set(int index,E element):修改指定索引处的元素，返回被修改的元素
        System.out.println(array.set(0,"javaee"));

        // public E get(int index):返回指定索引处的元素
        System.out.println(array.get(0));

        // public int size():返回集合中的元素的个数
        System.out.println(array.size());


        // 输出集合
        System.out.println("array:" + array);




    }
}
