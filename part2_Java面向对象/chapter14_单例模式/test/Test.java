package part2_Java面向对象.chapter14_单例模式.test;

import part2_Java面向对象.chapter14_单例模式.singleton.Singleton_Hungry;
import part2_Java面向对象.chapter14_单例模式.singleton.Singleton_Lazy;

public class Test {
    public static void main(String[] args) {
        Singleton_Hungry one = Singleton_Hungry.getInstance();
        Singleton_Hungry two = Singleton_Hungry.getInstance();
        System.out.println(one);
        System.out.println(two);
        System.out.println(one == two);
        System.out.println("========================");
        Singleton_Lazy three = Singleton_Lazy.getInstance();
        Singleton_Lazy four = Singleton_Lazy.getInstance();
        System.out.println(three);
        System.out.println(four);
        System.out.println(three == four);
    }
}
