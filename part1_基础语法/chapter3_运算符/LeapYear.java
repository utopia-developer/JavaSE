package part1_基础语法.chapter3_运算符;

import java.util.Scanner;

/**
 * LeapYear
 * 判断输入的年份是否是闰年
 */
public class LeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要判断的年份：");
        int year = sc.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }
        sc.close();
    }
}