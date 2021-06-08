package com.itheima_01;

import java.util.Scanner;

/*
    	需求：在编程竞赛中，有6位评委为参赛的选手大飞，分数为0-100整数分。
             选手的最后得分为：去掉一个最高分和一个最低后的4个评委平均值（不考虑小数部分）
 */
public class Test10 {
    public static void main(String[] args) {
        // 定义一个数组，长度为6，动态初始化
        int[] arr = new int[6];

        // 键盘录入评委评分
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<6 ; i++)
        {
            System.out.println("请输入第"+(i+1)+"个评委的评分：");
            arr[i] = sc.nextInt();
        }
        System.out.print("6个评委的评分为：");
        printArray(arr);

        System.out.print("去掉一个最高分：");
        int maxNumber = getMax(arr);
        System.out.println(maxNumber);

        System.out.print("去掉一个最低分：");
        int minNumber = getMin(arr);
        System.out.println(minNumber);


        int result = getAvg(arr,maxNumber,minNumber);
        System.out.println("最终的平均分是："+result);



    }

    public static int getMax(int[] arr)
    {
        int max = 0;
        for(int i = 0; i<arr.length ; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        return max;
    }
    public static int getMin(int[] arr)
    {
        int min = 100;
        for(int i = 0; i<arr.length ; i++)
        {
            if(min > arr[i])
            {
                min = arr[i];
            }
        }
        return min;
    }

    public static int getAvg(int[] arr,int max,int min)
    {
        int sum = 0;
        int avg = 0;
        for(int i = 0; i<arr.length ; i++)
        {
            sum += arr[i];
        }
        avg = (sum - max - min)/(arr.length-2);
        return avg;
    }

    public static void printArray(int[] arr)
    {
        System.out.print("[");

        for(int i = 0; i<arr.length ; i++)
        {
            if(i == arr.length - 1)
            {
                System.out.print(arr[i]);
            }
            else
            {
                System.out.print(arr[i]+", ");
            }
        }
        System.out.println("]");
    }
}
