package com.itheima_01;
/*
	需求：设计一个方法，用于比较两个数组是否相同

	思路：
		1.定义两个数组，分别是用静态初始化数组元素的初始化
		2.定义一个方法，用于比较两个数组的内容是否相同
			返回值类型：boolean
			参数：int[]arr , int[]arr2
		3.比较两个数组的内容是否相同，按照下面的步骤实现就可以了
			首先比较数组长度，如果长度不相同，数组内容肯定不相同，返回false
			其次遍历，比较两个数组中的每一个元素，只要有元素不相同，返回false
			最后循环遍历结束后，返回true
		4.调用方法，用变量接受
		5.输出结果
 */
public class Test07 {
    public static void main(String[] args) {
        // 定义两个数组，分别是用静态初始化数组元素的初始化
        int[] arr = {11,22,33,44,55};
        int[] arr2 = {11,22,33,44,55};

        // 调用方法，用变量接受
        boolean result = compareArray(arr,arr2);

        // 输出结果
        System.out.println(result);

    }

    // 定义一个方法，用于比较两个数组的内容是否相同
    //		返回值类型：boolean
    //		参数：int[]arr , int[]arr2
    public static boolean compareArray(int[] arr, int[] arr2)
    {
        // 首先比较数组长度，如果长度不相同，数组内容肯定不相同，返回false
        if(arr.length != arr2.length)
        {
            return false;
        }
        // 其次遍历，比较两个数组中的每一个元素，只要有元素不相同，返回false
        for(int i = 0 ; i<arr.length ; i++)
        {
            if(arr[i] != arr2[i])
            {
                return false;
            }
        }
        // 最后循环遍历结束后，返回true
        return true;
    }
}
