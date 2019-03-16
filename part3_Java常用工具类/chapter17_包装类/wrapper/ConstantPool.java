package part3_Java常用工具类.chapter17_包装类.wrapper;

public class ConstantPool {
    public static void main(String[] args) {
        Integer one = new Integer(100);
        Integer two = new Integer(100);
        //比较引用，两个对象都是new出来的，false
        System.out.println("one和two比较：" + (one == two));

        Integer three = 127;
        //自动拆包参与运算，true
        System.out.println("three和100比较：" + (three == 127));

        Integer four = 127;
        //对象常量池，-128到127之间（包含-128和127），直接生成four，true
        System.out.println("three和four比较：" + (three == four));

        Integer five = 128;
        Integer six = 128;
        //对象常量池，超出范围，隐式new生成，所以five和six的引用不同，false
        System.out.println("five和six比较：" + (five == six));

        Double seven = 127.0;
        Double eight = 127.0;
        //Float和Double没有对象常量池概念，所以都是隐式new生成，false
        System.out.println("seven和eight比较：" + (seven == eight));
    }
}
