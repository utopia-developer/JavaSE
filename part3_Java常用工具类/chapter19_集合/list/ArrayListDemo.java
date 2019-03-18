package part3_Java常用工具类.chapter19_集合.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Java");
        list.add("HTML");
        list.add("CSS");
        list.add("JavaScript");
        list.add("C");
        System.out.println("list中元素的个数为：" + list.size());
        System.out.println("============================");

        System.out.println("list中的元素为：");
        printList(list);

        System.out.println("删除C后的list元素为：");
        list.remove(4);
        printList(list);

        System.out.println("删除JavaScript后的list元素为：");
        list.remove("JavaScript");
        printList(list);
    }

    private static void printList(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("============================");
    }
}
