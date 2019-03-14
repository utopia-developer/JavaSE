package part2_Java面向对象.chapter15_多态.inner.AnonymousInner;

public abstract class Person {
    private String name;

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void read();
}
