package part3_Java常用工具类.chapter20_集合排序.Quiz4_4;

//实现Comparable接口
public class Employee implements Comparable<Employee> {
    //成员变量
    private String id;
    private String name;
    private double wage;

    //构造方法
    public Employee(String id, String name, double wage) {
        this.setId(id);
        this.setName(name);
        this.setWage(wage);
    }

    //getter和setter方法
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getWage() {
        return this.wage;
    }

    //toString()方法
    @Override
    public String toString() {
        return "员工[编号：" + this.getId() + "，姓名：" + this.getName() + "，工资：" + this.getWage() + "]";
    }

    @Override
    public int compareTo(Employee e) {
        int num = ((Double) (e.getWage() - this.getWage())).intValue();
        return num;

    }
}
