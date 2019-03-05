package part2_Java面向对象.chapter12_继承上.model;

public class Dog extends Animal {
    private String sex;

    public Dog() {

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void sleep() {
        System.out.println("品种为" + this.getSpecies() + "的狗在睡觉");
    }

    @Override
    public void eat() {
        System.out.println("子类的eat方法");
    }
}
