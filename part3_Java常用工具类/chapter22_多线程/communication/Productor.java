package part3_Java常用工具类.chapter22_多线程.communication;

public class Productor implements Runnable {
    Queue queue;

    public Productor(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            queue.setN(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
