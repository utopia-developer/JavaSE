package part2_Java面向对象.chapter15_多态.Quiz4_4.test;

import part2_Java面向对象.chapter15_多态.Quiz4_4.model.Shape;
import part2_Java面向对象.chapter15_多态.Quiz4_4.model.Circle;
import part2_Java面向对象.chapter15_多态.Quiz4_4.model.Rectangle;

import java.text.DecimalFormat;

//测试类
public class Test {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000");

        //创建类的实例，并分别对圆的半径和矩形的长宽进行赋值
        Shape rectangle = new Rectangle(6, 5);
        Shape circle = new Circle(3.5);
        //调用area（）方法，输出结果
        System.out.println("圆的面积为：" + df.format(circle.area()));
        System.out.println("矩形的面积为：" + rectangle.area());
    }
}
