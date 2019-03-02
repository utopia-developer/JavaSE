package part1_基础语法.chapter3_运算符;

/**
 * Quiz2_7
 */
public class Quiz2_7 {

    public static void main(String[] args) {
        // 将变量m的初值赋值为10，变量n的初值赋值为5
        int m = 10, n = 5;
        // 变量m的值加3，n的值加5
        m += 3;
        n += 5;
        // 求m和n的平均值，并将结果存于变量p中
        double p = (m + n) / 2;
        // 求m的平方乘以n的平方，并将结果存于变量q中
        double q = (m * m) * (n * n);
        // 将p和q的值打印输出
        System.out.println("m和n的平均值为：" + p);
        System.out.println("m的平方乘以n的平方为：" + q);
    }
}
