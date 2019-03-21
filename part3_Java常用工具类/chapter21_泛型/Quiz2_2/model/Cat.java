package part3_Java常用工具类.chapter21_泛型.Quiz2_2.model;

public class Cat extends Animal {
    //按任务要求实现该类
    public Cat(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("小猫" + this.getName() + "在做游戏！");
    }
}
