package part3_Java常用工具类.chapter17_包装类.wrapper;

public class Wrapper {
    public static void main(String[] args) {
        //自动装箱
        int n1 = 2;
        Integer integer1 = n1;
        //手动装箱
        Integer integer2 = new Integer(n1);
        Integer integer3 = Integer.valueOf(n1);
        //装箱测试
        System.out.println("基本数据类型：" + n1);
        System.out.println("自动装箱包装类：" + integer1);
        System.out.println("手动装箱包装类1：" + integer2);
        System.out.println("手动装箱包装类2：" + integer3);
        System.out.println("=======================");

        //自动拆箱
        int n2 = integer1;
        //手动拆箱
        int n3 = integer1.intValue();
        double d = integer1.doubleValue();
        //拆箱测试
        System.out.println("自动拆箱：" + n2);
        System.out.println("手动拆箱：" + n3);
        System.out.println("手动拆箱为double类型：" + d);
    }
}
