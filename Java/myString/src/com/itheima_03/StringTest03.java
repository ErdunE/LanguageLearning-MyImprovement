package com.itheima_03;

import java.util.Scanner;

/*
	需求：键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数（不考虑其他字符）

	思路：
		1.键盘录入一个字符串，用Scanner实现
		2.要统计三种类型的字符个数，需定义三哥统计变量，初始值都为0
		3.遍历字符串，得到每一个字符
		4.判断该字符属于哪种类型，然后对应类型的统计变量+1
		5.输出三种类型的字符个数
 */
public class StringTest03 {
    public static void main(String[] args) {
        // 键盘录入一个字符串，用Scanner实现
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String line = sc.nextLine();

        // 要统计三种类型的字符个数，需定义三哥统计变量，初始值都为0

        int capital = 0;
        int lowercase = 0;
        int number = 0;

        // 遍历字符串，得到每一个字符

        for(int i = 0 ; i < line.length() ; i++)
        {
            char ch = line.charAt(i);
            // 判断该字符属于哪种类型，然后对应类型的统计变量+1
            if(ch >= 'A' && ch <= 'Z')
            {
                capital++;
            }
            else if (ch >= 'a' && ch <= 'b')
            {
                lowercase++;
            }
            else if (ch >= '0' && ch <= '9')
            {
                number++;
            }
        }

        // 输出三种类型的字符个数
        System.out.println("大写字母的数量是" + capital + "个");
        System.out.println("小写字母的数量是" + lowercase + "个");
        System.out.println("数字的数量是" + number + "个");




    }
}
