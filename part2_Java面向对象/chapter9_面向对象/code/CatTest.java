package part2_Java面向对象.chapter9_面向对象.code;

public class CatTest {
    public static void main(String[] args) {
        //对象实例化
        Cat cat = new Cat();
        //通过对象名进行方法和属性的调用
        cat.run();
        cat.eat();
        System.out.println(cat.age);
    }
}
