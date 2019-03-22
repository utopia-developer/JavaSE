package part3_Java常用工具类.chapter22_多线程.synchronize.model;

public class DrawAccount extends Thread {
    Bank bank;

    public DrawAccount(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        bank.drawAccount();
    }
}
