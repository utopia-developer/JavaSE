package part3_Java常用工具类.chapter16_异常.exception;

import java.util.Scanner;

public class Exception_throw {
    public static void ageTest() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = scanner.nextInt();
        if (age < 18 || age > 70) {
            throw new Exception("无法办理入住，需要他人陪同");
        } else {
            System.out.println("欢迎入住");
        }
    }

    public static void main(String[] args) {
        try {
            ageTest();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
