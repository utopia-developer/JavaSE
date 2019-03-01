package part2_Java面向对象.chapter9_面向对象;

/**
 * 宠物猫类
 */
public class Cat {
    //属性 - 名字，年龄，体重，品种
    String name;
    int age;
    double weight;
    String species;

    //方法 - 跑动，吃东西
    public void run() {
        System.out.println("跑动");
    }

    public void eat() {
        System.out.println("吃东西");
    }
}

