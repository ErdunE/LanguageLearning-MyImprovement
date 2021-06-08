package com.itheima_01;
/*
	冒泡排序：
		一种排序的方式，对要进行排序的数据中相邻的数据进行两两比较，将较大的数据放在后面
		依次对所有的数据进行操作，直至所有的数据都按要求完成排序
 */
public class ArrayDemo {
    public static void main(String[] args) {
        // 定义一个数组
        int[] arr = {24,69,80,57,13};
        System.out.println("排序前:"+arrayToString(arr));

        // 第一次比较
        for(int i = 0 ; i<arr.length-1 ; i++)
        {
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("第一次排序后:"+arrayToString(arr));

        // 第二次比较
        for(int i = 0 ; i<arr.length-1-1 ; i++)
        {
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("第二次排序后:"+arrayToString(arr));

        // 第三次比较
        for(int i = 0 ; i<arr.length-1-1-1 ; i++)
        {
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("第三次排序后:"+arrayToString(arr));

        // 双循环后
        for(int j = 0;j<arr.length-1;j++){
            for(int i = 0 ; i<arr.length-1-j ; i++)
            {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        System.out.println("最后排序后:"+arrayToString(arr));


    }

    // 把数组中的元素按照指定的规则组成一个字符串[元素1，元素2...]
    public static String arrayToString(int[] arr)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i=0; i<arr.length ; i++)
        {
            if(i==arr.length-1)
            {
                sb.append(arr[i]);
            }
            else
            {
                sb.append(arr[i]);
                sb.append(", ");
            }
        }
        sb.append("]");
        String s = sb.toString();
        return s;
    }
}
