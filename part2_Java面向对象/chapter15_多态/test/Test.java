package part2_Java面向对象.chapter15_多态.test;

import part2_Java面向对象.chapter15_多态.polymorphism.Animal;
import part2_Java面向对象.chapter15_多态.polymorphism.Cat;
import part2_Java面向对象.chapter15_多态.polymorphism.Dog;

public class Test {
    public static void main(String[] args) {
        Animal one = new Animal();
        one.eat();
        Animal two = new Cat();
        two.eat();
        Animal three = new Dog();
        three.eat();
    }
}
