import java.util.Scanner;

/**
 * SocreAccess 成绩评定
 */
public class ScoreAccess {

    public static void main(String[] args) {
        System.out.println("请输入成绩：");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score >= 90) {
            System.out.println("优");
        } else if (score >= 80) {
            System.out.println("良");
        } else if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
        sc.close();
    }
}