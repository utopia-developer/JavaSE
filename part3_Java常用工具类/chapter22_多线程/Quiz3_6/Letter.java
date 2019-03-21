package part3_Java常用工具类.chapter22_多线程.Quiz3_6;

public class Letter implements Runnable {
    private char[] letter = new char[26];
    private char ch = 'a';

    public Letter() {
        for (int i = 0; i < letter.length; i++) {
            letter[i] = ch;
            ch++;
        }
    }

    @Override
    public void run() {
        for (char ch : letter) {
            System.out.print(ch);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
