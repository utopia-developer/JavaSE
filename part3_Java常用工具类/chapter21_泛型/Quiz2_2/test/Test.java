package part3_Java常用工具类.chapter21_泛型.Quiz2_2.test;

import part3_Java常用工具类.chapter21_泛型.Quiz2_2.model.AnimalPlay;
import part3_Java常用工具类.chapter21_泛型.Quiz2_2.model.Cat;
import part3_Java常用工具类.chapter21_泛型.Quiz2_2.model.Dog;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //定义List并添加Dog类对象
        Dog dogOne = new Dog("巴迪");
        Dog dogTwo = new Dog("豆豆");
        List<Dog> dogList = new ArrayList<Dog>();
        dogList.add(dogOne);
        dogList.add(dogTwo);
        //定义List并添加Cat类对象
        Cat catOne = new Cat("花花");
        Cat catTwo = new Cat("凡凡");
        List<Cat> catList = new ArrayList<Cat>();
        catList.add(catOne);
        catList.add(catTwo);
        //使用AnimalPlay类的方法，按照演示效果输出内容
        AnimalPlay play = new AnimalPlay();
        play.show(dogList);
        play.show(catList);
    }
}
