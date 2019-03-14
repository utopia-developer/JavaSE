package part2_Java面向对象.chapter15_多态.inner.StaticInner;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.age = 13;
        //获取内部类对象
        Person.Heart inner1 = new Person.Heart();
        System.out.println(inner1.beat());
        Person.Heart.eat();
    }
}
