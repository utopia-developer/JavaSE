package part3_Java常用工具类.chapter19_集合.Quiz3_11.test;

import part3_Java常用工具类.chapter19_集合.Quiz3_11.model.Student;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentTest {
    public static void main(String[] args) {
        //定义三个Student类的对象及一个HashSet类的对象
        Student one = new Student(1, "Tom", 87.0f);
        Student two = new Student(2, "Lucy", 95.0f);
        Student three = new Student(3, "William", 65.0f);
        //将Student类的对象添加到集合中
        Set set = new HashSet();
        set.add(one);
        set.add(two);
        set.add(three);
        //使用迭代器显示Student类的对象中的内容
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("==========================");
        System.out.println("添加重复元素后：");
        Student four = new Student(1, "Tom", 87.0f);
        set.add(four);
        iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
