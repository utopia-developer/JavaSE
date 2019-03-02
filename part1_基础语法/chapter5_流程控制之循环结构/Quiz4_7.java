package part1_基础语法.chapter5_流程控制之循环结构;

/**
 * Quiz4_7
 * 求200-300之间的整数，符合：
 * 百位，十位，个位之积为42，之和为12
 */
public class Quiz4_7 {

    public static void main(String[] args) {
        // 定义变量ge、shi、bai，用于存放个位、十位、百位上的数字
        int ge, shi, bai;
        // 使用for循环
        for (int n = 200; n <= 300; n++) {
            // 取出百位数
            bai = n / 100;
            // 取出十位数
            shi = n / 10 % 10;
            // 取出个位数
            ge = n % 10;
            // 计算三个数字之积
            int mul = bai * shi * ge;
            // 计算三个数字之和
            int sum = bai + shi + ge;
            // 如果积等于42并且和为12，则将满足条件的数输出
            if (mul == 42 && sum == 12) {
                System.out.println(n);
            }
        }
    }
}
