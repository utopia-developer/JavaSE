package part3_Java常用工具类.chapter22_多线程.Quiz2_8;

public class Test {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("main thread");
        }
        Cat cat = new Cat();
        Thread thread1 = new Thread(cat);
        Dog dog = new Dog();
        Thread thread2 = new Thread(dog);
        thread1.start();
        thread2.start();
    }
}
