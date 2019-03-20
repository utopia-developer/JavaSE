package part3_Java常用工具类.chapter19_集合.map.test;

import part3_Java常用工具类.chapter19_集合.map.model.Goods;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Goods> map = new HashMap<>(3);
        //添加信息
        System.out.println("请输入三条商品信息：");
        int i = 0;
        while (i < 3) {
            System.out.println("请输入第" + (i + 1) + "条商品信息：");
            System.out.println("请输入商品编号：");
            String id = scanner.next();
            //防止出现相同编号的商品，使用continue跳出此次循环
            if (map.containsKey(id)) {
                System.out.println("商品编号不能重复");
                continue;
            }
            System.out.println("请输入商品名称：");
            String name = scanner.next();
            System.out.println("请输入商品价格：");
            //防止出现商品价格输入格式错误
            double price = 0;
            try {
                price = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("输入的价格格式错误，请重新输入");
                //重新输入，防止错误的商品价格信息写入下次循环的商品编号信息中
                scanner.next();
                continue;
            } catch (Exception e) {
                e.printStackTrace();
            }
            Goods good = new Goods(id, name, price);

            map.put(id, good);
            i++;
        }

        //输出信息
        System.out.println("输出HashMap中的所有信息：");
        Set<Map.Entry<String, Goods>> set = map.entrySet();
        for (Map.Entry<String, Goods> entry : set) {
            System.out.print(entry.getKey() + " - ");
            System.out.println(entry.getValue());
        }
    }
}
