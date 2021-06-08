package com.itheima_01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
	Map集合的获取功能
		V get(Object key):根据键获取值
		Set<K> keySet():获取所有键的集合
		Collection<V> values():获取所有值的集合
*/
public class MapDemo03 {
    public static void main(String[] args) {
        // 创建集合对象
        Map<String,String> map = new HashMap<String, String>();

        // 添加元素
        map.put("张无忌","赵敏");
        map.put("郭靖","黄蓉");
        map.put("杨过","小龙女");

        // V get(Object key):根据键获取值
        System.out.println(map.get("郭靖")); // 黄蓉
        System.out.println(map.get("张三丰")); // null

        // Set<K> keySet():获取所有键的集合
        Set<String> set = map.keySet();
        for(String key : set){
            System.out.println(key); // 杨过 郭靖 张无忌
        }

        // Collection<V> values():获取所有值的集合
        Collection<String> c = map.values();
        for(String i : c){
            System.out.println(i); // 小龙女 黄蓉 赵敏
        }

        // 输出集合对象
        System.out.println(map);
    }
}
