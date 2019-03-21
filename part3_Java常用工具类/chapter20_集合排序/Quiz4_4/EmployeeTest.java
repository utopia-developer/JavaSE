package part3_Java常用工具类.chapter20_集合排序.Quiz4_4;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTest {

    public static void main(String[] args) {
        //定义Employee类的对象
        Employee e1 = new Employee("emp001", "张三", 1800.0);
        Employee e2 = new Employee("emp002", "李四", 2500.0);
        Employee e3 = new Employee("emp003", "王五", 1600.0);
        //将对象添加到List中
        List<Employee> list = new ArrayList<Employee>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        //输出排序前的数据
        System.out.println("排序前：");
        for (Employee e : list) {
            System.out.println(e);
        }
        //排序
        Collections.sort(list);

        //输出排序后的数据
        System.out.println("排序后：");
        for (Employee e : list) {
            System.out.println(e);
        }
    }
}
