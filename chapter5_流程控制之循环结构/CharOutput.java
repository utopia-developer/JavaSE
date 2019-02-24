/**
 * CharOutput 分两行循环输出26个英文字母
 */
public class CharOutput {

    public static void main(String[] args) {
        char ch = 'a';
        int count = 1;
        while (ch <= 'z') {
            System.out.print(ch + " | ");
            if (count % 13 == 0) {
                System.out.println();
            }
            ch++;
            count++;
        }
    }
}