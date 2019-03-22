package part3_Java常用工具类.chapter22_多线程.Quiz5_3;

public class ReadWeather implements Runnable {
    Weather weather;

    public ReadWeather(Weather weather) {
        this.weather = weather;
    }

    @Override
    public void run() {
        while (true) {
            weather.read();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
