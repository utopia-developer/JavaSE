package part2_Java面向对象.chapter15_多态.Quiz5_13.model;

//创建类Bird并实现接口IFly
public class Bird implements IFly {
    //重写fly()方法
    @Override
    public void fly() {
        System.out.println("小鸟在天空翱翔");
    }
}

