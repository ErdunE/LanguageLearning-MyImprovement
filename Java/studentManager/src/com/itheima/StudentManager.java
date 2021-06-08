package com.itheima;
import java.util.ArrayList;
import java.util.Scanner;
/*
    学生管理系统
 */
public class StudentManager {

    public static void main(String[] args) {
    /*
    	主界面的代码编写

	    思路：
		    1.用输出语句完成主界面的编写
		    2.用Scanner实现键盘录入数据
		    3.用switch语句完成操作的选择
	    	4.用循环完成再次回到主界面
     */
        // 创建集合对象 用于存储学生集合数据
        ArrayList<Student> array = new ArrayList<Student>();
        // 用循环完成再次回到主界面
        while (true)
        {
            // 用输出语句完成主界面的编写
            System.out.println("————欢迎来到学生管理系统————");
            System.out.println("1.添加学生信息");
            System.out.println("2.删除学生信息");
            System.out.println("3.修改学生信息");
            System.out.println("4.查看所有学生信息");
            System.out.println("5.退出学生管理系统");
            System.out.println("————————————————————————");
            System.out.println("请输入您的选择：");

            // 用Scanner实现键盘录入数据
            Scanner sc = new Scanner(System.in);
            String userInput = sc.nextLine();
            System.out.println("————————————————————————");

            // 用switch语句完成操作的选择
            switch (userInput){
                case"1":
                    System.out.println("添加学生信息");
                    addStudent(array);
                    System.out.println("————————————————————————");
                    break;
                case"2":
                    System.out.println("删除学生信息");
                    deleteStudent(array);
                    System.out.println("————————————————————————");
                    break;
                case"3":
                    System.out.println("修改学生信息");
                    updateStudent(array);
                    System.out.println("————————————————————————");
                    break;
                case"4":
                    System.out.println("查看所有学生信息");
                    findAllStudent(array);
                    System.out.println("————————————————————————");
                    break;
                case"5":
                    System.out.println("谢谢使用");
                    System.out.println("————————————————————————");
                    System.exit(0);
            }
            // 循环完成再次回到主界面
        }
    }
    // 定义一个方法，判断学号是否被使用
    public static boolean sidIsUsed(ArrayList<Student> array,String sid){
        /*
            	解决添加学生学号重复问题

            	思路：
	            	1.定义一个方法，对学号是否被使用进行判断
		            	1.如果与集合中的某一个学生学号相同，返回true
		            	2.如果都不相同，返回false
	            	2.在添加学生录入学号后调用该方法
		            	1.如果返回true，弹出提示，重新输入学号
	            		2.如果返回false，正常添加学生对象
         */
        // 如果与集合中的某一个学生学号相同，返回true
        boolean flag = false;

        for(int i = 0 ; i < array.size() ; i++)
        {
            Student s = array.get(i);
            if(s.getSid().equals(sid))
            {
                flag = true;
                break;
            }
        }
        // 如果都不相同，返回false
        return flag;
    }

    // 定义一个方法，用于添加学生信息
    public static void addStudent(ArrayList<Student> array) {
        /*
        	添加学生的代码编写

	            思路：
		            1.用键盘录入选择添加学生
	            	2.定义一个方法，用于添加学生
	            		1.显示提示信息，提示要输入何种信息
		            	2.键盘录入学生对象所需要的数据
		            	3.创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
	            		4.将学生对象添加到集合中(保存)
	            		5.给出添加成功提示
	            	4.调用方法
         */
        Scanner sc = new Scanner(System.in);

        String sid;

        while(true)
        {
            // 显示提示信息，提示要输入何种信息
            // 键盘录入学生对象所需要的数据
            System.out.println("请输入该学生的学号:");
            sid = sc.nextLine();

            boolean flag = sidIsUsed(array,sid);
            if(flag)
            {
                System.out.println("你输入的学生学号已经被占用，请重新输入");
            }
            else
            {
                break;
            }
        }



        System.out.println("请输入该学生的姓名:");
        String name = sc.nextLine();
        System.out.println("请输入该学生的年龄:");
        String age = sc.nextLine();
        System.out.println("请输入该学生的居住地:");
        String address = sc.nextLine();

        // 创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        // 将学生对象添加到集合中(保存)
        array.add(s);

        // 给出添加成功提示
        System.out.println("成功添加该学生");
    }

