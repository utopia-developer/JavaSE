package part3_Java常用工具类.chapter22_多线程.runnable;

class MyRunnable implements Runnable {
    int i = 1;

    @Override
    public void run() {
        while (i <= 10) {
            System.out.println(Thread.currentThread().getName() + "正在运行" + i);
            i++;
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        /*
        假如多个Thread类实现同一个Runnable接口，则这些生成的线程会共享run方法中的代码
        ，适用于多个线程处理一个事件
         */
        MyRunnable runnable1 = new MyRunnable();
        Thread thread1 = new Thread(runnable1);
        thread1.start();
//        MyRunnable runnable2 = new MyRunnable();
//        Thread thread2 = new Thread(runnable2);
        Thread thread2 = new Thread(runnable1);
        thread2.start();
    }
}
