package part3_Java常用工具类.chapter18_字符串.Quiz3_4;

public class StringTest {
    public static void main(String[] args) {
        //定义一个字符串"欢迎来到"
        StringBuilder stringBuilder = new StringBuilder("欢迎来到");
        //在"欢迎来到"后面添加内容，将字符串变成"欢迎来到imooc"
        System.out.println(stringBuilder.append("imooc"));
        //使用delete方法删除"欢迎来到",然后插入“你好，”
        //将字符串变成“你好，imooc”
        System.out.println("删除插入后：" + stringBuilder.delete(0, 4).insert(0, "你好，"));
        //使用replace方法替换
        System.out.println("替换后：" + stringBuilder.replace(0, 3, "欢迎来到"));
    }
}
