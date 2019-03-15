package part3_Java常用工具类.chapter16_异常.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_try_catch_finally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("请输入被除数：");
            int one = scanner.nextInt();
            System.out.print("请输入除数：");
            int two = scanner.nextInt();
            System.out.println("商为：" + one / two);
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("输入了非整数");
            e.printStackTrace();
        } catch (Exception e) { //防御性编程
            System.out.println("输入错误");
            //异常的堆栈信息打印
            e.printStackTrace();
            //可以通过exit()方法，强制中止JVM的运行
            System.exit(1);
        } finally {
            System.out.println("运算结束");
        }

    }
}
