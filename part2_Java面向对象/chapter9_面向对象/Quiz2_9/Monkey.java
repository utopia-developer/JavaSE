package part2_Java面向对象.chapter9_面向对象.Quiz2_9;

public class Monkey {
    //属性：姓名（name）、特征（feature）
    String name;
    String feature;

    //无参的构造方法（默认初始化name和feature的属性值，属性值参考效果图）
    public Monkey() {
        this.name = "无尾猴";
        this.feature = "尾巴长";
    }

    //带参的构造方法（接收外部传入的参数，分别向 name 和 feature 赋值）
    public Monkey(String name, String feature) {
        this.name = name;
        this.feature = feature;
    }
}
