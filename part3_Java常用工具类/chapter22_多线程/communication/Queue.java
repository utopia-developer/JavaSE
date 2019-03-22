package part3_Java常用工具类.chapter22_多线程.communication;

public class Queue {
    private int n;
    private boolean flag = false; //代表容器中是否有数据

    public synchronized int getN() {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费：" + n);
        flag = false;
        notifyAll();//唤醒所有线程，防止出现死锁
        return n;
    }

    public synchronized void setN(int n) {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("生产：" + n);
        this.n = n;
        flag = true;
        notifyAll();//唤醒所有线程，防止出现死锁
    }
}
