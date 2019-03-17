package part3_Java常用工具类.chapter18_字符串.string;

public class ConstantPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        String str4 = new String("abc");
        System.out.println("str1和str2的equals比较：" + str1.equals(str2));
        System.out.println("str1和str3的equals比较：" + str1.equals(str3));
        System.out.println("str1和str4的equals比较：" + str1.equals(str4));
        System.out.println("str3和str4的equals比较：" + str3.equals(str4));
        System.out.println("=============================");
        System.out.println("str1和str2的==比较：" + (str1 == str2)); //常量池
        System.out.println("str1和str3的==比较：" + (str1 == str3));
        System.out.println("str1和str4的==比较：" + (str1 == str4));
        System.out.println("str3和str4的==比较：" + (str3 == str4));
    }
}
