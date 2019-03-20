package part3_Java常用工具类.chapter19_集合.map;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        //添加数据
        System.out.println("请输入三条key-value键值对");
        int i = 0;
        while (i < 3) {
            System.out.println("请输入key：");
            String key = scanner.next();
            System.out.println("请输入value：");
            String value = scanner.next();
            dictionary.put(key, value);
            i++;
        }

        //利用迭代器输出value
        System.out.println("映射中的value：");
        Iterator<String> iterator = dictionary.values().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=============================");

        //输出key-value键值对
        System.out.println("映射中的key-value键值对");
        Set<Map.Entry<String, String>> entrySet = dictionary.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.print(entry.getKey() + " - ");
            System.out.println(entry.getValue());
        }
        System.out.println("=============================");

        //根据key查找对应的value
        System.out.println("请输入要查找的key：");
        String keySearch = scanner.next();
        boolean flag = false;
        Set<String> keys = dictionary.keySet();
        for (String key : keys) {
            if (key.equals(keySearch)) {
                flag = true;
                //找到了就跳出循环，防止结果被覆盖
                break;
            }
        }
        if (flag) {
            System.out.println("找到了，value是：" + dictionary.get(keySearch));
        } else {
            System.out.println("没找到");
        }
    }
}
