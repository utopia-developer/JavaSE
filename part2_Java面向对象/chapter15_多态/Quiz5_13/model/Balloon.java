package part2_Java面向对象.chapter15_多态.Quiz5_13.model;

//创建类Balloon并实现接口IFly
public class Balloon implements IFly {
    //重写方法fly()
    @Override
    public void fly() {
        System.out.println("气球飞上天空");
    }
}

