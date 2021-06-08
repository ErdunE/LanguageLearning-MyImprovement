package com.itheima_02;
/*
 	String构造方法：
		public String(): 创建一个空白字符串对象，不含有任何内容
		public String(char[] chs): 根据字符数组的内容，来创建字符串对象
		public String(byte[] bys): 根据字符数组的内容，来创建字符串对象
		String s = “abc”; 直接赋值的方式创建字符串对象，内容就是abc

		// 推荐使用直接赋值的方式创建字符串对象
 */
public class StringDemo01 {
    public static void main(String[] args) {
        // public String(): 创建一个空白字符串对象，不含有任何内容
        String str1 = new String();
        System.out.println("Str1:"+str1);

        // public String(char[] chs): 根据字符数组的内容，来创建字符串对象
        char[] chs = {'a','b','c'};
        String str2 = new String(chs);
        System.out.println("Str2:"+str2);

        // public String(byte[] bys): 根据字符数组的内容，来创建字符串对象
        byte[] bys = {97,98,99};
        String str3 = new String(bys);
        System.out.println("Str3:"+str3);

        // String s = “abc”; 直接赋值的方式创建字符串对象，内容就是abc
        String str4 = "abc";
        System.out.println("Str4:"+str4);
    }
}
