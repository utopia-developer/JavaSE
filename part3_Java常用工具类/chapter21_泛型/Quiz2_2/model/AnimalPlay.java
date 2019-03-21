package part3_Java常用工具类.chapter21_泛型.Quiz2_2.model;

import java.util.List;

public class AnimalPlay {
    //按任务要求实现该类
    public void show(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.play();
        }
    }
}
