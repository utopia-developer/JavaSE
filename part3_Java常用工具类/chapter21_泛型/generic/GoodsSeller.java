package part3_Java常用工具类.chapter21_泛型.generic;

import java.util.List;

public class GoodsSeller {
    public void sellGoods(List<? extends Goods> goods) {
        for (Goods good : goods) {
            good.sell();
        }
    }
}
