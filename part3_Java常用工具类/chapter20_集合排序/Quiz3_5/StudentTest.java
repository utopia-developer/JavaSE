package part3_Java常用工具类.chapter20_集合排序.Quiz3_5;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

//实现Comparator接口
public class StudentTest implements Comparator<Student> {

    //实现接口中的方法

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }


    public static void main(String[] args) {
        //定义Student类的对象
        Student student1 = new Student(40, 20, "peter");
        Student student2 = new Student(28, 5, "angle");
        Student student3 = new Student(35, 18, "tom");

        //将对象添加到List中
        List<Student> list = new ArrayList<Student>();
        list.add(student1);
        list.add(student2);
        list.add(student3);

        //输出排序前的数据
        System.out.println("按姓名排序前：");
        for (Student student : list) {
            System.out.println(student);
        }

        //排序
        Collections.sort(list, new StudentTest());

        //输出排序后的数据
        System.out.println("按姓名排序后：");
        for (Student student : list) {
            System.out.println(student);
        }
    }
}