package part2_Java面向对象.chapter12_继承上.model;

public class Cat extends Animal {
    private double weight;

    public Cat() {

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void run() {
        System.out.println("小猫" + this.getName() + "在奔跑");
    }
}
