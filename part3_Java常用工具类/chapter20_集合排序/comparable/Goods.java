package part3_Java常用工具类.chapter20_集合排序.comparable;

public class Goods implements Comparable<Goods> {
    private String id;
    private String name;
    private double price;

    public Goods(String id, String name, double price) {
        this.setId(id);
        this.setName(name);
        this.setPrice(price);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "[商品编号：" + id +
                ", 商品名称：" + name +
                ", 商品价格：" + price +
                ']';
    }

    /**
     * 对价格进行降序排列
     * 当两个price的差小于1时，n会等于0，需要进一步判断
     */
    @Override
    public int compareTo(Goods o) {
        int n = ((Double) (o.getPrice() - this.getPrice())).intValue();
        return n;
    }
}
