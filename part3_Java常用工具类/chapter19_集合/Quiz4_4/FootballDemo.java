package part3_Java常用工具类.chapter19_集合.Quiz4_4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FootballDemo {
    public static void main(String[] args) {
        //定义HashMap的对象并添加数据
        Map<Integer, String> map = new HashMap<>();
        map.put(2014, "德国");
        map.put(2010, "西班牙");
        map.put(2006, "意大利");
        map.put(2002, "巴西");
        map.put(1998, "法国");
        //使用迭代器的方式遍历
        System.out.println("使用迭代器方式输出");
        Iterator<String> iterator = map.values().iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        //使用EntrySet同时获取key和value
        System.out.println("使用EntrySet进行输出");
        Set<Entry<Integer, String>> set = map.entrySet();
        for (Entry<Integer, String> entry : set) {
            System.out.print(entry.getKey() + "-");
            System.out.println(entry.getValue());
        }
    }
}
