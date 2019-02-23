/**
 * TypeExchange
 */
public class TypeExchange {

    public static void main(String[] args) {
        // char类型和int类型之间的转换
        char c = (char) 65536;
        int n;
        //强制类型转换后c的值发生数据溢出，所以n的值为0
        n = c;
        System.out.println("c = " + c);
        System.out.println("n = " + n);
        // 整型和浮点型的类型转换问题
        int x = 100;
        long y = x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        // 数据精度丢失案例
        float f = 123456789123456789l;
        System.out.println("f = " + f);
    }
}