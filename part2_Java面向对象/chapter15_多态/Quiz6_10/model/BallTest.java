package part2_Java面向对象.chapter15_多态.Quiz6_10.model;

//创建类BallTest
public class BallTest {
    // 创建成员内部类Inner_m
    public class Inner_m implements Ball {
        @Override
        public void play() {
            System.out.println("成员内部类：");
            System.out.println("打篮球");
        }
    }

    // 创建方法内部类
    public void info() {
        class Inner_f implements Ball {
            @Override
            public void play() {
                System.out.println("*******************");
                System.out.println("方法内部类：");
                System.out.println("打乒乓球");
            }
        }
        new Inner_f().play();
    }

    // 定义一个方法void playBall(Ball ball)，调用play()方法
    public void playBall(Ball ball) {
        ball.play();
    }
}
