package part1_基础语法.chapter8_方法;

/**
 * Quiz4_4
 */
public class Quiz4_4 {
    // 求圆形面积
    public double getArea(double radius){
        return Math.PI * radius * radius;
    }
    // 求长方形面积
    public double getArea(double length, double width){
        return length * width;
    }

    public static void main(String[] args) {
        // 定义对象
        Quiz4_4 quiz = new Quiz4_4();
        // 定义一个double类型的变量存放半径，并初始化
        double radius = 4.5;
        // 定义两个变量存放长和宽，并初始化
        double length = 8, width = 5;
        // 调用方法，求圆的面积并打印输出
        System.out.println("圆的面积为：" + quiz.getArea(radius));
        // 调用方法，求长方形面积并打印输出
        System.out.println("长方形面积为：" + quiz.getArea(length, width));
    }
}
