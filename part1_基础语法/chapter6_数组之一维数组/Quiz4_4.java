package part1_基础语法.chapter6_数组之一维数组;

/**
 * Quiz4_4
 */
public class Quiz4_4 {

    public static void main(String[] args) {
        char[] array = { 'a', 'A', 'c', '1', 'a', '2', '3', 'A' };
        int amount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'a' || array[i] == 'A') {
                amount++;
            }
        }
        System.out.println("字符数组中字符'a'或'A'的个数为：" + amount);
    }
}
