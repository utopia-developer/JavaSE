package part1_基础语法.chapter4_流程控制之选择结构;

/**
 * Quiz2_5
 */
public class Quiz2_5 {

    public static void main(String[] args) {
        // 定义整型变量x并初始化为-5
        int x = -5;
        // 定义整型变量y并初始化0
        int y = 0;
        // 根据所给条件，使用多重if-else结构求y的值
        if (x < 0) {
            y = -1;
        } else if (x > 0) {
            y = 1;
        } else {
            y = 0;
        }
        // 输出x和y的值
        System.out.println("x=" + x + ", y=" + y);
    }
}
