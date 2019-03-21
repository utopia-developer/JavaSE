package part3_Java常用工具类.chapter22_多线程.thread;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + "正在执行" + i);
        }
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) {
        MyThread one = new MyThread("线程1");
        MyThread two = new MyThread("线程2");
        one.start();
        two.start();
    }
}
