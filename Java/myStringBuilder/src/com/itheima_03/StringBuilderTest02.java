package com.itheima_03;

import java.util.Scanner;

/*
	需求：定义一个方法，实现字符串翻转。键盘录入一个字符串，调用该方法后，在控制台输出结果
	例如，键盘录入abc，输出结果cba

	思路：
		1.键盘录入一个字符串，用Scanner实现
		2.定义一个方法，实现字符串翻转。返回值类型String，参数String s
		3.在方法中用StringBuilder实现字符串的翻转，并把结果转成String返回
		4.调用方法，用一个变量接受结果
		5.输出结果
 */
public class StringBuilderTest02 {
    public static void main(String[] args) {
        // 键盘录入一个字符串，用Scanner实现
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.nextLine();

        // 调用方法，用一个变量接受结果
        String result = reverse(s);
        // 输出结果
        System.out.println(result);
    }

    // 定义一个方法，实现字符串翻转。返回值类型String，参数String s
    public static String reverse(String s)
    {
        // 在方法中用StringBuilder实现字符串的翻转，并把结果转成String返回
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String s1 = sb.toString();

        return s1;
    }
}
