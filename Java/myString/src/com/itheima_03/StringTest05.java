package com.itheima_03;

import java.util.Scanner;

/*
    需求：定义一个方法，实现字符串翻转。键盘录入一个字符串，调用该方法后，在控制台输出结果
	例如：键盘录入abc，输出结果cba

	思路：
		1.键盘录入一个字符串，用Scanner实现
		2.定义一个方法，实现字符串翻转，返回值类型String，参数String s
		3.在方法中把字符串倒着遍历，然后把每一个得到的字符拼接成一个字符串并返回
		4.调用方法，用一个变量接受结果
		5.输出结果
 */
public class StringTest05 {
    public static void main(String[] args) {
        // 键盘录入一个字符串，用Scanner实现
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String input = sc.nextLine();

        String result = reverse(input);
        System.out.println(result);

    }
    public static String reverse(String s)
    {
        String temp = "";
        for(int i = s.length()-1; i>=0 ; i--)
        {
            temp += s.charAt(i);
        }
        return temp;
    }
}
