package part1_基础语法.chapter6_一维数组;

/**
 * Quiz2_6
 */
public class Quiz2_6 {

    public static void main(String[] args) {
        // 定义一个整型数组，并初始化
        int[] array = { 1, 2, 6, 12, 15, 16, 19 };
        // 循环遍历数组，找出能被3整除的元素并打印输出
        System.out.println("能被3整除的数组元素为：");
        for (int n : array) {
            if (n % 3 == 0) {
                System.out.println(n);
            }
        }
    }
}
