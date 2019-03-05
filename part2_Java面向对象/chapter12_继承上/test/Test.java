package part2_Java面向对象.chapter12_继承上.test;

import part2_Java面向对象.chapter12_继承上.model.Cat;
import part2_Java面向对象.chapter12_继承上.model.Dog;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("花花");
        cat.eat();
        cat.run();
        System.out.println("=========================");

        Dog dog = new Dog();
        dog.setName("妞妞");
        dog.setSpecies("哈士奇");
        dog.eat();
        dog.sleep();
    }
}
