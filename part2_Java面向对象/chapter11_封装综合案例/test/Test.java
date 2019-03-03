package part2_Java面向对象.chapter11_封装综合案例.test;

import part2_Java面向对象.chapter11_封装综合案例.model.Student;
import part2_Java面向对象.chapter11_封装综合案例.model.Subject;

public class Test {
    public static void main(String[] args) {
        Subject subject = new Subject("计算机科学与技术", "J0001", 4);
        System.out.println(subject.subjectInfo());
        System.out.println("=====================================================");
        Student student1 = new Student("张三", "S001", '男', 18);
        System.out.println(student1.studentInfo());
        System.out.println("=====================================================");
        Student student2 = new Student("张三", "S001", '男', 18, subject);
        System.out.println(student2.introduce());
        System.out.println("=====================================================");
        subject.addStudent(student1);
        subject.addStudent(student2);
        System.out.println("学生的数量为：" + subject.getStudentNumber());
        System.out.println("=====================================================");
        subject.add(student1);
        System.out.println("学生的数量为：" + subject.getStudentNumber());
    }
}
