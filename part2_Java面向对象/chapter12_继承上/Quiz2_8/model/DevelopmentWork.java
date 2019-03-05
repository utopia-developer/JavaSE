package part2_Java面向对象.chapter12_继承上.Quiz2_8.model;

public class DevelopmentWork extends Work {
    // 属性：有效编码行数、目前没有解决的Bug个数
    private int codeLine;
    private int unfinishedBug;

    //编写构造方法，并调用父类相关赋值方法，完成属性赋值
    public DevelopmentWork(String name, int codeLine, int unfinishedBug) {
        super(name);
        this.setCodeLine(codeLine);
        this.setUnfinishedBug(unfinishedBug);
    }

    // 公有的get***/set***方法完成属性封装
    public int getCodeLine() {
        return codeLine;
    }

    public void setCodeLine(int codeLine) {
        this.codeLine = codeLine;
    }

    public int getUnfinishedBug() {
        return unfinishedBug;
    }

    public void setUnfinishedBug(int unfinishedBug) {
        this.unfinishedBug = unfinishedBug;
    }

    // 重写运行方法，描述内容为：**的日报是：今天编写了**行代码，目前仍然有**个bug没有解决。其中**的数据由属性提供
    @Override
    public String work() {
        String str = super.getName() + "的日报是：今天编写了" + this.getCodeLine() + "行代码，目前仍然有" +
                this.getUnfinishedBug() + "个bug没有解决";
        return str;
    }
}
