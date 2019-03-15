package part3_Java常用工具类.chapter16_异常.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_return {
    public static void main(String[] args) {
        int result = returnMethod();
        System.out.println(result);
    }

    public static int returnMethod() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("请输入被除数：");
            int one = scanner.nextInt();
            System.out.print("请输入除数：");
            int two = scanner.nextInt();
            return one / two;
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
            return 0;
        } finally { //finally中的return语句会起到"覆盖"效果
            System.out.println("运算结束");
            return -100000;
        }
    }
}
