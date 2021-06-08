package com.itheima_01;

import java.util.Scanner;

/*

 */
public class DebugTest01 {
    public static void main(String[] args) {
        // 创建对象
        Scanner sc = new Scanner(System.in);

        // 接受数据
        System.out.println("请输入第一个整数:");
        int a = sc.nextInt();

        // 调用方法
        System.out.println("请输入第二个整数:");
        int b = sc.nextInt();

        // 输出结果
        int result = getMax(a,b);
        System.out.println("较大的整数是:" + result);

    }

    // 获取两个数的较大值
    public static int getMax(int a, int b)
    {
        if(a > b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }


}
