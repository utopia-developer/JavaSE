package part3_Java常用工具类.chapter16_异常.exception.Exception_custom;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = scanner.nextInt();
        if (age < 18 || age > 70) {
            try {
                throw new HotelAgeException();
            } catch (HotelAgeException e) {
                System.out.println(e.getMessage());
                System.out.println("办理失败");
            } catch (Exception e) {
                System.out.println("其他异常");
            }
        } else {
            System.out.println("欢迎入住");
        }
    }
}
