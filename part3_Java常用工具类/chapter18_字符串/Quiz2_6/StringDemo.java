package part3_Java常用工具类.chapter18_字符串.Quiz2_6;

public class StringDemo {

    public static void main(String[] args) {
		/*已知字符串"abcdefg"，使之经过处理得到字符串"CDE",并进一步
        将“DE”替换为“MM”，得到结果：CMM */
        String str = "abcdefg";
        String str1 = str.substring(2, 5).toUpperCase();
        //String str2 = str1.replace("DE", "MM");
        String str2 = str1.replace(str1.substring(1, 3), "MM");
        System.out.println(str2);
    }
}
