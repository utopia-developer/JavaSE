package part2_Java面向对象.chapter9_面向对象.Quiz2_9;

public class Test {
    public static void main(String[] args) {
        //调用无参构造方法实例对象
        Monkey monkey1 = new Monkey();
        //打印输出对象属性
        System.out.println("我是使用无参构造产生的猴子：");
        System.out.println("名称：" + monkey1.name);
        System.out.println("特征：" + monkey1.feature);
        System.out.println("========================================");
        //调用带参构造方法实例对象
        Monkey monkey2 = new Monkey("白头叶猴", "头上有白毛，喜欢吃树叶");
        //打印输出对象属性
        System.out.println("我是使用带参构造产生的猴子：");
        System.out.println("名称：" + monkey2.name);
        System.out.println("特征：" + monkey2.feature);
    }
}
