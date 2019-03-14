package part2_Java面向对象.chapter15_多态.inner.StaticInner;

//外部类
public class Person {
    int age;

    public void eat() {
        System.out.println("外部类方法");
    }

    //获取内部类方法
    public Heart getHeart() {
        new Heart().temp = 22;
        return new Heart();
    }

    //内部类
    static class Heart {
        static int age = 7;
        int temp = 11;

        public static void eat() {
            System.out.println("静态内部类的静态方法");
        }

        public String beat() {
            new Person().eat();
            return new Person().age + "内部类方法";
        }
    }
}
