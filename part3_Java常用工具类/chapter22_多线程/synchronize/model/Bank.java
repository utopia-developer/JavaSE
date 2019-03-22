package part3_Java常用工具类.chapter22_多线程.synchronize.model;

public class Bank {
    private String account;
    private int balance;

    public Bank(String account, int balance) {
        this.setAccount(account);
        this.setBalance(balance);
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getBalance() {
        return balance;
    }

    public synchronized void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "account='" + account + '\'' +
                ", balance=" + balance +
                '}';
    }

    public synchronized void saveAccount() {
        int balance = getBalance();
        balance += 100;
        //模拟异常中断
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setBalance(balance);
        System.out.println("存款后账户余额为：" + balance);
    }

    public void drawAccount() {
        synchronized (this) {
            int balance = getBalance();
            balance -= 200;
            //模拟异常中断
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            setBalance(balance);
            System.out.println("取款后账户余额为：" + balance);
        }
    }
}
