package part2_Java面向对象.chapter15_多态.inner.NormalInner;

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
    class Heart {
        int age = 7;
        int temp = 11;

        public void eat() {
            System.out.println("内部类同名方法");
        }

        public String beat() {
            Person.this.eat();
            return Person.this.age + "内部类方法";
        }
    }
}
