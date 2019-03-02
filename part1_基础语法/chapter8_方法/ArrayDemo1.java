package part1_基础语法.chapter8_方法;

/**
 * ArrayDemo
 * 方法传值问题2 - 引用数据类型（未改变地址）
 */
public class ArrayDemo1 {
    public void update(int[] array) {
        array[2] = 99;
        System.out.println("方法中的array为：");
        for (int n : array) {
            System.out.print(n + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayDemo1 demo = new ArrayDemo1();
        int[] array = { 1, 2, 3, 4, 5 };
        System.out.println("方法执行前的array为：");
        for (int n : array) {
            System.out.print(n + "  ");
        }
        System.out.println();

        demo.update(array);

        System.out.println("方法执行后的array为：");
        for (int n : array) {
            System.out.print(n + "  ");
        }
    }
}
