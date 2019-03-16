package part3_Java常用工具类.chapter17_包装类.Quiz2_19;

public class HelloWorld {
    public static void main(String[] args) {
        //定义float类型变量，赋值为88.99
        float f1 = 88.99f;
        //将基本类型转换为字符串
        String s = Float.toString(f1);
        //打印输出
        System.out.println("f1转换为String型后与整数20的求和结果为：" + (s + 20));
        //定义String类型变量，赋值为"188.55"
        String str = "188.55";
        // 将字符串转换为基本类型double
        double d = Double.valueOf(str);
        //double d = Double.parseDouble(str);
        //打印输出
        System.out.println("str转换为double型后与整数20的求和结果为：" + (d + 20));
    }
}
