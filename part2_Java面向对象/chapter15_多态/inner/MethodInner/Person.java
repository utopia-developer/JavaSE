package part2_Java面向对象.chapter15_多态.inner.MethodInner;

//外部类
public class Person {
    int age;

    public void eat() {
        System.out.println("外部类方法");
    }

    //获取内部类方法
    public String getHeart() {
        class Heart {
            int age = 7;

            public void eat() {
                System.out.println("静态内部类的静态方法");
            }

            public String beat() {
                new Person().eat();
                return Person.this.age + "内部类方法";
            }
        }
        return new Heart().beat();
    }
}
