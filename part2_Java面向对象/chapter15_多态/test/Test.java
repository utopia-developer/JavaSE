package part2_Java面向对象.chapter15_多态.test;

import part2_Java面向对象.chapter15_多态.polymorphism.Animal;
import part2_Java面向对象.chapter15_多态.polymorphism.Cat;
import part2_Java面向对象.chapter15_多态.polymorphism.Dog;

public class Test {
    public static void main(String[] args) {
        //向上转型
        Animal one = new Animal();
        one.eat();
        Animal two = new Cat();
        two.eat();
        Animal three = new Dog();
        three.eat();
        System.out.println("=============================");
        //向下转型
        Cat cat = (Cat) two;
        cat.eat();
        cat.run();
        cat.setName("花花");
        System.out.println(cat.getName());
        //ClassCastException - 无法对Cat类型的实例two强制转型为Dog类型
        Dog dog = (Dog) two;
        dog.eat();
    }
}
