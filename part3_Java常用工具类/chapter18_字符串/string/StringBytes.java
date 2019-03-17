package part3_Java常用工具类.chapter18_字符串.string;

import java.io.UnsupportedEncodingException;

public class StringBytes {
    public static void main(String[] args) {
        //getBytes(), getBytes(String charsetName)
        String string = new String("Java 编程");
        byte[] bytes = new byte[10];
        try {
            bytes = string.getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println("字符串转换为字节数组后：");
        for (byte b : bytes) {
            System.out.print(b + " ");
        }
        System.out.println();
        System.out.println("将字节数组转换为字符串：");
        String result = null;
        try {
            result = new String(bytes, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }
}
