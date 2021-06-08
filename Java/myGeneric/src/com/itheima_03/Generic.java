package com.itheima_03;
/*
public class Generic {
    public void show(String s){
        System.out.println(s);
    }

    public void show(Integer i){
        System.out.println(i);
    }

    public void show(Boolean b){
        System.out.println(b);
    }

    public void show(double d) {
        System.out.println(d);
    }
}
*/
//// 泛型类改进
//public class Generic<T>{
//    public void show(T t){
//        System.out.println(t);
//    }
//}

// 泛型方法改进
public class Generic<T>{
    public <T> void show(T t){
        System.out.println(t);
    }
}