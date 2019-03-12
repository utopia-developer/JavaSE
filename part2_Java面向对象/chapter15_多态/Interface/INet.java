package part2_Java面向对象.chapter15_多态.Interface;

//interface访问权限可设置为public/默认，以方便类重写接口中的方法
public interface INet {
    //接口中默认为抽象方法，不需加abstract
    //接口中方法默认修饰符为public，可以不加public
    void network();

    void connection();

    //接口中常量默认为public static final，可以不加
    int TEMP = 20;

    //jdk1.8以后，新增：默认方法，静态方法
    //默认方法：可以带方法体，可以在实现类中重写，可以通过接口的引用调用，默认为public修饰符
    default void tcp() {
        System.out.println("tcp");
    }

    //静态方法：可以带方法体，不能重写，通过接口名调用
    static void stop() {
        System.out.println("断开连接");
    }
}
