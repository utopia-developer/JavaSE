package part3_Java常用工具类.chapter22_多线程.communication;

public class Test {
    public static void main(String[] args) {
        Queue queue = new Queue();
        new Thread(new Productor(queue)).start();
        new Thread(new Customer(queue)).start();

    }
}
