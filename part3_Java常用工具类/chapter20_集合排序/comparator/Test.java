package part3_Java常用工具类.chapter20_集合排序.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Cat one = new Cat("bbbb", 2, "222");
        Cat two = new Cat("cccc", 3, "333");
        Cat three = new Cat("aaaa", 1, "111");
        List<Cat> list = new ArrayList<>();
        list.add(one);
        list.add(two);
        list.add(three);
        //排序前
        System.out.println("排序前：");
        for (Cat cat : list) {
            System.out.println(cat);
        }
        //按名字升序排序
        NameComparator nameComparator = new NameComparator();
        Collections.sort(list, nameComparator);
        //按名字升序排序后输出
        System.out.println("按名字升序排序后：");
        for (Cat cat : list) {
            System.out.println(cat);
        }
        //按年龄降序排序
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list, ageComparator);
        //按年龄降序排序后输出
        System.out.println("按年龄降序排序后：");
        for (Cat cat : list) {
            System.out.println(cat);
        }
    }
}
