package part3_Java常用工具类.chapter18_字符串.stringbuilder;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        //字符串添加
        //append(char c); append(String str) ...
        System.out.println(str.append(',').append(" World!"));

        //字符串替换
        //方法一：delete(int start, int end); insert(int offset, String str)
        //insert方法中的offset为偏移量，大于等于0小于等于length
        StringBuilder str1 = str.delete(8, 12).insert(8, "ORLD");
        System.out.println(str1);
        //方法二：replace(int start, int end, String str)
        StringBuilder str2 = str.replace(8, 12, "ORLD");
        System.out.println(str2);

        //取子串
        System.out.println(str.substring(0, 5));
    }
}
