package part2_Java面向对象.chapter14_单例模式.singleton;

public class Singleton_Hungry {
    //1. 创建类中私有构造
    private Singleton_Hungry() {

    }

    //2. 创建该类型的私有静态实例
    private static Singleton_Hungry instance = new Singleton_Hungry();

    //3. 创建公有静态方法，返回私有静态实例对象
    public static Singleton_Hungry getInstance() {
        return instance;
    }
}
