package part1_基础语法.chapter5_流程控制之循环结构;

import java.util.Scanner;

/**
 * Guess 猜字游戏
 */
public class Guess {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = (int) (Math.random() * 10 + 1);
        int guess;
        do {
            System.out.println("请输入猜测的数字：");
            guess = sc.nextInt();
            if (guess > answer) {
                System.out.println("猜测过大");
            } else if (guess < answer) {
                System.out.println("猜测过小");
            }
        } while (guess != answer);
        System.out.println("猜测正确");
        sc.close();
    }
}
