package part2_Java面向对象.chapter15_多态.polymorphism;

public class Cat extends Animal {
    private double weight;

    public Cat() {

    }

    public Cat(String name, int year, double weight) {
        super(name, year);
        this.setWeight(weight);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void run() {
        System.out.println("Cat子类方法");
    }

    @Override
    public void eat() {
        System.out.println("Cat类重写父类方法");
    }
}
