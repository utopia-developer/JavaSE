package Assignment.Assignment4.test;

import Assignment.Assignment4.model.GoodsManage;
import Assignment.Assignment4.model.ShoppingCart;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestDemo {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        TestDemo demo = new TestDemo();
        GoodsManage goodsManage = new GoodsManage();
        ShoppingCart shoppingCart = new ShoppingCart();
        demo.mainMenuManager(goodsManage, shoppingCart);
    }

    /**
     * 主菜单显示
     */
    public void mainMenu() {
        System.out.println("*************************");
        System.out.println("\t\t**主菜单**\t\t");
        System.out.println("\t\t1--商品管理");
        System.out.println("\t\t2--购物车");
        System.out.println("\t\t0--退出");
        System.out.println("*************************");
    }

    /**
     * 主菜单管理
     *
     * @param goodsManage
     * @param shoppingCart
     */
    private void mainMenuManager(GoodsManage goodsManage, ShoppingCart shoppingCart) {
        int choice = 0;
        //TODO: 异常处理可以优化
        /*
        在程序内部处理InputMismatchException
         */
        boolean flag;
        do {
            mainMenu();
            System.out.println("请输入对应数字进行操作：");
            do {
                try {
                    choice = scanner.nextInt();
                    flag = false;
                } catch (InputMismatchException e) {
                    flag = true;
                    System.out.println("输入错误，应输入数字，请重新输入：");
                    scanner.next();
                }
            } while (flag);
            switch (choice) {
                case 1:
                    goodsManageMenuManager(goodsManage);
                    break;
                case 2:
                    shoppingCartManager(shoppingCart, goodsManage);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("该数字没有对应的操作！");
            }
        } while (choice != 0);
    }

    /**
     * 商品管理菜单
     */
    public void goodsManageMenu() {
        System.out.println("**********************************");
        System.out.println("\t\t\t**商品管理**");
        System.out.println("\t\t1--商品信息导入");
        System.out.println("\t\t2--显示所有商品信息");
        System.out.println("\t\t9--返回上一级菜单");
        System.out.println("**********************************");
    }

    /**
     * 商品管理菜单管理
     *
     * @param goodsManage
     */
    public void goodsManageMenuManager(GoodsManage goodsManage) {
        int choice = 9;
        //TODO: 异常处理可以优化
        /*
        在程序内部处理InputMismatchException
         */
        boolean flag;
        do {
            goodsManageMenu();
            System.out.println("请输入对应数字对商品进行管理：");
            do {
                try {
                    choice = scanner.nextInt();
                    flag = false;
                } catch (InputMismatchException e) {
                    flag = true;
                    System.out.println("输入错误，应输入数字，请重新输入：");
                    scanner.next();
                }
            } while (flag);
            switch (choice) {
                case 1:
                    System.out.println("商品信息导入");
                    goodsManage.importGoods();
                    if (!(goodsManage.getSet().isEmpty())) {
                        System.out.println("导入成功！");
                    } else {
                        System.out.println("导入失败");
                    }
                    break;
                case 2:
                    System.out.println("显示所有商品信息");
                    goodsManage.displayAllGoods();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("该数字没有对应的操作！");
            }
        } while (choice != 9);
    }

    /**
     * 购物车菜单
     */
    public void shoppingCartMenu() {
        System.out.println("***********************************");
        System.out.println("\t\t\t**购物车管理**");
        System.out.println("\t\t1--添加商品到购物车");
        System.out.println("\t\t2--修改购物车中的商品数量");
        System.out.println("\t\t3--显示购物车中的所有商品信息");
        System.out.println("\t\t4--结算");
        System.out.println("\t\t9--返回上一级菜单");
        System.out.println("***********************************");
    }

    /**
     * 购物车菜单管理
     *
     * @param shoppingCart
     * @param goodsManage
     */
    public void shoppingCartManager(ShoppingCart shoppingCart, GoodsManage goodsManage) {
        int choice = 9;
        //TODO: 异常处理可以优化
        /*
        在程序内部处理InputMismatchException
         */
        boolean flag;
        do {
            shoppingCartMenu();
            System.out.println("请输入对应数字对购物车进行管理：");
            do {
                try {
                    choice = scanner.nextInt();
                    flag = false;
                } catch (InputMismatchException e) {
                    flag = true;
                    System.out.println("输入错误，应输入数字，请重新输入：");
                    scanner.next();
                }
            } while (flag);
            switch (choice) {
                case 1:
                    System.out.println("添加商品到购物车");
                    goodsManage.displayAllGoods();
                    shoppingCart.addGoodsToCart(goodsManage);
                    break;
                case 2:
                    System.out.println("修改购物车中的商品数量");
                    shoppingCart.updateNumInCart();
                    break;
                case 3:
                    System.out.println("显示购物车中的所有商品信息");
                    shoppingCart.displayAllInCart();
                    break;
                case 4:
                    System.out.println("结算：");
                    shoppingCart.settleAccounts();
                    shoppingCart.displayAllInCart();
                    /*
                    结算后默认清空购物车
                     */
                    shoppingCart.getMap().clear();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("该数字没有对应的操作！");
            }
        } while (choice != 9);
    }
}
