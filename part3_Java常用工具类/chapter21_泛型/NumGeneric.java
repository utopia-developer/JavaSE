package part3_Java常用工具类.chapter21_泛型;

//自定义泛型类
public class NumGeneric<T> {
    private T num;

    public T getNum() {
        return num;
    }

    public void setNum(T num) {
        this.num = num;
    }

    public static void main(String[] args) {
        NumGeneric<Integer> integerNumGeneric = new NumGeneric<>();
        integerNumGeneric.setNum(10);
        System.out.println("Integer：" + integerNumGeneric.getNum());

        NumGeneric<Float> floatNumGeneric = new NumGeneric<>();
        floatNumGeneric.setNum(2.5f);
        System.out.println("Float：" + floatNumGeneric.getNum());
    }
}
