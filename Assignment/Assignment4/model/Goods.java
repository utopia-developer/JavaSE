package Assignment.Assignment4.model;

public class Goods {
    private String goodsId; //商品编号
    private String goodsName; //商品名称
    private double price; //商品价格
    private String goodsDesp; //商品描述

    //构造方法传入所有参数
    public Goods(String goodsId, String goodsName, double price, String goodsDesp) {
        this.setGoodsId(goodsId);
        this.setGoodsName(goodsName);
        this.setPrice(price);
        this.setGoodsDesp(goodsDesp);
    }

    //getter/setter
    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGoodsDesp() {
        return goodsDesp;
    }

    public void setGoodsDesp(String goodsDesp) {
        this.goodsDesp = goodsDesp;
    }

    //重写toString方法
    @Override
    public String toString() {
        return "商品信息[" +
                "编号：" + goodsId +
                ", 名称：" + goodsName +
                ", 价格：" + price +
                ", 描述：" + goodsDesp +
                ']';
    }

    //重写equals方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Goods goods = (Goods) o;

        if (Double.compare(goods.getPrice(), getPrice()) != 0) return false;
        if (getGoodsId() != null ? !getGoodsId().equals(goods.getGoodsId()) : goods.getGoodsId() != null) return false;
        if (getGoodsName() != null ? !getGoodsName().equals(goods.getGoodsName()) : goods.getGoodsName() != null)
            return false;
        return getGoodsDesp() != null ? getGoodsDesp().equals(goods.getGoodsDesp()) : goods.getGoodsDesp() == null;
    }

    //重写hashCode方法
    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getGoodsId() != null ? getGoodsId().hashCode() : 0;
        result = 31 * result + (getGoodsName() != null ? getGoodsName().hashCode() : 0);
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getGoodsDesp() != null ? getGoodsDesp().hashCode() : 0);
        return result;
    }
}
