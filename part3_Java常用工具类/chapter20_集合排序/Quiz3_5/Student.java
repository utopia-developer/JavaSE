package part3_Java常用工具类.chapter20_集合排序.Quiz3_5;

public class Student {
    //成员变量
    private int id;
    private String name;
    private int age;

    //构造方法
    public Student(int id, int age, String name) {
        this.setId(id);
        this.setAge(age);
        this.setName(name);
    }

    //getter和setter方法
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    //toString()方法
    @Override
    public String toString() {
        return "[学号：" + this.getId() + "，年龄：" + this.getAge() + "，姓名：" + this.getName() + "]";
    }
}
