package part3_Java常用工具类.chapter18_字符串.Quiz4_3;

public class StringDemo {

    public static void main(String[] args) {
        //定义字符串"abc"
        StringBuilder stringBuilder = new StringBuilder("abc");
        //经过处理得到字符串"fed---cba"
        System.out.println(stringBuilder.reverse().insert(0, "fed---"));
        //进一步变换得到字符串"fedcba"
        System.out.println(stringBuilder.delete(3, 6));
    }
}
