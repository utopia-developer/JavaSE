package part2_Java面向对象.chapter13_继承下.Quiz4_3.test;

import part2_Java面向对象.chapter13_继承下.Quiz4_3.model.Banana;
import part2_Java面向对象.chapter13_继承下.Quiz4_3.model.Fruits;
import part2_Java面向对象.chapter13_继承下.Quiz4_3.model.Waxberry;

public class Test {
    public static void main(String[] args) {
        // 实例化2个父类对象，传入两组相同的参数值
        Fruits fruit1 = new Fruits("圆形", "酸");
        Fruits fruit2 = new Fruits("圆形", "酸");

        // 调用父类eat方法
        fruit1.eat();

        // 测试重写equals方法，判断两个对象是否相等
        boolean flag = fruit1.equals(fruit2);
        System.out.println("fruit1和fruit2的引用比较：" + flag);

        System.out.println("————————————————————————————————————————");
        // 实例化子类对象，并传入相关参数值
        Waxberry waxberry = new Waxberry("圆形", "酸甜适中", "紫红色");

        // 调用子类face方法和eat方法
        waxberry.face();
        waxberry.eat();

        // 测试重写toString方法，输出子类对象的信息
        System.out.println(waxberry.toString());

        System.out.println("——————————————————————————————————————————————");
        // 实例化Banana类对象，并传入相关参数值
        Banana banana = new Banana("短而椭圆", "香甜", "仙人蕉");

        // 调用子类的advantage和它的重载方法
        banana.advantage();
        banana.advantage("黄色");
    }
}
