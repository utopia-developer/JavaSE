/**
 * Quiz4_4
 */
public class Quiz4_4 {

    public static void main(String[] args) {
        // 将一个整型字面值67832赋值给char类型变量c
        char c = (char) 67832;
        // 并将c的值输出
        System.out.println("c = " + c);
        // 定义一个整型变量n，值为65
        int n = 65;
        // 定义一个字符型变量c1，赋值为n，并输出c1的值
        char c1 = (char) n;
        System.out.println("c1 = " + c1);
        // 定义一个长整型变量l，值为987654321
        long l = 987654321l;
        // 定义一个整型变量i，赋值为l，并输出i的值
        int i = (int) l;
        System.out.println("i = " + i);
        // 定义一个float类型变量f，将变量l的值赋值给f，并输出f的值
        float f = l;
        System.out.println("f = " + f);
        // 将float的值f，重新赋值给变量l，并输出l的值
        l = (long) f;
        System.out.println("l = " + l);
    }
}