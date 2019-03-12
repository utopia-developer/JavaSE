package part2_Java面向对象.chapter15_多态.test;

import part2_Java面向对象.chapter15_多态.Interface.INet;

public class InterfaceTest implements INet {
    public static final int TEMP = 30;

    @Override
    public void network() {
        System.out.println("上网");
    }

    @Override
    public void connection() {
        System.out.println("网络连接");
    }

    //默认方法重写，注意重写格式INet.super.tcp();
    @Override
    public void tcp() {
        INet.super.tcp();
    }

    public static void main(String[] args) {
        INet iNet = new InterfaceTest();
        iNet.connection();
        iNet.network();
        InterfaceTest interfaceTest = new InterfaceTest();
        //那个类型的实例调用，常量就是哪个类中的值
        //实际仍应类名调用，避免增加编译器解析负担的同时常量指代清晰
        System.out.println(interfaceTest.TEMP);
        System.out.println(iNet.TEMP);
        //接口中静态方法调用
        INet.stop();
        //接口中默认方法调用
        iNet.tcp();
    }
}
