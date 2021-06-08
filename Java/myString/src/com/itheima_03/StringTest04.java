package com.itheima_03;
/*
	需求：定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台输出结果。例如，数组为int[] arr = {1,2,3,};，执行方后的结果输出为[1,2,3]

	思路：
		1.定义一个int类型的数字，用静态初始化完成数组元素的初始化
		2.定义一个方法， 用于吧int数组中的数据按照指定格式拼接成一个字符串返回。
			返回值类型String，参数列表 int[] arr
		3.在方法中遍历数组，按照要求进行拼接
		4.调用方法，用一个变量接受结果
		5.输出结果

 */
public class StringTest04 {
    public static void main(String[] args) {
        // 定义一个int类型的数字，用静态初始化完成数组元素的初始化
        int[] arr = {1,2,3};

        // 调用方法，用一个变量接受结果
        String result = arrayToString(arr);

        // 输出结果
        System.out.println(result);
    }

    // 定义一个方法， 用于吧int数组中的数据按照指定格式拼接成一个字符串返回。
    // 返回值类型String，参数列表 int[] arr

    public static String arrayToString(int[] arr)
    {
        String s = "";
        s += "[";

        // 在方法中遍历数组，按照要求进行拼接
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(i == arr.length-1)
            {
                s += arr[i];
            }
            else
            {
                s += arr[i];
                s += ", ";
            }
        }

        s += "]";

        return s;
    }
}
