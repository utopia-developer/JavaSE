package part3_Java常用工具类.chapter16_异常.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_throws {
    public static int test() throws ArithmeticException, InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入被除数：");
        int one = scanner.nextInt();
        System.out.print("请输入除数：");
        int two = scanner.nextInt();
        System.out.println("运算结束");
        return one / two;
    }

    public static void main(String[] args) {
        try {
            int result = test();
            System.out.println("商为：" + result);
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("输入应为整数");
            e.printStackTrace();
        }
    }
}
