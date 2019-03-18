package part3_Java常用工具类.chapter19_集合.list.test;

import part3_Java常用工具类.chapter19_集合.list.model.Notice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Notice one = new Notice(1, "公告1", "admin", new Date());
        Notice two = new Notice(2, "公告2", "user", new Date());
        Notice three = new Notice(3, "公告3", "user", new Date());

        //添加
        List list = new ArrayList();
        list.add(one);
        list.add(two);
        list.add(three);

        //显示
        System.out.println("公告内容为：");
        show(list);
        System.out.println("=====================");

        //指定位置添加
        Notice four = new Notice(4, "公告4", "admin", new Date());
        list.add(1, four);
        System.out.println("在第二个位置处添加公告后的内容为：");
        show(list);
        System.out.println("=====================");

        //删除
        list.remove(3);
        System.out.println("删除最后一个位置公告后的内容为：");
        show(list);
        System.out.println("=====================");

        //修改
        ((Notice) list.get(0)).setTitle("修改后的公告1");
        System.out.println("修改第一个位置公告后的内容为：");
        show(list);
        System.out.println("=====================");

        //替换
        Notice five = new Notice(5, "公告5", "user", new Date());
        list.set(2, five);
        System.out.println("替换第三个位置公告后的内容为：");
        show(list);
    }

    //显示
    private static void show(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + ((Notice) (list.get(i))).getTitle());
        }
    }
}
