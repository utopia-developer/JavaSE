package part2_Java面向对象.chapter15_多态.inner.AnonymousInner;

public class Test {

    public void getRead(Person person) {
        person.read();
    }

    public static void main(String[] args) {
        Test test = new Test();

        test.getRead(new Person() {
            @Override
            public void read() {
                System.out.println("匿名内部类方法 - Man");
            }
        });
        test.getRead(new Person() {
            @Override
            public void read() {
                System.out.println("匿名内部类方法 - Woman");
            }
        });
    }
}
