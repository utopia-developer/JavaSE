package part2_Java面向对象.chapter9_面向对象.Quiz1_11;

public class Person {
    //属性：name、age、grade
    String name;
    int age;
    String grade;

    //创建无参无返回值的student方法，描述为：我是一名学生！
    public void student() {
        System.out.println("我是一名学生！");
    }

    //创建带参（性别sex）的sex方法，描述为：我是一个**孩！
    public void sex(char gender) {
        System.out.println("我是一个" + gender + "孩！");
    }

    //创建无参无返回值的mySelf方法，分别介绍姓名（name），年龄（age），年级（grade）
    public void mySelf() {
        System.out.println("我叫" + name + "，今年" + age + "岁了，读小学" +
                grade + "了。");
    }

}
