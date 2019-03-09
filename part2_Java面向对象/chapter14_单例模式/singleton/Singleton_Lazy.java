package part2_Java面向对象.chapter14_单例模式.singleton;

public class Singleton_Lazy {
    //1. 创建私有构造方法
    private Singleton_Lazy() {

    }

    //2. 创建静态的该类实例对象，并赋值为null
    private static Singleton_Lazy instance = null;

    //3. 创建开放的静态方法以提供实例对象
    public static Singleton_Lazy getInstance() {
        if (instance == null) {
            instance = new Singleton_Lazy();
        }
        return instance;
    }
}
