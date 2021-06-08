package com.itheima_04;

import java.util.HashMap;
import java.util.Set;

/*
	需求：创建一个HashMap集合，键是学生对象(Student)，值是居住地(String)。存储多个键值对元素，并遍历。要求保证键的唯一性：如果学生对象的成员变量值相同，我们就认为是同一个对象

	思路：
		1.定义学生类
		2.创建HashMap集合对象
		3.创建学生对象
		4.把学生添加到集合
		5.遍历集合
		6.在学生类中重写两个方法
			hashCode()
			equals()
*/
public class HashMapDemo {
    public static void main(String[] args) {
        // 创建HashMap集合对象
        HashMap<Student,String> hm = new HashMap<Student, String>();

        // 创建学生对象
        Student s1 = new Student("Erdun",26);
        Student s2 = new Student("Ziwei",25);
        Student s3 = new Student("Chenghai",24);
        Student s4 = new Student("Chenghai",24);

        // 把学生添加到集合
        hm.put(s1,"Beijing");
        hm.put(s2,"Xi'an");
        hm.put(s3,"Qiqihar");
        hm.put(s4,"Nanjing");

        // 遍历集合
        Set<Student> keySet = hm.keySet();
        for(Student key : keySet){
            String value = hm.get(key);
            System.out.println(key.getName()+", "+key.getAge()+", "+value);
        }

    }
}
