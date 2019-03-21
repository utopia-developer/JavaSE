package part3_Java常用工具类.chapter20_集合排序;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//对存储在List中的String字符串数据进行排序
public class StringSort {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("c");
        list.add("android");
        list.add("css");
        System.out.println("排序前：");
        for (String str : list) {
            System.out.print(str + " ");
        }
        System.out.println();
        //对list中的数据进行排序
        Collections.sort(list);
        System.out.println("排序后：");
        for (String str : list) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
