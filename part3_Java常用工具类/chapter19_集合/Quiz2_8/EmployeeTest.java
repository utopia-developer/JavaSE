package part3_Java常用工具类.chapter19_集合.Quiz2_8;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee one = new Employee(1, "张三", 5000.0);
        Employee two = new Employee(2, "李四", 5500.0);
        Employee three = new Employee(3, "赵六", 4000.0);

        List list = new ArrayList();
        list.add(one);
        list.add(two);
        list.add(three);

        System.out.println("员工姓名\t员工薪资");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(((Employee) (list.get(i))).getName() + " \t" +
                    ((Employee) (list.get(i))).getSalary());
        }
    }
}
