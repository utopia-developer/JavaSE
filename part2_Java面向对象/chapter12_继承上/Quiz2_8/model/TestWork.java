package part2_Java面向对象.chapter12_继承上.Quiz2_8.model;

public class TestWork extends Work {
    //属性：编写的测试用例个数、发现的Bug数量
    private int testCase;
    private int bugNumber;

    // 编写构造方法，并调用父类相关赋值方法，完成属性赋值
    public TestWork(String name, int testCase, int bugNumber) {
        super(name);
        this.setTestCase(testCase);
        this.setBugNumber(bugNumber);
    }

    // 公有的get***/set***方法完成属性封装
    public int getTestCase() {
        return testCase;
    }

    public void setTestCase(int testCase) {
        this.testCase = testCase;
    }

    public int getBugNumber() {
        return bugNumber;
    }

    public void setBugNumber(int bugNumber) {
        this.bugNumber = bugNumber;
    }

    // 重写运行方法，描述内容为：**的日报是：今天编写了**个测试用例，发现了**bug。其中**的数据由属性提供
    @Override
    public String work() {
        String str = super.getName() + "的日报是：今天编写了" + this.getTestCase() + "个测试用例，发现了" +
                this.getBugNumber() + "个bug";
        return str;
    }
}
