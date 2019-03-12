package part2_Java面向对象.chapter15_多态.Quiz3_16.test;

import part2_Java面向对象.chapter15_多态.Quiz3_16.model.Animal;
import part2_Java面向对象.chapter15_多态.Quiz3_16.model.Cat;
import part2_Java面向对象.chapter15_多态.Quiz3_16.model.Dog;
import part2_Java面向对象.chapter15_多态.Quiz3_16.model.Sheep;

public class Test {
    public static void main(String[] args) {
        //生成父类对象数组,数组长度为5
        Animal[] animals = new Animal[5];

        //产生随机数，随机产生三种具体子类的实例
        int random;
        for (int i = 0; i < animals.length; i++) {
            random = (int) (Math.random() * 3);
            switch (random) {
                case 0:
                    animals[i] = new Cat();
                    break;
                case 1:
                    animals[i] = new Dog();
                    break;
                case 2:
                    animals[i] = new Sheep();
                    break;
                default:
                    break;
            }
        }

        //循环输出，循环体中每个对象分别调用cry()方法。
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                animal.cry();
            } else if (animal instanceof Dog) {
                animal.cry();
            } else if (animal instanceof Sheep) {
                animal.cry();
            }
        }
    }
}
