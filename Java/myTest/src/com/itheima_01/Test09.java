package com.itheima_01;
/*
    需求：已知一个数组arr = {19,28,37,46,50}; 用程序实现把数组中的元素值交换；
         交换后的数组arr={50,46,37,28,19}; 并在控制台输出交换后的数组元素
 */
public class Test09 {
    public static void main(String[] args) {
        int[] arr = {19,28,37,46,50};

        reverse(arr); // 翻转
        printArray(arr); // 输出
    }

    public static void reverse(int[] arr)
    {
        for(int left = 0, right = arr.length - 1 ; left <= right; left++,right--)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
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
        System.out.print("]");
    }
}
