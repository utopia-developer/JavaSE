package part1_基础语法.chapter5_流程控制之循环结构;

/**
 * Quiz5_3
 * 嵌套循环输出一个梯形
 */
public class Quiz5_3 {

    public static void main(String[] args) {
        for(int i = 1; i <= 5;i ++){
            for(int j = 5 - i; j >= 0; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i + 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
