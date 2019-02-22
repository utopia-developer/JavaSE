/**
 * CharDemo
 */
public class CharDemo {

    public static void main(String[] args) {
        // 定义一个变量存放字符值
        char a = 'a';
        System.out.println("a = " + a);
        // 使用ASCII码进行赋值
        char ch = 65;
        System.out.println("ch = " + ch);
        // 若字面值超出char类型的数据范围，需要进行强制类型转换
        char c = (char) 65536;
        System.out.println("c = " + c);
        //定义char类型变量存放Unicode编码表示的字符
        char uni = '\u005d';
        System.out.println("uni = " + uni);
    }
}