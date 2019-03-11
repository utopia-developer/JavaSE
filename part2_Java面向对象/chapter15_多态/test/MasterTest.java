package part2_Java面向对象.chapter15_多态.test;

import part2_Java面向对象.chapter15_多态.polymorphism.Animal;
import part2_Java面向对象.chapter15_多态.polymorphism.Dog;
import part2_Java面向对象.chapter15_多态.polymorphism.Master;

public class MasterTest {
    public static void main(String[] args) {
        Master master = new Master();
        Animal animal1 = new Dog();
        master.feed(animal1);
        System.out.println("=========================");

        boolean hasEnoughTime = false;
        Animal animal2 = master.raise(hasEnoughTime);
        System.out.println(animal2);
    }
}
