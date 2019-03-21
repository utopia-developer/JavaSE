package part3_Java常用工具类.chapter22_多线程.Quiz2_8;

public class Cat implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + "A cat");
        }
    }
}
