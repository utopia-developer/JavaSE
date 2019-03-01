/**
 * ArrayDemo2
 * 方法传值问题3 - 引用数据类型（改变地址）
 */
public class ArrayDemo2 {
    public void update(int[] array) {
        array = new int[3];
        System.out.println("方法中的array为：");
        for (int n : array) {
            System.out.print(n + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayDemo2 demo = new ArrayDemo2();
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