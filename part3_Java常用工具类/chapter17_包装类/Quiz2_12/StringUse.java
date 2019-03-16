package part3_Java常用工具类.chapter17_包装类.Quiz2_12;

public class StringUse {
    public static void main(String[] args) {
        double a = 12.5;
        // 将基本类型转换为字符串
        String s = Double.toString(a);
        System.out.println("a转换为String型后+10的结果为：" + (s + 10));
        // 将字符串转换为基本类型
        String str = "2.8";
        //double b = Double.parseDouble(str);
        double d2 = Double.valueOf(str);
        System.out.println("str转换为double型后+10的结果为：" + (d2 + 10));
    }
}
