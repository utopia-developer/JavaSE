package part1_基础语法.chapter7_数组之二维数组;

import java.util.Scanner;

/**
 * Quiz1_8
 */
public class Quiz1_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 定义一个三行两列的整型二维数组intArray
        int[][] intArray = new int[3][2];
        int chineseSum = 0, chineseAvg, mathSum = 0, mathAvg;
        // 从键盘输入学生成绩，要求输入顺序与效果图一致
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的语文成绩：");
            intArray[i][0] = sc.nextInt();
            System.out.println("请输入第" + (i + 1) + "个学生的数学成绩：");
            intArray[i][1] = sc.nextInt();

            chineseSum += intArray[i][0];
            mathSum += intArray[i][1];
        }

        // 求语文的总成绩和平均分
        chineseAvg = chineseSum / intArray.length;
        // 求数学的总成绩和平均分
        mathAvg = mathSum / intArray.length;

        System.out.println("语文的总成绩为：" + chineseSum);
        System.out.println("语文的平均分为：" + chineseAvg);
        System.out.println("数学的总成绩为：" + mathSum);
        System.out.println("数学的平均分为：" + mathAvg);
    }
}
