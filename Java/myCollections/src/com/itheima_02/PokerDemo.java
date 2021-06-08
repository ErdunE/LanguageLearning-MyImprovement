package com.itheima_02;

import java.util.ArrayList;
import java.util.Collections;

/*
	模拟斗地主

	需求：通过程序实现斗地主过程中的洗牌，发牌和看牌

	思路：
		1.创建一个牌盒，也就是定义一个集合对象，用ArrayList实现
		2.往牌盒里面装牌
		3.洗牌，也就是把牌打散，用Collections的shuffle()方法实现
		4.发牌，也就是遍历集合，给三个玩家发牌
		5.看牌，也就是三个玩家分别遍历自己的牌
*/
public class PokerDemo {
    public static void main(String[] args) {
        // 创建一个牌盒，也就是定义一个集合对象，用ArrayList实现
        ArrayList<String> array = new ArrayList<String>();

        // 往牌盒里面装牌
            /*
            ♦2,♦3,♦4....♦K,♦A
            ♠2,♠3,♠4....♠K,♠A
            ♥2,♥3,♥4....♥K,♥A
            ♣2,♣3,♣4....♣K,♣A
            大王，小王
             */
        // 定义花色数组
        String[] colors = {"♦️", "♠️", "♥️", "♣️"};
        // 定义点数数组
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (String color : colors) {
            for (String number : numbers) {
                array.add(color + number);
            }
        }
        array.add("小王");
        array.add("大王");

        // 洗牌，也就是把牌打散，用Collections的shuffle()方法实现
        Collections.shuffle(array);

        // 发牌，也就是遍历集合，给三个玩家发牌
        ArrayList<String> yunaArray = new ArrayList<String>();
        ArrayList<String> erdunArray = new ArrayList<String>();
        ArrayList<String> ziweiArray = new ArrayList<String>();
        ArrayList<String> threeCardsArray = new ArrayList<String>();

        for (int i = 0; i < array.size(); i++) {
            String cards = array.get(i);
            if (i >= array.size() - 3) {
                threeCardsArray.add(cards);
            } else if (i % 3 == 0) {
                yunaArray.add(cards);
            } else if (i % 3 == 1) {
                erdunArray.add(cards);
            } else if (i % 3 == 2) {
                ziweiArray.add(cards);
            }
        }

        // 看牌，也就是三个玩家分别遍历自己的牌
        lookCards("Yuna",yunaArray);
        lookCards("Erdun",erdunArray);
        lookCards("Ziwei",ziweiArray);
        lookCards("底牌",threeCardsArray);
    }

    // 看牌的方法
    public static void lookCards(String name, ArrayList<String> array){
        System.out.print(name+"的牌是：");
        for(String card : array){
            System.out.print(card+" ");
        }
        System.out.println();
    }
}
