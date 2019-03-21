package part3_Java常用工具类.chapter21_泛型.Quiz2_2.model;

public abstract class Animal {
    //按任务要求实现该类
    private String name;

    public Animal() {

    }

    public Animal(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void play();
}
