package part2_Java面向对象.chapter15_多态.Quiz6_10.test;

import part2_Java面向对象.chapter15_多态.Quiz6_10.model.Ball;
import part2_Java面向对象.chapter15_多态.Quiz6_10.model.BallTest;

//测试类
public class Test {

    public static void main(String[] args) {
        BallTest test = new BallTest();
        //完成成员内部类内部测试
        BallTest.Inner_m inner_m = test.new Inner_m();
        test.playBall(inner_m);
        //完成方法内部类测试
        test.info();
        //完成匿名内部类测试
        test.playBall(new Ball() {
            @Override
            public void play() {
                System.out.println("*******************");
                System.out.println("匿名内部类：");
                System.out.println("打排球");
            }
        });
    }

}
