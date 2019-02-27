/**
 * Quiz2_4
 */
public class Quiz2_4 {
    // 根据商品总价输出折后总价
    public double getPrice(double price) {
        double priceAfter = price;
        if (price > 200) {
            priceAfter = price * 0.85;
        } else if (price >= 100) {
            priceAfter = price * 0.95;
        }
        return priceAfter;
    }

    public static void main(String[] args) {
        // 定义对象
        Quiz2_4 quiz = new Quiz2_4();
        // 定义商品总价存放到变量中
        double price = 150;
        // 调用方法，输出折后商品总价
        System.out.println("折后商品总价为：" + quiz.getPrice(price));
    }
}