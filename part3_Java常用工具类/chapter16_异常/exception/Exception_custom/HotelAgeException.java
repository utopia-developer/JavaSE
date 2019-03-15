package part3_Java常用工具类.chapter16_异常.exception.Exception_custom;

public class HotelAgeException extends Exception {
    public HotelAgeException() {
        super("无法办理入住，需要他人陪同");
    }
}
