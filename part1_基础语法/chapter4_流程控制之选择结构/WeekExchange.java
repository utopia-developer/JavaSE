package part1_基础语法.chapter4_流程控制之选择结构;

import java.util.Scanner;

/**
 * WeekExchange
 * 输入数字，输出对应星期几
 */
public class WeekExchange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入1-7之间的整数：");
        int week = sc.nextInt();
        switch (week) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("输入错误");
        }
        sc.close();
    }
}
