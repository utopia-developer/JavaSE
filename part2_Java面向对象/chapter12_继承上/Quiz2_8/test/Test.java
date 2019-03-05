package part2_Java面向对象.chapter12_继承上.Quiz2_8.test;

import part2_Java面向对象.chapter12_继承上.Quiz2_8.model.DevelopmentWork;
import part2_Java面向对象.chapter12_继承上.Quiz2_8.model.Work;
import part2_Java面向对象.chapter12_继承上.Quiz2_8.model.TestWork;

public class Test {
    public static void main(String[] args) {
        Work work = new Work();
        System.out.print("父类信息测试：");
        System.out.println(work.work());
        TestWork testWork = new TestWork("测试工作", 10, 5);
        System.out.print("测试工作类信息测试：");
        System.out.println(testWork.work());
        DevelopmentWork developmentWork = new DevelopmentWork("研发工作", 1000, 10);
        System.out.print("研发工作类信息测试：");
        System.out.println(developmentWork.work());
    }
}
