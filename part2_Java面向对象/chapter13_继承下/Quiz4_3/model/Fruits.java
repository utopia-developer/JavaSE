package part2_Java面向对象.chapter13_继承下.Quiz4_3.model;

public class Fruits {
    // 私有属性：水果的形状（shape）和口感（taste）
    private String shape;
    private String taste;

    public Fruits() {

    }

    // 带参构造函数（参数为shape和taste）
    public Fruits(String shape, String taste) {
        this.setShape(shape);
        this.setTaste(taste);
    }

    //通过封装实现对私有属性的get/set访问
    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    // 创建无参无返回值得方法eat（描述内容为：水果可供人们食用！）
    public void eat() {
        System.out.println("水果可供人们食用！");
    }

    // 重写equals方法，比较两个对象是否相等（比较shape，taste）
    //使用this和向下转型的obj进行比较
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        Fruits fruits = (Fruits) obj;
        if (this.getShape().equals(fruits.getShape()) && this.getTaste().equals(fruits.getTaste())) {
            return true;
        } else {
            return false;
        }
    }
}
