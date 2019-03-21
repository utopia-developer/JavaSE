package part3_Java常用工具类.chapter21_泛型;

public class GenericMethod {
    public <T> void printValue(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.printValue("hello");
        genericMethod.printValue(123);
        genericMethod.printValue(5.6f);
    }
}
