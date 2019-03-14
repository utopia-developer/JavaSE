package part2_Java面向对象.chapter15_多态.inner.NormalInner;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.age = 13;
        //获取内部类对象
        //方法1：new 外部类().new 内部类()
        Person.Heart inner1 = new Person().new Heart();
        System.out.println(inner1.beat());
        //方法2：
        Person.Heart inner2 = person.new Heart();
        System.out.println(inner2.beat());
        //方法3：
        Person.Heart inner3 = person.getHeart();
        System.out.println(inner3.beat());
    }
}
