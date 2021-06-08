package com.itheima;

import java.io.File;

/*
	File：文件和目录路径名的抽象表示
		1.文件和目录是可以通过File封装成对象的
		2.对于File而言，其封装的并不是一个真正存在的文件，仅仅是一个路径名而已。它可以使存在的，也可以是不存在的。将来是要通过具体的操作把这个路径的内容转换为具体存在的

	构造方法：
		File(String pathname):通过将给定的路径名字符串转换为抽象路径名来创造新的File实例
		File(String parent, String child):从父路径名字符串和子路径名字符串创建新的File实例
		File(File parent, String Child):从父抽象路径名和子路径名字符串创建新的File实例
*/
public class FileDemo01 {
    public static void main(String[] args) {
        // File(String pathname):通过将给定的路径名字符串转换为抽象路径名来创造新的File实例
        File f1 = new File("E:\\itcast\\java.txt");
        System.out.println(f1);

        // File(String parent, String child):从父路径名字符串和子路径名字符串创建新的File实例
        File f2 = new File("E:\\itcast","java.txt");
        System.out.println(f2);

        // File(File parent, String Child):从父抽象路径名和子路径名字符串创建新的File实例
        File f3 = new File("E:\\itcast");
        File f4 = new File(f3,"java.txt");
        System.out.println(f4);

    }
}