    // 定义一个方法，用于查看学生信息
    public static void findAllStudent(ArrayList<Student> array) {
        /*
        	查看学生的代码编写

	            思路：
		            1.用键盘录入选择查看所有学生信息
		            2.定义一个方法，用于查看学生信息
		                // 判断集合中是否有数据，如果没有提示信息
		            	1.显示表头信息
		            	2.将集合中数据取出按照对应格式显示学生信息，年龄显示补充“岁”
		            3.调用方法
         */
        // 判断集合中是否有数据，如果没有提示信息
        if(array.size() == 0)
        {
            System.out.println("没有任何学生信息，请先添加学生信息，再查询");
        }
        else
        {
            // 显示表头信息
            // \t 其实就是tab键的位置
            System.out.println("学号\t\t\t姓名\t\t年龄\t\t居住地");

            // 将集合中数据取出按照对应格式显示学生信息，年龄显示补充“岁”
            for(int i = 0; i<array.size() ; i++)
            {
                Student s = array.get(i);
                System.out.println(s.getSid()+"\t"+s.getName()+"\t"+s.getAge()+"岁"+"\t"+s.getAddress());
            }
        }
    }

    // 定义一个方法，用于删除学生信息
    public static void deleteStudent(ArrayList<Student> array){
        /*
            	删除学生的代码编写

	            思路：
	            	1.用键盘录入选择删除学生信息
	            	2.定义一个方法，用于删除学生信息
	            		1.显示提示信息
		            	2.键盘录入要删除的学生学号
		            	3.遍历集合将对应学生对象从集合中删除
		            	4.给出删除成功提示
		            3.调用方法
         */
        // 显示提示信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生的学号:");

        // 键盘录入要删除的学生学号
        String sid = sc.nextLine();

        /*
        	解决删除修改/修改学生学号不存在问题

	            思路：
		            1.在删除/修改学生操作前，对学号是否存在进行判断
		            	1.如果不存在，显示提示信息
			            2.如果存在，执行删除/修改操作
         */
        // 判断学号是否存在
        // 遍历集合将对应学生对象从集合中删除
        int index = -1;
        for(int i = 0; i< array.size();i++)
        {
            Student s = array.get(i);
            if(s.getSid().equals(sid))
            {
                index = i;
                break;
            }
        }
        if(index == -1)
        {
            System.out.println("该学生信息不存在，请重新输入");
        }
        else
        {
            array.remove(index);
        }

        // 给出删除成功提示
        System.out.println("删除学生成功");


    }

    // 定义一个方法，用于修改学生信息
    public static void updateStudent(ArrayList<Student> array){
        /*
            	修改学生的代码编写

	            思路：
	            	1.用键盘录入选择修改学生信息
	            	2.定义一个方法，用于修改学生信息
		            	1.显示提示信息
		            	2.键盘录入要修改的学生学号
	            		3.键盘录入要修改的学生信息
	            		3.遍历集合修改对应学生的信息
		            	4.给出修改成功提示
	            	3.调用方法
         */
        // 显示提示信息
        System.out.println("请输入您要修改的学生的学号:");

        // 键盘录入要修改的学生学号
        Scanner sc = new Scanner(System.in);
        String sid = sc.nextLine();



        // 遍历集合修改对应学生的信息
        int index = -1;

        for(int i = 0 ; i < array.size() ; i++)
        {
            Student student = array.get(i);
            if(student.getSid().equals(sid))
            {
                index = i;
                break;
            }
        }
        if(index == -1)
        {
            System.out.println("该学生信息不存在，请重新输入");
        }
        else
        {
            // 键盘录入要修改的学生信息
            System.out.println("请输入您修改的学生的新姓名:");
            String name = sc.nextLine();
            System.out.println("请输入您修改的学生的新年龄:");
            String age = sc.nextLine();
            System.out.println("请输入您修改的学生的新居住地:");
            String address = sc.nextLine();

            // 创建学生对象
            Student s = new Student();
            s.setSid(sid);
            s.setName(name);
            s.setAge(age);
            s.setAddress(address);

            array.set(index,s);
        }

        // 给出修改成功提示
        System.out.println("修改该学生信息成功");

    }
}
