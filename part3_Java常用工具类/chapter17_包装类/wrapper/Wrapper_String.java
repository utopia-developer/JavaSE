package part3_Java常用工具类.chapter17_包装类.wrapper;

public class Wrapper_String {
    public static void main(String[] args) {
        //基本数据类型转换为字符串类型
        int n1 = 2;
        String str = Integer.toString(n1);
        //测试
        System.out.println("int类型转换为String类型：" + str);
        System.out.println("*****************************");
        //字符串类型转换为基本数据类
        //方法一：
        int n2 = Integer.parseInt(str);
        //方法二：
        int n3 = Integer.valueOf(str);
        //测试
        System.out.println("String类型转换为int类型方法一：" + n2);
        System.out.println("String类型转换为int类型方法二：" + n3);
    }
}
