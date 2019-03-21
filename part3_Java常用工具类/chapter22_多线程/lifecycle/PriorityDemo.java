package part3_Java常用工具类.chapter22_多线程.lifecycle;

class PriorityThread extends Thread {
    private String name;

    public PriorityThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + "线程正在运行" + i);
        }
    }
}

public class PriorityDemo {
    public static void main(String[] args) {
        System.out.println("主线程优先级为：" + Thread.currentThread().getPriority());

        PriorityThread thread1 = new PriorityThread("线程1");
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        System.out.println("线程1的优先级为：" + thread1.getPriority());
        PriorityThread thread2 = new PriorityThread("线程2");
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread2.start();
        System.out.println("线程2的优先级为：" + thread2.getPriority());
    }
}
