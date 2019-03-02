package part1_基础语法.chapter3_运算符;

/**
 * Quiz3_6
 */
public class Quiz3_6 {

    public static void main(String[] args) {
        // 定义整型变量x和y，值分别为-2和0
        int x = -2, y = 0;
        // 如果x大于0，则y的值为2*x+1
        // 否则y的值为x+5
        if (x > 0) {
            y = 2 * x + 1;
        } else {
            y = x + 5;
        }
        // 分别输出x和y的值
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}
