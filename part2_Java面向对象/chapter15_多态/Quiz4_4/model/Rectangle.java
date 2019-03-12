package part2_Java面向对象.chapter15_多态.Quiz4_4.model;

public class Rectangle extends Shape {
    //属性：矩形的长length、宽wide
    private double length;
    private double wide;

    //创建带参构造方法以及无参构造方法
    public Rectangle() {

    }

    public Rectangle(double length, double wide) {
        this.setLength(length);
        this.setWide(wide);
    }

    //创建针对长、宽的赋值和取值方法
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    //重写父类的area（）方法
    @Override
    public double area() {
        return this.getLength() * this.getWide();
    }
}
