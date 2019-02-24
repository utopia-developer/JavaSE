/**
 * Quiz3_9
 */
public class Quiz3_9 {

    public static void main(String[] args) {
        // 定义一个字符变量并初始化
        char ch = 'a';
        // 使用switch结构判断是否为元音字母，并输出对应的信息
        switch (ch) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            System.out.println("元音字母" + ch);
            break;
        default:
            System.out.println("不是元音字母");
        }
    }
}