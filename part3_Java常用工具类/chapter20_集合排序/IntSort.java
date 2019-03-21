package part3_Java常用工具类.chapter20_集合排序;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//对存储在List中的整型数据进行排序
public class IntSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(1);
        System.out.println("排序前：");
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
        //对list中的数据进行排序
        Collections.sort(list);
        System.out.println("排序后：");
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
