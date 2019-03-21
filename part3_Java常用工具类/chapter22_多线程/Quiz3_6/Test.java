package part3_Java常用工具类.chapter22_多线程.Quiz3_6;

public class Test {
    public static void main(String[] args) {
        Letter letter = new Letter();
        Thread thread = new Thread(letter);
        thread.start();
    }
}
