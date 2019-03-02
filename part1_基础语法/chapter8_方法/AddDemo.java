package part1_基础语法.chapter8_方法;

/**
 * AddDemo
 * 方法传值问题1 - 基本数据类型
 */
public class AddDemo {

    public void plus(int n) {
        n++;
        System.out.println("方法中n的值为：" + n);
    }

    public static void main(String[] args) {
        AddDemo add = new AddDemo();
        int n = 5;
        System.out.println("方法执行前n的值为：" + n);
        add.plus(n);
        System.out.println("方法执行后n的值为：" + n);
    }
}