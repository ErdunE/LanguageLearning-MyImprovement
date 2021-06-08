package com.itheima_02;
/*
	StringBuilder的添加和翻转方法：
		public StringBuilder append(任意类型): 添加数据，返回对象本身
		public StringBuilder reverse(): 返回相反的字符序列
 */
public class StringBuilderDemo01 {
    public static void main(String[] args) {
        // 创建对象
        StringBuilder sb = new StringBuilder();

        // public StringBuilder append(任意类型): 添加数据，返回对象本身
        sb.append("hello");
        sb.append("world");
        sb.append("java");
        sb.append(100);

        // 链式编程
        sb.append("hello").append("world").append("java").append(100);

        System.out.println(sb);

        // public StringBuilder reverse(): 返回相反的字符序列
        sb.reverse();
        System.out.println(sb);
    }
}
