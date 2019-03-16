package part3_Java常用工具类.chapter18_字符串.string;

public class StringMethod {
    public static void main(String[] args) {
        String str = "Java 编程 基础 Java";
        //length()
        System.out.println("str的长度为：" + str.length());
        //charAt(int index)
        System.out.println("输出str第7个位置的字符：" + str.charAt(6));
        //substring(int beginIndex)
        System.out.println("输出子串\"编程 基础\"：" + str.substring(5));
        //substring(int beginIndex, int endIndex), endIndex为想要的（index+1），即子串结束字符的下一个字符位置
        System.out.println("输出子串\"编程\"：" + str.substring(5, 7));
        //indexOf(int ch), 字符和int类型相互转换
        System.out.println("str中\'a\'字符第一次出现的位置：" + str.indexOf('a'));
        //indexOf(String str)
        System.out.println("str中\"Java\"子串第一次出现的位置：" + str.indexOf("Java"));
        //lastIndexOf(int ch)
        System.out.println("str中\'a\'字符最后一次出现的位置：" + str.lastIndexOf('a'));
        //lastIndexOf(String str)
        System.out.println("str中\"Java\"子串最后一次出现的位置：" + str.lastIndexOf("Java"));
    }
}
