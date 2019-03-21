package part3_Java常用工具类.chapter20_集合排序.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoodsTest {
    public static void main(String[] args) {
        Goods one = new Goods("1", "a", 12.3);
        Goods two = new Goods("2", "a", 45.6);
        Goods three = new Goods("3", "a", 78.9);
        List<Goods> list = new ArrayList<>();
        list.add(one);
        list.add(two);
        list.add(three);
        //排序前
        System.out.println("排序前：");
        for (Goods goods : list) {
            System.out.println(goods);
        }
        //按价格降序排序
        Collections.sort(list);
        //按价格降序排序后输出
        System.out.println("按价格降序排序后：");
        for (Goods goods : list) {
            System.out.println(goods);
        }
    }
}
