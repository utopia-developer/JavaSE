package part2_Java面向对象.chapter15_多态.polymorphism;

public class Master {
    public void feed(Animal animal) {
        if (animal instanceof Cat) {
            animal.eat();
            ((Cat) animal).run();
        } else if (animal instanceof Dog) {
            animal.eat();
            ((Dog) animal).sleep();
        }
    }

    public Animal raise(boolean hasEnoughTime) {
        if (hasEnoughTime) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}
