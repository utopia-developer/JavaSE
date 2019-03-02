package part1_基础语法.chapter5_流程控制之循环结构;

/**
 * FactorialPlus
 * 求1-10的阶乘的累加和
 */
public class FactorialPlus {

    public static void main(String[] args) {
        int s = 1, sum = 0;
        for (int i = 1; i <= 10; i++) {
            s = 1;
            for (int j = 1; j <= i; j++) {
                s *= j;
            }
            sum += s;
        }
        System.out.println("阶乘的累加和为：" + sum);
    }
}
