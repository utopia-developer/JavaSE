package Assignment.Assignment4.model;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GoodsManage {
    private Set<Goods> set = new HashSet<>(); //存放商品的容器

    //无参构造方法
    public GoodsManage() {

    }

    //getter/setter
    public Set<Goods> getSet() {
        return set;
    }

    public void setSet(Set<Goods> set) {
        this.set = set;
    }

    /**
     * 导入商品信息
     */
    public void importGoods() {
        Goods one = new Goods("goods001", "水杯", 56.0, "不锈钢水杯");
        Goods two = new Goods("goods002", "饮水机", 299.0, "带净化功能的饮水机");
        Goods three = new Goods("goods003", "笔记本电脑", 4999.0, "15寸笔记本电脑");
        Goods four = new Goods("goods004", "手机", 2300.0, "android手机");
        set.add(one);
        set.add(two);
        set.add(three);
        set.add(four);
    }

    /**
     * 显示所有商品信息
     * 当商品信息未导入时提示并终止此方法执行
     */
    public void displayAllGoods() {
        if (set.isEmpty()) {
            System.out.println("还没有商品，记得导入商品信息呦！");
            return;
        }
        System.out.println("所有商品信息为：");
        Iterator<Goods> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
