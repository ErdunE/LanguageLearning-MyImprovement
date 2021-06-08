package com.itheima_03;

import java.util.Scanner;

/*
	需求：
		已知用户名和密码，请用程序实现模拟用户登录。总共给三次机会，登录之后，给出相应提示。

	思路：
		1：已知用户名和密码，定义两个字符串表示即可
		2：键盘录入要登录的用户名和密码，用Scanner实现
		3：拿键盘录入的用户名、密码和已知的用户名密码进行比较，给出相应的提示。字符串的内容比较，用equals()
		4：用循环实现多次机会，这里的次数明确，所以采用for循环实现，并在登陆成功的时候，使用break结束循环
 */
public class StringTest01 {
    public static void main(String[] args) {
        // 已知用户名和密码，定义两个字符串表示即可
        String username = "asdfghjkl;";
        String password = "1234567890";

        // 键盘录入要登录的用户名和密码，用Scanner实现
        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i < 3 ; i++)
        {
            System.out.println("请输入您的用户名:");
            String getUserName = sc.nextLine();
            if(getUserName.equals(username))
            {
                System.out.println("请输入您的密码:");
                String getUserPassword = sc.nextLine();
                if(getUserPassword.equals(password))
                {
                    System.out.println("登陆成功!");
                    break;
                }
                else
                {
                    System.out.println("密码输入错误。");
                }
            }
            else
            {
                System.out.println("用户名输入错误。(剩余次数" + (2-i) + "次)");
            }
        }
    }
}
