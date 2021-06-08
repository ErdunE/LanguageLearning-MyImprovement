package com.itheima_06;
/*
	需求: 设计一个方法用于获取数组中元素的最大值，调用方法并输出结果

	思路:
		1.定义一个数组，用静态初始化完成数组的元素初始化
		2.定义一个方法，用来获取数组中的最大值

		3.调用获取最大值的方法，用变量接受返回结果
		4.把结果输出在控制台
 */
public class MethodTest2 {
    public static void main(String[] args) {
        //定义一个数组，用静态初始化完成数组的元素初始化
        int[] arr = {12,45,98,73,60};

        //调用获取最大值的方法，用变量接受返回结果
        int maxNumber = getMax(arr);

        // 把结果输出在控制台
        System.out.println(maxNumber);
    }

    // 定义一个方法，用来获取数组中的最大值
    public static int getMax(int[] arr)
    {
        int max=0;
        for(int i = 0 ; i < arr.length ; i ++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }

        }
        return max;
    }
}
