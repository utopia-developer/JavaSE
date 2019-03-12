package part2_Java面向对象.chapter15_多态.Quiz5_13.test;

import part2_Java面向对象.chapter15_多态.Quiz5_13.model.Balloon;
import part2_Java面向对象.chapter15_多态.Quiz5_13.model.Bird;
import part2_Java面向对象.chapter15_多态.Quiz5_13.model.IFly;
import part2_Java面向对象.chapter15_多态.Quiz5_13.model.Plane;

//测试类
public class Test {

    public static void main(String[] args) {
        //对象实例化
        IFly one = new Plane();
        IFly two = new Bird();
        IFly three = new Balloon();
        //分别调用fly()方法
        one.fly();
        two.fly();
        three.fly();
    }
}

