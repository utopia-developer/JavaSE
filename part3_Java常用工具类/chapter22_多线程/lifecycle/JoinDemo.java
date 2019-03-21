package part3_Java常用工具类.chapter22_多线程.lifecycle;

class CustomThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 500; i++) {
            System.out.println(Thread.currentThread().getName() + "正在运行" + i);
        }
    }
}

public class JoinDemo {
    public static void main(String[] args) {
        CustomThread customThread = new CustomThread();
        Thread thread1 = new Thread(customThread);
        thread1.start();
        //使用join()方法需要捕获InterruptedException，防止线程被意外打断
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread thread2 = new Thread(customThread);
        thread2.start();
        //1ms后无论是否线程thread2运行结束都将不再优先执行
        try {
            thread1.join(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("主线程运行" + i);
        }
        System.out.println("主线程运行结束");
    }
}
