package Assignment;

import java.util.Scanner;

public class Assignment1 {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * 插入数据
     *
     * @return 插入数据后的数组
     */
    // TODO: 2019/3/1 数据完成插入后不应该再允许使用该方法 
    public int[] insertData() {
        int[] array = new int[10];
        int insertNumber;
        for (int i = 0; i < array.length - 1; i++) {
            System.out.println("请输入第" + (i + 1) + "个数据：");
            insertNumber = scanner.nextInt();
            while (true) {
                if (insertNumber != 0) {
                    array[i] = insertNumber;
                    break;
                } else {
                    System.out.println("数据不能为0，请重新输入第" + (i + 1) + "个数据：");
                    insertNumber = scanner.nextInt();
                }
            }
        }
        return array;
    }

    /**
     * 显示所有数据
     *
     * @param a 要显示的数组
     */
    public void showData(int[] a, int length) {
        System.out.println("数组元素为：");
        for (int i = 0; i < length; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println();
    }

    /**
     * 在指定位置处插入数据
     *
     * @param a 要插入数据的数组
     * @param n 要插入的数据
     * @param k 要插入的位置（与数组下标相同）
     */
    // TODO: 2019/3/1 k的值可能illegal，需要判断
    // TODO: 2019/3/1 插入数据前需要判断数组是否已满 
    public void insertAtArray(int[] a, int n, int k) {
        for (int i = a.length - 1; i >= k; i--) {
            a[i] = a[i - 1];
        }
        a[k] = n;
    }

    /**
     * 查询能被3整除的数据
     *
     * @param a 操作的数组
     */
    public void divThree(int[] a) {
        int number = 0;
        System.out.print("数组中能被3整除的元素为：");
        for (int n : a) {
            if (n % 3 == 0 && n != 0) {
                System.out.print(n + "  ");
                number++;
            }
        }
        if (number == 0) {
            System.out.print("无");
        }
        System.out.println();
    }

    /**
     * 显示提示信息
     */
    public void notice() {
        System.out.println("*************************************************");
        System.out.println("\t\t1--插入数据");
        System.out.println("\t\t2--显示所有数据");
        System.out.println("\t\t3--在指定位置处插入数据");
        System.out.println("\t\t4--插入数据");
        System.out.println("\t\t0--退出");
        System.out.println("*************************************************");
    }

    // TODO: 2019/3/1 需要进一步对main方法进行封装 
    public static void main(String[] args) {
        Assignment1 assignment = new Assignment1();
        int[] array = new int[10];
        int choice;
        do {
            assignment.notice();
            System.out.println("请输入对应的数字进行操作：");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    array = assignment.insertData();
                    assignment.showData(array, 9);
                    break;
                case 2:
                    int length;
                    if (array[array.length - 1] == 0) {
                        length = 9;
                    } else {
                        length = 10;
                    }
                    assignment.showData(array, length);
                    break;
                case 3:
                    System.out.println("请输入要插入的数据：");
                    int insert = scanner.nextInt();
                    int n;
                    while (true) {
                        if (insert != 0) {
                            n = insert;
                            break;
                        } else {
                            System.out.println("数据不能为0，请重新输入：");
                            insert = scanner.nextInt();
                        }
                    }
                    System.out.println("请输入要插入数据的位置：");
                    int k = scanner.nextInt();
                    assignment.insertAtArray(array, n, k);
                    assignment.showData(array, 10);
                    break;
                case 4:
                    assignment.divThree(array);
                    break;
                default:
                    System.out.println("输入错误, 请重新输入");
            }
        } while (choice != 0);
    }
}
