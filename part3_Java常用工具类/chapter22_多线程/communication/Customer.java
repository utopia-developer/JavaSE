package part3_Java常用工具类.chapter22_多线程.communication;

public class Customer implements Runnable {
    Queue queue;

    public Customer(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            queue.getN();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
