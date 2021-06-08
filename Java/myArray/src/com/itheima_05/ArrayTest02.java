package com.itheima_05;
/*
    获取最值
        获取数组中的最大值
 */

public class ArrayTest02 {
    public static void main(String[] args) {

        // 定义数组
        int[] arr = {12,45,98,73,60};

        // 定义一个变量，用于保存最大值
        int max = 0;

        // 与数组中的数据逐个对比，每次比对将最大值保存到变量中
        for(int i = 0; i<arr.length ; i++)
        {
            if(max<arr[i])
            {
                max = arr[i];
            }
        }

        // 循环结束后打印变量的值
        System.out.println(max);

    }
}
