package part2_Java面向对象.chapter10_封装.Quiz1_7;

public class Book {
    //私有属性：书名、作者、出版社、价格
    String name;
    String author;
    String publish;
    double price;

    //通过构造方法实现属性赋值
    public Book(String name, String author, String publish, double price) {
        this.name = name;
        this.author = author;
        this.setPublish(publish);
        this.setPrice(price);
    }

    /*通过公有的get/set方法实现属性的访问，其中：
    1、限定图书价格必须大于10，如果无效需进行提示，并强制赋值为10
    2、限定作者、书名均为只读属性
    */
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 10) {
            System.out.println("图书价格最低10元");
            this.price = 10;
        } else {
            this.price = price;
        }
    }

    //信息介绍方法，描述图书所有信息
    public void bookInfo() {
        System.out.println("书名：" + this.getName());
        System.out.println("作者：" + this.getAuthor());
        System.out.println("出版社：" + this.getPublish());
        System.out.println("价格：" + this.getPrice() + "元");
    }
}
