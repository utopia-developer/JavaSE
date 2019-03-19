package part3_Java常用工具类.chapter19_集合.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");

        //显示
        System.out.println("集合中的元素为：");
        show(set);

        //插入元素(无序)
        System.out.println("插入元素f后集合中的元素为：");
        set.add("f");
        show(set);

        //插入重复数据 - 不会插入且不会产生报错
        System.out.println("插入重复元素a后集合中的元素为：");
        set.add("a");
        show(set);
    }

    //利用迭代器进行集合遍历
    private static void show(Set set) {
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
