package part3_Java常用工具类.chapter22_多线程.Quiz2_5;

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("打印机正在打印" + i);
        }
    }
}

public class Quiz {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
