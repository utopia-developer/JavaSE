package part2_Java面向对象.chapter15_多态.polymorphism;

public class Dog extends Animal {
    private String gander;

    public Dog() {

    }

    public Dog(String name, int year, String gander) {
        super(name, year);
        this.setGander(gander);
    }

    public String getGander() {
        return gander;
    }

    public void setGander(String gander) {
        this.gander = gander;
    }

    public void sleep() {
        System.out.println("Dog子类方法");
    }

    @Override
    public void eat() {
        System.out.println("Dog类重写父类方法");
    }
}
