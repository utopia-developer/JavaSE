package part2_Java面向对象.chapter15_多态.Quiz3_16.model;

public class Cat extends Animal {
    //重写父类cry()方法，输出信息为“小猫的叫声：喵喵喵~~~”
    @Override
    public void cry() {
        System.out.println("小猫的叫声：喵喵喵~~~");
    }
}
