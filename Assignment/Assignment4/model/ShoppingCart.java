package Assignment.Assignment4.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ShoppingCart {
    Scanner scanner = new Scanner(System.in);

    private Map<String, GoodsInCart> map = new HashMap<>(); //购物车

    //无参构造方法
    public ShoppingCart() {

    }

    //getter/setter
    public Map<String, GoodsInCart> getMap() {
        return map;
    }

    public void setMap(Map<String, GoodsInCart> map) {
        this.map = map;
    }

    /**
     * 添加商品到购物车
     * 通过商品编号(GoodsId)进行指定对象添加
     * 当gm为空时给出提示并终止此方法的执行
     *
     * @param gm GoodsManage类对象
     */
    public void addGoodsToCart(GoodsManage gm) {
        if (gm.getSet().isEmpty()) {
            return;
        }
        System.out.println("所有商品信息为：");
        System.out.println("请输入要添加的商品编号：");
        String keyId = scanner.next();
        int num = 0;
        Iterator<Goods> iterator = gm.getSet().iterator();
        while (iterator.hasNext()) {
            /*
            extract iterator.next()
            防止出现多次取next出现NullPointerException
             */
            Goods next = iterator.next();
            if (next.getGoodsId().equals(keyId)) {
                System.out.println("请输入要添加的商品数量：");
                num = scanner.nextInt();
                GoodsInCart goodsInCart = new GoodsInCart(next, num);
                map.put(keyId, goodsInCart);
            }
        }
    }

    /**
     * 修改购物车中的商品数量
     * 商品数量为0时，将此商品从购物车中删除
     */
    public void updateNumInCart() {
        System.out.println("请输入要修改的商品编号：");
        String keyId = scanner.next();
        GoodsInCart goodsInCart = map.get(keyId);
        System.out.println("请输入新的商品数量：");
        int num = scanner.nextInt();
        if (num == 0) {
            System.out.println("因为商品数量为0，该商品已经从购物车中移除！");
            map.remove(keyId);
        }
        goodsInCart.setNum(num);
    }

    /**
     * 显示购物车中的所有商品
     * 当购物车为空时，给出相应提醒
     */
    public void displayAllInCart() {
        if (map.isEmpty()) {
            System.out.println("购物车是空的呦，赶快装满吧~");
        }
        for (Map.Entry<String, GoodsInCart> entry : map.entrySet()) {
            Goods goods = entry.getValue().getGoods();
            System.out.println("商品名称：" + goods.getGoodsName() + "， 商品价格：" + goods.getPrice() +
                    "，商品描述：" + goods.getGoodsDesp() + "，数量：" + entry.getValue().getNum());
        }
    }

    /**
     * 结算方法
     * 多种商品存在时进行累加和
     */
    public void settleAccounts() {
        double sumPrice = 0, goodsPrice;
        Iterator<GoodsInCart> iterator = map.values().iterator();
        while (iterator.hasNext()) {
            /*
            extract iterator.next()
            防止出现多次取next出现NullPointerException或出现程序逻辑错误
             */
            GoodsInCart next = iterator.next();
            goodsPrice = next.getNum() * next.getGoods().getPrice();
            sumPrice += goodsPrice;
        }
        System.out.println("商品的总价为：" + sumPrice);
    }
}
