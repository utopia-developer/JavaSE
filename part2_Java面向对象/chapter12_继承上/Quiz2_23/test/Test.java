package part2_Java面向对象.chapter12_继承上.Quiz2_23.test;

import part2_Java面向对象.chapter12_继承上.Quiz2_23.model.Bicycle;
import part2_Java面向对象.chapter12_继承上.Quiz2_23.model.ElectricVehicle;
import part2_Java面向对象.chapter12_继承上.Quiz2_23.model.NonMotor;
import part2_Java面向对象.chapter12_继承上.Quiz2_23.model.Tricycle;

public class Test {
    public static void main(String[] args) {
        NonMotor nonMotor = new NonMotor("天宇", "红", 4, 2);
        System.out.print("父类信息测试：");
        System.out.println(nonMotor.work());

        System.out.print("自行车类信息测试：");
        Bicycle bicycle = new Bicycle("捷安特", "黄");
        System.out.println(bicycle.work());

        System.out.print("电动车类信息测试：");
        ElectricVehicle electricVehicle = new ElectricVehicle("飞鸽牌");
        System.out.println(electricVehicle.work());

        System.out.print("三轮车类信息测试：");
        Tricycle tricycle = new Tricycle();
        System.out.println(tricycle.work());
    }
}
