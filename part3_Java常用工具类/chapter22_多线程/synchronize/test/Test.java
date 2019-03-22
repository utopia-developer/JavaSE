package part3_Java常用工具类.chapter22_多线程.synchronize.test;

import part3_Java常用工具类.chapter22_多线程.synchronize.model.Bank;
import part3_Java常用工具类.chapter22_多线程.synchronize.model.DrawAccount;
import part3_Java常用工具类.chapter22_多线程.synchronize.model.SaveAccount;

public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank("1001", 1000);
        SaveAccount saveAccount = new SaveAccount(bank);
        DrawAccount drawAccount = new DrawAccount(bank);
        saveAccount.start();
        drawAccount.start();
        try {
            saveAccount.join();
            drawAccount.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(bank);
    }
}
