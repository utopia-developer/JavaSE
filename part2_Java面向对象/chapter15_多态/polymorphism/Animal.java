package part2_Java面向对象.chapter15_多态.polymorphism;

public class Animal {
    private String name;
    private int year;

    public Animal() {

    }

    public Animal(String name, int year) {
        this.setName(name);
        this.setYear(year);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void eat() {
        System.out.println("父类方法");
    }
}
