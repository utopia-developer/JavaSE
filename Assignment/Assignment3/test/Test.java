package Assignment.Assignment3.test;

import Assignment.Assignment3.model.*;

import java.util.Scanner;

public class Test {
    public void menu() {
        System.out.println("**********欢迎来到太阳马戏团**********");
        System.out.println("**********  请选择表演者  ***********");
        System.out.println("**********    1、 棕熊    **********");
        System.out.println("**********    2、 狮子    **********");
        System.out.println("**********    3、 猴子    **********");
        System.out.println("**********    4、 鹦鹉    **********");
        System.out.println("**********    5、 小丑    **********");
    }

    public static void main(String[] args) {
        Test test = new Test();
        Animal animal;
        Scanner scanner = new Scanner(System.in);
        int circusChoice, continueChoice;
        do {
            test.menu();
            circusChoice = scanner.nextInt();
            switch (circusChoice) {
                case 1:
                    animal = new Bear("Bill", 1);
                    System.out.println(((Bear) animal).act());
                    break;
                case 2:
                    animal = new Lion("Lain", 2, "灰色", "公狮");
                    System.out.println(((Lion) animal).act());
                    break;
                case 3:
                    animal = new Monkey("Tom", 1, "金丝猴");
                    System.out.println(((Monkey) animal).act());
                    break;
                case 4:
                    animal = new Parrot("Rose", 1, "牡丹鹦鹉");
                    System.out.println(((Parrot) animal).act());
                    break;
                case 5:
                    IACT clown = new Clown("Kahle", 5);
                    System.out.println(clown.act());
                    break;
                default:
                    System.out.println("******输入信息不正确，请重新输入*******");
                    break;
            }
            System.out.println("*********是否继续观看（1/0）**********");
            continueChoice = scanner.nextInt();
        } while (continueChoice != 0);
    }
}
