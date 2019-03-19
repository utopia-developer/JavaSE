package part3_Java常用工具类.chapter19_集合.set.test;

import part3_Java常用工具类.chapter19_集合.set.model.Cat;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Cat one = new Cat("a", 12, "1");
        Cat two = new Cat("b", 12, "2");

        Set<Cat> set = new HashSet<>();
        set.add(one);
        set.add(two);

        System.out.println("set中的元素为：");
        show(set);
        System.out.println("==================");

        // 通过重写hashCode()方法和equals()方法，避免添加重复数据
        //先使用hashCode()方法判断，再使用equals()方法判断
        Cat three = new Cat("b", 12, "2");
        set.add(three);
        System.out.println("重写hashCode()方法和equals()方法后，添加重复元素：");
        show(set);

        //查询
        //1. 通过对象名查找
        System.out.println("==================");
        if (set.contains(one)) {
            System.out.println("存在");
            System.out.println(one);
        } else {
            System.out.println("不存在");
        }
        //2. 通过对象的属性查找
        System.out.println("==================");
        Iterator<Cat> iterator = set.iterator();
        boolean flag = false;
        Cat cat = null;
        while (iterator.hasNext()) {
            cat = iterator.next();
            if (cat.getName().equals("b")) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("存在");
            System.out.println(cat);
        } else {
            System.out.println("不存在");
        }

        //删除
        System.out.println("==================");
        iterator = set.iterator();
        for (Cat cat1 : set) {
            if (cat1.getName().equals("a")) {
                set.remove(cat1);
                /*集合为防止数据的不一致，使用ConcurrentModificationException异常来
                阻止读取元素的同时进行删除，通过break语句实现找到元素后不再进行下一次遍历，
                从而实现元素删除（出现在foreach中）
                导致原因：modCount!=expectModCount
                 */
                break;
            }
        }
        System.out.println("删除后元素为：");
        show(set);

        //删除多个元素
        System.out.println("==================");
        Cat four = new Cat("b", 13, "2");
        Cat five = new Cat("c", 14, "3");
        Cat six = new Cat("d", 15, "3");
        set.add(four);
        set.add(five);
        set.add(six);
        System.out.println("删除多个元素前的集合：");
        show(set);
        Set<Cat> cats = new HashSet<>();
        for (Cat cat1 : set) {
            if (cat1.getSpecies().equals("2")) {
                cats.add(cat1);
            }
        }
        set.removeAll(cats);
        System.out.println("删除多个元素后的集合：");
        show(set);

        //清空集合
        System.out.println("=======================");
        set.clear();
        if (set.isEmpty()) {
            System.out.println("集合现有元素为：" + set.size());
            System.out.println("集合已清空");
        } else {
            System.out.println("集合未清空");
        }
    }

    private static void show(Set set) {
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
