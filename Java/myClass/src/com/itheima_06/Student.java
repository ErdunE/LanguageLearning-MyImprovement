package com.itheima_06;
/*
    学生类
 */
public class Student {
    // 成员变量
    private String name;
    private int age;
    // 提供get/set方法
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    public void setAge(int age)
    {
        if(age<0 || age>120)
        {
            System.out.println("您给的年龄有误");
        }
        else
        {
            this.age = age;
        }
    }
    public int getAge()
    {
        return age;
    }

    // 成员方法
    public void show()
    {
        System.out.println(name + "," + age);
    }
}
