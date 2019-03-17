package part3_Java常用工具类.chapter18_字符串.string;

public class StringImmutability {
    public static void main(String[] args) {
        //字符串的不可变性，即运算后会指向新的内存空间
        //str1的内容更新，实际上hasCode已经改变，即不是同一块内存空间
        String str1 = "abc";
        System.out.println(str1.hashCode());
        System.out.println("字符串的内容为：" + str1);
        str1 = str1 + "def";
        System.out.println(str1.hashCode());
        System.out.println("字符串的内容更新后为：" + str1);
    }
}
