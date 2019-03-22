package part3_Java常用工具类.chapter22_多线程.Quiz5_3;

public class WeatherTest {
    public static void main(String[] args) {
        Weather weather = new Weather();
        new Thread(new GenerateWeather(weather)).start();
        new Thread(new ReadWeather(weather)).start();
    }
}
