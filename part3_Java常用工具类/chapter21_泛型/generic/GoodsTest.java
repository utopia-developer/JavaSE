package part3_Java常用工具类.chapter21_泛型.generic;

import part2_Java面向对象.chapter10_封装.Quiz1_7.Book;

import java.util.ArrayList;
import java.util.List;

public class GoodsTest {
    public static void main(String[] args) {
        List<Books> books = new ArrayList<>();
        books.add(new Books());
        books.add(new Books());
        List<Clothes> clothes = new ArrayList<>();
        clothes.add(new Clothes());
        clothes.add(new Clothes());
        List<Shoes> shoes = new ArrayList<>();
        shoes.add(new Shoes());
        shoes.add(new Shoes());

        GoodsSeller seller = new GoodsSeller();
        seller.sellGoods(books);
    }
}
