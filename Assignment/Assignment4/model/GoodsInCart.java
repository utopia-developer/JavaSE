package Assignment.Assignment4.model;

public class GoodsInCart {
    private Goods goods; //商品信息
    private int num; //商品数量

    //构造方法传入所有参数
    public GoodsInCart(Goods goods, int num) {
        this.setGoods(goods);
        this.setNum(num);
    }

    //getter/setter
    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
