package part3_Java常用工具类.chapter22_多线程.Quiz5_3;

public class Weather {
    private int temperature;
    private int humidity;
    private boolean flag = false;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public synchronized void generate() {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setTemperature((int) (Math.random() * 40 + 1));
        this.setHumidity((int) (Math.random() * 100 + 1));
        System.out.println("生成天气数据" + this);
        flag = true;
        notifyAll();
    }

    public synchronized void read() {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("读取天气数据" + this);
        flag = false;
        notifyAll();
    }

    @Override
    public String toString() {
        return '[' + "温度：" + temperature +
                ", 湿度：" + humidity + ']';
    }
}
