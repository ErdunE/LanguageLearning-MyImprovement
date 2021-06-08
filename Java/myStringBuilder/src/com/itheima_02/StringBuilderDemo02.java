package com.itheima_02;
/*
	StringBuilder 转换为 String
		public String toString()：通过 toString() 就可以实现吧StringBuilder 转换为 String
	String 转换为 StringBuilder
		public StringBuilder(String s)：通过构造方法就可以实现把String转换为StringBuilder
 */
public class StringBuilderDemo02 {
    public static void main(String[] args) {
        // StringBuilder 转换为 String
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        // String s = sb; // 错误的方法
        // public String toString()：通过 toString() 就可以实现吧StringBuilder 转换为 String
        String s = sb.toString();
        System.out.println(s);

        String s1 = "world";
        // StringBuilder sb1 = s1; // 错误的方法
        StringBuilder sb1 = new StringBuilder(s1);
        System.out.println(sb1);
    }
}
