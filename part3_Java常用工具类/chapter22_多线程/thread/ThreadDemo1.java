package part3_Java常用工具类.chapter22_多线程.thread;

class CustomThread extends Thread {
    @Override
    public void run() {
        System.out.println(getName() + "该线程正在执行");
    }
}

public class ThreadDemo1 {
    public static void main(String[] args) {
        System.out.println("主线程1");
        CustomThread thread = new CustomThread();
        //启动线程，一个线程只能启动一次，多次启动会出现IllegalThreadStateException
        thread.start();
        System.out.println("主线程2");
    }
}
