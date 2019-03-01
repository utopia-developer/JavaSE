package part2_Java面向对象.chapter9_面向对象.Quiz1_11;

public class Test {
    public static void main(String[] args) {
        //使用new关键字实例化对象
        Person person = new Person();
        //传入name、age、grade的参数值
        person.name = "李明";
        person.age = 10;
        person.grade = "五年级";
        //分别调用student、sex、mySelf方法
        person.student();
        person.sex('男');
        person.mySelf();
    }
}
