package Assignment2.test;

import Assignment2.model.Department;
import Assignment2.model.Employee;
import Assignment2.model.Job;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        //实例化部门
        Department department1 = new Department("人事部", "D001");
        Department department2 = new Department("市场部", "D002");
        //实例化职务
        Job job1 = new Job("职员", "J001");
        Job job2 = new Job("助理", "J002");
        Job job3 = new Job("经理", "J003");
        //实例化员工
        Employee employee1 = new Employee("张铭", "S001", '男', 29, department1, job3);
        Employee employee2 = new Employee("李艾爱", "S002", '女', 21, department1, job2);
        Employee employee3 = new Employee("孙超", "S004", '男', 29, department1, job1);
        Employee employee4 = new Employee("张美美", "S005", '女', 26, department2, job1);
        Employee employee5 = new Employee("蓝迪", "S006", '男', 37, department2, job3);
        Employee employee6 = new Employee("米莉", "S007", '女', 24, department2, job1);

        //输出员工信息
        System.out.println(employee1.introduce());
        System.out.println("========================");
        System.out.println(employee2.introduce());
        System.out.println("========================");
        System.out.println(employee3.introduce());
        System.out.println("========================");
        System.out.println(employee4.introduce());
        System.out.println("========================");
        System.out.println(employee5.introduce());
        System.out.println("========================");
        System.out.println(employee6.introduce());
        System.out.println("========================");

        //向人事部添加员工
        department1.addEmployee(employee1);
        department1.addEmployee(employee2);
        department1.addEmployee(employee3);
        //输出人事部员工数量
        System.out.println("人事部总共有" + department1.getEmployeeNumber() + "名员工");
        //向市场部添加员工
        department2.addEmployee(employee4);
        department2.addEmployee(employee5);
        department2.addEmployee(employee6);
        //输出市场部员工数量
        System.out.println("市场部总共有" + department2.getEmployeeNumber() + "名员工");
    }
}
